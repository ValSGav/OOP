package core.clients.home.impl;

import core.clients.home.Pet;
import core.clients.owners.Owner;

import java.time.LocalDate;

/**
 Одна из реализаций домашнего животного
 */
public class Dog extends Pet {
    public Dog() {
    }

    public Dog(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }
}
