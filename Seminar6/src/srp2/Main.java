package Seminar6.src.srp2;

import Seminar6.src.srp2.model.JSONSaver;
import Seminar6.src.srp2.model.Order;
import Seminar6.src.srp2.model.Saver;
import Seminar6.src.srp2.model.View;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter order:");
        View consoleViewer = new View();

        Order order = consoleViewer.inputFromConsole();
        Saver jsonSaver = new JSONSaver(order);
        jsonSaver.save();
    }
}
