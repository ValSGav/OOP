package ru.gb.lessons.interfaces.core.personal.specialists;

import ru.gb.lessons.interfaces.core.clients.Animals;
import ru.gb.lessons.interfaces.core.personal.DoctorBase;
import ru.gb.lessons.interfaces.core.personal.specialities.Anesthesiologist;

public class DoctorAnesthesiologist extends DoctorBase implements Anesthesiologist{

    public DoctorAnesthesiologist(String fullName) {
        super(fullName);
    }

    @Override
    public void doAnesthetize(Animals animal) {
         System.out.println(CLASS_NAME
                + " " + this.getFullName()
                + " сделала обезболивание "
                + animal.getClassName()
                + " " + animal.toString());
    }
    
}
