package ru.gb.lessons.interfaces.core.clients.home.impl;
import ru.gb.lessons.interfaces.core.clients.home.Pet;
import ru.gb.lessons.interfaces.core.clients.owners.Owner;
import ru.gb.lessons.interfaces.core.clients.Runnable;
import ru.gb.lessons.interfaces.core.clients.Soundable;

import java.time.LocalDate;

/**
 * Одна из реализаций домашнего животного
 */
public class Cat extends Pet implements Runnable, Soundable {
    public Cat() {
    }

    public Cat(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME + " бежит со скоростью " + getSpeedOfRun() +  " км/ч, но не долго");
        return this.getSpeedOfRun();
    }

    @Override
    public int getSpeedOfRun() {
       return 40;
    }

    @Override
    public String makeASound() {
        System.out.println(CLASS_NAME + " мяукает с громкостью " + this.getTheSoundLevel() + "дБ.");
        return "Мяу-мяу!!!";
    }

    @Override
    public int getTheSoundLevel() {
        return 20;
    }
}
