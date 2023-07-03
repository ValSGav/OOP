package ru.gb.lessons.interfaces.core.clients.wild.impl;

import java.time.LocalDate;

import ru.gb.lessons.interfaces.core.clients.Flyable;
import ru.gb.lessons.interfaces.core.clients.Soundable;
import ru.gb.lessons.interfaces.core.clients.owners.Owner;
import ru.gb.lessons.interfaces.core.clients.wild.WildAnimal;

public class Pigeon extends WildAnimal implements Soundable, Flyable {

    public Pigeon() {
    }

    public Pigeon(int id, LocalDate registrationDate, Owner owner) {
        super(id, 2, registrationDate, owner);
    }

    @Override
    public int fly() {
        System.out.println(CLASS_NAME + " летит со скоростью " + this.getSpeedOfFly() + " км/ч");
        return this.getSpeedOfFly();
    }

    @Override
    public int getSpeedOfFly() {
        return 40;
    }

    @Override
    public String makeASound() {
        System.out.println(CLASS_NAME + " воркует с громкостью " + this.getTheSoundLevel() + " дБ.");
        return "У-у у у-у";
    }

    @Override
    public int getTheSoundLevel() {
        return 10;

    }
}
