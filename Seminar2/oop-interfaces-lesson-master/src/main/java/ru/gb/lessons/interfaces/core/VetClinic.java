package ru.gb.lessons.interfaces.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import ru.gb.lessons.interfaces.core.clients.Animals;
import ru.gb.lessons.interfaces.core.clients.Flyable;
import ru.gb.lessons.interfaces.core.clients.Runnable;
import ru.gb.lessons.interfaces.core.clients.Soundable;
import ru.gb.lessons.interfaces.core.clients.Swimable;
import ru.gb.lessons.interfaces.core.personal.DoctorBase;
import ru.gb.lessons.interfaces.core.personal.NurseBase;
import ru.gb.lessons.interfaces.core.personal.specialists.DoctorAnesthesiologist;
import ru.gb.lessons.interfaces.core.personal.specialists.DoctorSurgeon;
import ru.gb.lessons.interfaces.core.personal.specialists.DoctorTherapist;
import ru.gb.lessons.interfaces.core.personal.specialists.assistantNurse;
import ru.gb.lessons.interfaces.core.personal.specialists.headNurse;

public class VetClinic {
    // private static List<Animals> arrayOfAnimals = new ArrayList<Animals>();
    // public static void main(String[] args) {
    // Human human = new Human("Andrew");
    // Cat cat = new Cat(0, null, 0, null, null );
    // //arrayOfAnimals.add(human);
    // arrayOfAnimals.add(cat);
    // for (Animals items : arrayOfAnimals) {
    // heal(items);
    // }
    // }

    protected List<Animals> arrayOfAnymals = new ArrayList<Animals>();
    protected List<DoctorBase> arrayOfDoctors = new ArrayList<DoctorBase>();
    protected List<NurseBase> arrayOfNurse = new ArrayList<NurseBase>();

    public VetClinic() {

        arrayOfDoctors.add(new DoctorSurgeon("Степан Вольнов"));
        arrayOfDoctors.add(new DoctorTherapist("Роман Круглов"));
        arrayOfDoctors.add(new DoctorAnesthesiologist("Петр Петров"));

        arrayOfNurse.add(new headNurse("Марфа Васильева"));
        arrayOfNurse.add(new assistantNurse("Олечка Мозякина"));

    }

    public void addAnimal(Animals animal) {
        this.arrayOfAnymals.add(animal);
    }

    public List<Animals> getAllAnimals() {
        return List.copyOf(arrayOfAnymals);
    }

    public List<Animals> getFlyableAnimals() {
        List<Animals> flyableAnimals = new ArrayList<Animals>();
        for (Animals animal : arrayOfAnymals) {
            if (animal instanceof Flyable) {
                flyableAnimals.add(animal);
            }
        }
        return flyableAnimals;
    }

    public List<Animals> getSwimableAnimals() {
        List<Animals> swimableAnimals = new ArrayList<Animals>();
        for (Animals animal : arrayOfAnymals) {
            if (animal instanceof Swimable) {
                swimableAnimals.add(animal);
            }
        }
        return swimableAnimals;
    }

    public List<Animals> getRunningAnimals() {
        List<Animals> runnableAnimals = new ArrayList<Animals>();
        for (Animals animal : arrayOfAnymals) {
            if (animal instanceof Runnable) {
                runnableAnimals.add(animal);
            }
        }
        return runnableAnimals;
    }

    public List<Animals> getSoundableAnimals() {
        List<Animals> soundableAnimals = new ArrayList<Animals>();
        for (Animals animal : arrayOfAnymals) {
            if (animal instanceof Soundable) {
                soundableAnimals.add(animal);
            }
        }
        return soundableAnimals;
    }

    public void removeAppendicitis(Animals animal) {
        for (DoctorBase doctor : arrayOfDoctors) {
            if (doctor instanceof DoctorSurgeon) {
                ((DoctorSurgeon) doctor).removeAppendicitis(animal);
            }
        }
    }

    public void stitchAWound(Animals animal) {
        for (DoctorBase doctor : arrayOfDoctors) {
            if (doctor instanceof DoctorSurgeon) {
                ((DoctorSurgeon) doctor).stitchAWound(animal);
            }
        }
    }

    public void doAnesthetize(Animals animal) {
        for (DoctorBase doctor : arrayOfDoctors) {
            if (doctor instanceof DoctorAnesthesiologist) {
                ((DoctorAnesthesiologist) doctor).doAnesthetize(animal);
            }
        }
    }

    public void doAGeneralExam(Animals animal) {
        for (DoctorBase doctor : arrayOfDoctors) {
            if (doctor instanceof DoctorTherapist) {
                ((DoctorTherapist) doctor).doAGeneralExam(animal);
            }
        }
    }

    public void dressTheWound(Animals animal) {
        for (NurseBase nurse : arrayOfNurse) {
            if (nurse instanceof headNurse) {
                ((headNurse) nurse).dressTheWound(animal);
            }
        }
    }

    public void putADrip(Animals animal) {
        for (NurseBase nurse : arrayOfNurse) {
            if (nurse instanceof assistantNurse) {
                ((assistantNurse) nurse).putADrip(animal);
            }
        }
    }

    // private static void heal(Animals patients) {
    // System.out.println(patients.getClassName() + " вылечен");
    // }
}
