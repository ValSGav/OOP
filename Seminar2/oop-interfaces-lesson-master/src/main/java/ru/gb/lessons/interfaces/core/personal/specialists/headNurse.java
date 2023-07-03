package ru.gb.lessons.interfaces.core.personal.specialists;

import ru.gb.lessons.interfaces.core.clients.Animals;
import ru.gb.lessons.interfaces.core.personal.specialities.DressingRoomNurse;

public class headNurse extends assistantNurse implements DressingRoomNurse{

    public headNurse(String fullName) {
        super(fullName);
    }

    @Override
    public void dressTheWound(Animals animal) {
        System.out.println(CLASS_NAME
                + " " + this.getFullName()
                + " сделала перевязку "
                + animal.getClassName()
                + " " + animal.toString());
    }    
}
