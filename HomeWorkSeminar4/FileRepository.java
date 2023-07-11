package HomeWorkSeminar4;

import java.io.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import java.util.Map;

public class FileRepository<T extends Animal> {

    boolean isFileInit;
    File file;

    //не придумал ничего лучше, чем инициализировать репозиторий любым объектом
    //класса, который будет указан в обобщении
    public FileRepository(T object) {
        file = initFileDB(object.getClass().getSimpleName());
    }

    public File initFileDB(String fileName) {
        String fullFileName = fileName + ".txt";
        File initFile = new File(fullFileName);
        try {
            if (!initFile.exists()) {
                isFileInit = initFile.createNewFile();
            } else
                isFileInit = true;

        } catch (IOException except) {
            System.out.println(except.getMessage());
            isFileInit = false;
        }
        return initFile;
    }

    public boolean addObjectToDb(T object) {

        if (isFileInit) {
            List<Map<String, String>> db = getDbFromFile();

            // проверяем что в бд нет элемента с таким id
            for (Map<String, String> item : db) {
                if (Integer.parseInt(item.get("id")) == object.getId()) {
                    System.out.println(String.format("Невозможно довабить запись. Объект с id %d уже есть в файле!", object.getId()));
                    return false;
                }
            }
            // записываем строку представление объекта в файл
            setDbToFile(object.getMapOfThisObject());
            return true;

        } else {
            System.out.println("Невозможно добавить запись. Не был инициализирован файл базы данных!");
            return false;
        }

    }

    public boolean renewObjectInDb(int id, T object) {

        if (isFileInit) {
            List<Map<String, String>> db = getDbFromFile();
            for (Map<String, String> item : db) {
                if (Integer.parseInt(item.get("id")) == id) {
                    item.putAll(object.getMapOfThisObject());
                    item.put("id", Integer.toString(id));
                }
            }
            setDbToFile(db);
            return true;
        } else {
            System.out.println("Невозможно добавить запись. Не был инициализирован файл базы данных!");
            return false;
        }
    }

    public boolean deleteObjectFromFile(int id) {

        if (isFileInit) {
            List<Map<String, String>> db = getDbFromFile();

            for (Map<String, String> item : db) {
                if (Integer.parseInt(item.get("id")) == id) {
                    db.remove(item);
                    setDbToFile(db);
                    return true;
                }
            }

        } else {
            System.out.println("Невозможно удалить запись. Не был инициализирован файл базы данных!");
        }
        return false;
    }

    public Map<String, String> getObjectFromDb(int id) {
        //читаем все объекты из файла в лист мэпов для удобства работы
        if (isFileInit) {
            List<Map<String, String>> db = getDbFromFile();
            for (Map<String, String> item : db) {
                if (Integer.parseInt(item.get("id")) == id) {
                    return item;
                }
            }

        } else {
            System.out.println("Невозможно добавить запись. Не был инициализирован файл базы данных!");
            return new HashMap<String, String>();
        }
        return new HashMap<String, String>();
    }


    private List<Map<String, String>> getDbFromFile() {

        List<Map<String, String>> db = new LinkedList<Map<String, String>>();
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String stringLine = br.readLine();
            while (stringLine != null) {
                db.add(T.convertStringDataToMap(stringLine));
                stringLine = br.readLine();
            }
            br.close();

        } catch (IOException except) {
            System.out.println(except.getMessage());
        }
        return db;

    }

    private void setDbToFile(List<Map<String, String>> db) {
        try {
            FileWriter fw = new FileWriter(file, false);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pv = new PrintWriter(bw);
            for (Map<String, String> item : db) {
                pv.println(T.convertMapDataToString(item));
            }
            pv.close();
            bw.close();
            fw.close();
        } catch (IOException except) {
            System.out.println(except.getMessage());
        }
    }

    private void setDbToFile(Map<String, String> db) {
        try {
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pv = new PrintWriter(bw);

            pv.println(T.convertMapDataToString(db));

            pv.close();
            bw.close();
            fw.close();
        } catch (IOException except) {
            System.out.println(except.getMessage());
        }
    }

    public List<Integer> getAllIdFromDb() {
        List<Integer> returnList = new LinkedList<Integer>();
        List<Map<String, String>> db = getDbFromFile();
        for (Map<String, String> item : db
        ) {
            returnList.add(Integer.parseInt(item.get("id")));
        }
        return returnList;
    }
}

