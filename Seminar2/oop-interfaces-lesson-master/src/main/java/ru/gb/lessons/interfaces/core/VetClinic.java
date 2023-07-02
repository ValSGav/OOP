package ru.gb.lessons.interfaces.core;

import java.util.ArrayList;
import java.util.List;

import ru.gb.lessons.interfaces.core.clients.Animal;
import ru.gb.lessons.interfaces.core.clients.Animals;
import ru.gb.lessons.interfaces.core.clients.Human;
import ru.gb.lessons.interfaces.core.clients.home.impl.Cat;

public class VetClinic {
    private static List<Animals> arrayOfAnimals = new ArrayList<Animals>();
    public static void main(String[] args) {
        Human human = new Human("Andrew");
        Cat cat = new Cat(0, null, 0, null, null );
        //arrayOfAnimals.add(human);
        arrayOfAnimals.add(cat);
        for (Animals items : arrayOfAnimals) {
            heal(items);
        }
    }

    private static void heal(Animals patients){
        System.out.println(patients.getClassName() + " вылечен");
    }
}
