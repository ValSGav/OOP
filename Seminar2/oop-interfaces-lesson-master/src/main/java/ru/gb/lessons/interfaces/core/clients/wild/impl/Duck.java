package ru.gb.lessons.interfaces.core.clients.wild.impl;

import ru.gb.lessons.interfaces.core.clients.Flyable;
import ru.gb.lessons.interfaces.core.clients.Soundable;
import ru.gb.lessons.interfaces.core.clients.Swimable;
import ru.gb.lessons.interfaces.core.clients.owners.Owner;
import ru.gb.lessons.interfaces.core.clients.wild.WildAnimal;

import java.time.LocalDate;

public class Duck extends WildAnimal implements Flyable, Swimable, Soundable {

    public Duck(int id, LocalDate registrationDate, Owner owner) {
        super(id, 2, registrationDate, owner);
    }

    @Override
    public int fly() {
        System.out.println(CLASS_NAME + " летит со скоростью " + this.getSpeedOfFly() +  " км/ч");
        return this.getSpeedOfFly();
    }

    @Override
    public int swim() {
        System.out.println(CLASS_NAME + " плывет со скоростью " + this.getSpeedOfSwim() + "км/ч");
        return this.getSpeedOfSwim();
    }

    @Override
    public int getSpeedOfSwim() {
        return 5;
    }

    @Override
    public int getSpeedOfFly() {
        return 50;
    }

    @Override
    public String makeASound() {
        System.out.println(CLASS_NAME + " крякает с громкостью " + this.getTheSoundLevel() + " дБ.");
        return "Кря-кря";
    }

    @Override
    public int getTheSoundLevel() {
        return 30;
    }

}
