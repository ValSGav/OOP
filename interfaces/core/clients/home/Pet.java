package core.clients.home;

import core.clients.Animal;
import core.clients.owners.Owner;

import java.time.LocalDate;

/**
 Абстракция домашнего животного
 */
public class Pet extends Animal {
    public Pet() {
    }

    public Pet(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }
}
