package FinalHomeWork;

import FinalHomeWork.controller.Controller;
import FinalHomeWork.view.View;

public class main {
    public static void main(String[] args) {
        Controller controller = new Controller(new View());
        controller.run();
    }
}
