package Seminar6.src.homework.Controller.impl;

import Seminar6.src.homework.Controller.Persisterable;

public class Persister {
    private final Persisterable entity;

    public Persister(Persisterable entity) {
        this.entity = entity;
    }

    public void save() {
        System.out.println("Save : " + entity.getName());
    }
}
