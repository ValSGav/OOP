package ru.gb.lessons.interfaces;

import ru.gb.lessons.interfaces.core.VetClinic;
import ru.gb.lessons.interfaces.core.clients.Animals;
import ru.gb.lessons.interfaces.core.clients.home.impl.Cat;
import ru.gb.lessons.interfaces.core.clients.owners.Owner;
import ru.gb.lessons.interfaces.core.clients.wild.impl.Duck;
import ru.gb.lessons.interfaces.core.clients.wild.impl.Pigeon;
import ru.gb.lessons.interfaces.core.clients.wild.impl.WildCat;
import ru.gb.lessons.interfaces.core.clients.home.impl.Dog;
import ru.gb.lessons.interfaces.core.clients.home.impl.Petfish;

import java.time.LocalDate;
import java.util.List;

/**
 Небольшая шпаргалка по синтаксису java:

 1) Названия классов в java - существительные с большой буквы верблюжьей нотацией: CamelCase;
 2) названия методов - отглагольные, с маленькой буквы, верблюжьей нотацией: getUserById;
 3) Названия переменных - существительные с маленькой буквы, верблюжьей нотацией: maxCount;
 4) названия пакетов в java существительные, всегда с маленькой буквы и в одно слово;
 -! Если логика классов внутри пакета не позволяет назвать все в одно существительное, надо вложить один пакет в другой.
 */
public class Main {
    public static void main(String[] args) {
        
        VetClinic clinic = new VetClinic();

        
        
        
        Cat homeCat =
                new Cat(2, "Tom", 4, LocalDate.of(2022, 4,13), new Owner("Ivanov Ivan"));

        WildCat wildCat =
                new WildCat(
                        1, 4, LocalDate.of(2023, 1, 5), new Owner("incognito"));

        homeCat.hunt();
        homeCat.makeASound();
        homeCat.run();
        
        wildCat.hunt();
        wildCat.makeASound();
        wildCat.run();

        Dog dog = new Dog();
        dog.setName("Sharic");
        System.out.println(dog);

        Pigeon pigeon = new Pigeon(0, null, null);
        pigeon.fly();
        pigeon.makeASound();

        Duck duck = new Duck(0, null, null);
        duck.makeASound();
        duck.swim();
        duck.fly();

        Petfish petfish = new Petfish(0, "Петушок", LocalDate.of(2022, 7, 3), new Owner("Петров Петр"));
        petfish.swim();

        clinic.addAnimal(homeCat);
        clinic.addAnimal(wildCat);
        clinic.addAnimal(dog);
        clinic.addAnimal(duck);
        clinic.addAnimal(petfish);
        clinic.addAnimal(pigeon);

        System.out.println("____________________________");
        System.out.println("Все животные клиники:");
        for (Animals animal : clinic.getAllAnimals()) {
            System.out.println(animal.toString());
        }
        System.out.println("____________________________");
        System.out.println("Летающие животные клиники:");        
        for (Animals animal : clinic.getFlyableAnimals()) {
            System.out.println(animal.toString());
        }
        System.out.println("____________________________");
        System.out.println("Плавающие животные клиники:");        
        for (Animals animal : clinic.getSwimableAnimals()) {
            System.out.println(animal.toString());
        }
        System.out.println("____________________________");
        System.out.println("Бегающие животные клиники:");        
        for (Animals animal : clinic.getRunningAnimals()) {
            System.out.println(animal.toString());
        }
        System.out.println("____________________________");
        System.out.println("Издающие звуки животные клиники:");        
        for (Animals animal : clinic.getSoundableAnimals()) {
            System.out.println(animal.toString());
        }
        System.out.println("____________________________");


        
        System.out.println("Удаляем аппендицит:");        
        for (Animals animal : clinic.getAllAnimals()) {
           clinic.removeAppendicitis(animal);
        }
        System.out.println("____________________________");

        System.out.println("Делаем общий осмотр:");        
        for (Animals animal : clinic.getAllAnimals()) {
           clinic.doAGeneralExam(animal);
        }
        System.out.println("____________________________");

        System.out.println("Обезболиваем:");        
        for (Animals animal : clinic.getAllAnimals()) {
           clinic.doAnesthetize(animal);
        }
        System.out.println("____________________________");

        System.out.println("Делаем перевязку:");        
        for (Animals animal : clinic.getAllAnimals()) {
           clinic.dressTheWound(animal);
        }
        System.out.println("____________________________");
        
        System.out.println("Ставим капельницу:");        
        for (Animals animal : clinic.getAllAnimals()) {
           clinic.putADrip(animal);
        }
        System.out.println("____________________________");
    
        
    }
}
