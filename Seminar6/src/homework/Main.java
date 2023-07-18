package Seminar6.src.homework;


import Seminar6.src.homework.Controller.Persisterable;
import Seminar6.src.homework.Controller.Reportable;
import Seminar6.src.homework.Controller.impl.Persister;
import Seminar6.src.homework.Controller.impl.Reporter;
import Seminar6.src.homework.Model.Admin;
import Seminar6.src.homework.Model.User;

public class Main {
    public static void main(String[] args) {

        Persisterable user = new User("Bob");
        Reportable admin = new Admin("Bubble-Gumm");

        Persister persister = new Persister(user);
        Reporter reporter = new Reporter(((Reportable) user));

        Persister persister2 = new Persister(((Persisterable)admin));
        Reporter reporter2 = new Reporter((admin));

        persister.save();
        reporter.report();

        persister2.save();
        reporter2.report();
    }
}