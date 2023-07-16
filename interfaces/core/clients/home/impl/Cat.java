package core.clients.home.impl;

import core.clients.home.Pet;
import core.clients.owners.Owner;

import java.time.LocalDate;

/**
 Одна из реализаций домашнего животного
 */
public class Cat extends Pet {
    public Cat() {
    }

    public Cat(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }
}
