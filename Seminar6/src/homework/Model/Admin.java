package Seminar6.src.homework.Model;

import Seminar6.src.homework.Controller.Persisterable;
import Seminar6.src.homework.Controller.Reportable;

public class Admin implements Persisterable, Reportable {

    private final String nickName;

    public Admin(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String getName() {
        return "Админ " + nickName;
    }
}
