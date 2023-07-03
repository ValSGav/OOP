package ru.gb.lessons.interfaces.core.personal.specialists;

import ru.gb.lessons.interfaces.core.clients.Animals;
import ru.gb.lessons.interfaces.core.personal.DoctorBase;
import ru.gb.lessons.interfaces.core.personal.specialities.Therapist;

public class DoctorTherapist extends DoctorBase implements Therapist{

    public DoctorTherapist(String fullName) {
        super(fullName);
    }

    @Override
    public void doAGeneralExam(Animals animal) {
       System.out.println(CLASS_NAME
                + " " + this.getFullName()
                + " провел полный осмотр "
                + animal.getClassName()
                + " " + animal.toString());
    }
    
}
