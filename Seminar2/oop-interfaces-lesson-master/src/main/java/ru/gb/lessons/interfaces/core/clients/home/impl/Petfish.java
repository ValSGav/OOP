package ru.gb.lessons.interfaces.core.clients.home.impl;
import ru.gb.lessons.interfaces.core.clients.Swimable;
import ru.gb.lessons.interfaces.core.clients.home.Pet;
import ru.gb.lessons.interfaces.core.clients.owners.Owner;

import java.time.LocalDate;

public class Petfish extends Pet implements Swimable {

    public Petfish() {
    }

    public Petfish(int id, String name, LocalDate registrationDate, Owner owner) {
        super(id, name, 0, registrationDate, owner);
    }

    @Override
    public int swim() {
        System.out.println(CLASS_NAME + " плывет со скоростью " + this.getSpeedOfSwim() + "км/ч");
        return this.getSpeedOfSwim();
    }

    @Override
    public int getSpeedOfSwim() {
        return 30;
    }

}
