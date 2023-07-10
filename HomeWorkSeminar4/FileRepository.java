package HomeWorkSeminar4;

import java.io.*;

public class FileRepository<T> {

    private File file;
    private boolean isOpen;


    public FileRepository() {
        String fileName = "//" + ((T) new Object().getClass().getSimpleName() + ".txt");

        File file = new File(fileName);
        try {
            if (!file.exists()) {
                isOpen = file.createNewFile();
            } else {
                isOpen = true;
            }
        } catch (IOException except) {
            System.out.println(except.getMessage());
        }
    }

    public boolean addObjectToFile(T object) {
        if (isOpen) {
            try {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);

                String stringLine = br.readLine();


                return true;
            } catch (FileNotFoundException except) {
                System.out.println(String.format("Невозможно довабить запись. Ошибка работы с файлом базы данных: %s"
                                                    + except.getMessage()));
                return false;
            } catch (IOException except){
                System.out.println(String.format("Невозможно довабить запись. Ошибка работы с файлом базы данных: %s"
                        + except.getMessage()));
            }

        } else {
            System.out.println("Невозможно добавить запись. Не был инициализирован файл базы данных!");
            return false;
        }
        }
    }
}
