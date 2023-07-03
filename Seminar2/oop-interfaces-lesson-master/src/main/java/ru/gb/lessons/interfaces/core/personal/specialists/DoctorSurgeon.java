package ru.gb.lessons.interfaces.core.personal.specialists;

import ru.gb.lessons.interfaces.core.clients.Animals;
import ru.gb.lessons.interfaces.core.personal.DoctorBase;
import ru.gb.lessons.interfaces.core.personal.specialities.Surgeon;

public class DoctorSurgeon extends DoctorBase implements Surgeon {

    public DoctorSurgeon(String fullName) {
        super(fullName);
    }

    @Override
    public void removeAppendicitis(Animals animal) {
        System.out.println(CLASS_NAME
                + " " + this.getFullName()
                + " провел операцию по удалению аппендицита "
                + animal.getClassName()
                + " " + animal.toString());
    }

    @Override
    public void stitchAWound(Animals animal) {
        System.out.println(CLASS_NAME
                + " " + this.getFullName()
                + " зашил рану "
                + animal.getClassName()
                + " " + animal.toString());
    }

}
