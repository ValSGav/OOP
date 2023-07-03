package ru.gb.lessons.interfaces.core.clients.wild.impl;

import ru.gb.lessons.interfaces.core.clients.Soundable;
import ru.gb.lessons.interfaces.core.clients.owners.Owner;
import ru.gb.lessons.interfaces.core.clients.wild.WildAnimal;
import ru.gb.lessons.interfaces.core.clients.Runnable;

import java.time.LocalDate;

/**
 Одна из реализаций дикого животного
 */
public class WildCat extends WildAnimal implements Soundable, Runnable{
    public WildCat() {
    }

    public WildCat(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME + " бежит со скоростью " + getSpeedOfRun() +  " км/ч, не долго но часто");
        return this.getSpeedOfRun();
    }

    @Override
    public int getSpeedOfRun() {
       return 50;
    }

    @Override
    public String makeASound() {
        System.out.println(CLASS_NAME + " мяукает с громкостью " + this.getTheSoundLevel() + "дБ.");
        return "Мяв-рррррмяв!!!";
    }

    @Override
    public int getTheSoundLevel() {
        return 40;
    }
}
