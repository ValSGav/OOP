package Seminar6.src.homework.Controller.impl;

import Seminar6.src.homework.Controller.Reportable;

public class Reporter {
    Reportable entity;

    public Reporter(Reportable entity) {
        this.entity = entity;
    }

    public void report() {
        System.out.println("Report for : " + entity.getName());
    }
}
