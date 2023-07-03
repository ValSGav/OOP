package ru.gb.lessons.interfaces.core.personal.specialists;

import ru.gb.lessons.interfaces.core.clients.Animals;
import ru.gb.lessons.interfaces.core.personal.NurseBase;
import ru.gb.lessons.interfaces.core.personal.specialities.JuniorNurse;

public class assistantNurse extends NurseBase implements JuniorNurse {

    public assistantNurse(String fullName) {
        super(fullName);
    }

    @Override
    public void putADrip(Animals animal) {
        System.out.println(CLASS_NAME
                + " " + this.getFullName()
                + " поставила капельницу "
                + animal.getClassName()
                + " " + animal.toString());
    }

}
