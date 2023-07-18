package Seminar5_1.notebook.repository.impl;

import Seminar5_1.notebook.dao.impl.FileOperation;
import Seminar5_1.notebook.mapper.impl.UserMapper;
import Seminar5_1.notebook.model.User;
import Seminar5_1.notebook.repository.GBRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository implements GBRepository<User, Long> {
    private final UserMapper mapper;
    private final FileOperation operation;

    public UserRepository(FileOperation operation) {
        this.mapper = new UserMapper();
        this.operation = operation;
    }

    @Override
    public List<User> findAll() {
        List<String> lines = operation.readAll();
        List<User> users = new ArrayList<>();
        for (String line : lines) {
            users.add(mapper.toOutput(line));
        }
        return users;
    }

    @Override
    public User create(User user) {
        List<User> users = findAll();
        long max = 0L;
        for (User u : users) {
            long id = u.getId();
            if (max < id) {
                max = id;
            }
        }
        long next = max + 1;
        user.setId(next);
        users.add(user);
        List<String> lines = new ArrayList<>();
        for (User u : users) {
            lines.add(mapper.toInput(u));
        }
        operation.saveAll(lines);
        return user;
    }

    @Override
    public Optional<User> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<User> update(Long id, User user) {
        return Optional.empty();
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
