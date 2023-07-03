package ru.gb.lessons.interfaces.core.clients.home.impl;

import ru.gb.lessons.interfaces.core.clients.Soundable;
import ru.gb.lessons.interfaces.core.clients.Runnable;
import ru.gb.lessons.interfaces.core.clients.Swimable;
import ru.gb.lessons.interfaces.core.clients.home.Pet;
import ru.gb.lessons.interfaces.core.clients.owners.Owner;

import java.time.LocalDate;

/**
 * Одна из реализаций домашнего животного
 */
public class Dog extends Pet implements Runnable, Soundable, Swimable {
    public Dog() {
    }

    public Dog(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int swim() {
        System.out.println(CLASS_NAME + " плывет со скоростью " + this.getSpeedOfSwim() + "км/ч");
        return this.getSpeedOfSwim();
    }

    @Override
    public int getSpeedOfSwim() {
        return 3;
    }

    @Override
    public String makeASound() {
        System.out.println(CLASS_NAME + " гавкает с громкостью " + this.getTheSoundLevel() + "дБ.");
        return "Гав-гав!!!";
    }

    @Override
    public int getTheSoundLevel() {
        return 40;
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME + " бежит со скоростью" + this.getSpeedOfRun() + " км/ч");
        return this.getSpeedOfRun();
    }

    @Override
    public int getSpeedOfRun() {
        return 30;
    }
}
