package HomeWorkSeminar5.src.notebook.repository.impl;

import HomeWorkSeminar5.src.notebook.mapper.impl.UserMapper;
import HomeWorkSeminar5.src.notebook.model.User;
import HomeWorkSeminar5.src.notebook.repository.GBRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository implements GBRepository<User, Long, String> {
    private final UserMapper mapper;
    private final String fileName;
    private final List<User> workUserList;

    public UserRepository(String fileName) {
        workUserList = new ArrayList<User>();
        this.mapper = new UserMapper();
        this.fileName = fileName;
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.flush();
            for (String currenLine : readAll()) {
                workUserList.add(this.mapper.toOutput(currenLine));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<User> findAll() {
        return workUserList;
    }

    @Override
    public User create(User user) {
        long max = 0L;
        for (User u : workUserList) {
            long id = u.getId();
            if (max < id) {
                max = id;
            }
        }
        long next = max + 1;
        user.setId(next);
        workUserList.add(user);
        return user;
    }

    @Override
    public Optional<User> findById(Long id) {
        for (User user : workUserList
        ) {
            if (user.getId() == id) {
                return Optional.ofNullable(user);
            }
        }
        return Optional.empty();
    }

    @Override
    public Optional<User> update(Long id, User user) {
        for (User currentData : workUserList) {
            if (currentData.getId() == user.getId()) {
                currentData.setId(id);
                currentData.setFirstName(user.getFirstName());
                currentData.setLastName(user.getLastName());
                currentData.setPhone(user.getPhone());
                return Optional.ofNullable(currentData);
            }
        }
        return Optional.empty();
    }

    @Override
    public boolean delete(Long id) {
        try {
            System.out.println(findById(id));
            workUserList.remove(findById(id).get());
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public List<String> readAll() {
        List<String> lines = new ArrayList<>();
        try {
            File file = new File(fileName);
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            if (line != null) {
                lines.add(line);
            }
            while (line != null) {
                // считываем остальные строки в цикле
                line = reader.readLine();
                if (line != null) {
                    lines.add(line);
                }
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    //Переделал метод saveAll, чтобы сохранять workUserList в базу данных(в файл)
    @Override
    public void saveAll() {
        try (FileWriter writer = new FileWriter(fileName, false)) {
            for (User item : workUserList) {
                // запись всей строки
                writer.write(mapper.toInput(item));
                // запись по символам
                writer.append('\n');
            }
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
