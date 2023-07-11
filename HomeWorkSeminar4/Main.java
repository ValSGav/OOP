package HomeWorkSeminar4;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Black", "what", 4);
        Cat cat = new Cat("white", "is", 4, 10);


        FileRepository<Dog> fileRepDog = new FileRepository<Dog>(new Dog());
        FileRepository<Cat> fileRepCat = new FileRepository<Cat>(new Cat());

        //добавление записей разных типов в пепозитории соотвествующих типов
        fileRepDog.addObjectToDb(dog);
        fileRepCat.addObjectToDb(cat);


        // не придумал ничего лучше, чем обновлять объект БД по id
        // полями экземпляра класса
        Cat cat2 = new Cat("", "", 4, 5);
        cat2.setAge(4);
        cat2.setName("Kitty");
        cat2.setVaccination("is vaccinated");

        //полуаем все id из базы данных
        List<Integer> ids = fileRepCat.getAllIdFromDb();
        List<Integer> idsDog = fileRepDog.getAllIdFromDb();

        // получаем все объекты из базы данных
        for (Integer id : ids) {
            System.out.println(fileRepCat.getObjectFromDb(id));
        }

        for (Integer id : idsDog) {
            System.out.println(fileRepDog.getObjectFromDb(id));
        }

        //когда в базу набивается больше чем 3 записи,
        //будем обновлять 3 запись
        if (ids.size() > 3) {
            fileRepCat.renewObjectInDb(ids.get(2), cat2);
        }

        //когда в базу набивается больше чем 5 записей,
        //будем удалять первую
        if (ids.size() > 5) {
            fileRepCat.deleteObjectFromFile(ids.get(0));
        }
    }

}
