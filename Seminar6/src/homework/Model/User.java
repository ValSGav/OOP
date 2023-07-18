package Seminar6.src.homework.Model;

import Seminar6.src.homework.Controller.Persisterable;
import Seminar6.src.homework.Controller.Reportable;

public class User implements Persisterable, Reportable {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return "Юзер " + name;
    }


}
