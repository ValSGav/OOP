package Seminar5_1.notebook;

import Seminar5_1.notebook.controller.UserController;
import Seminar5_1.notebook.dao.impl.FileOperation;
import Seminar5_1.notebook.model.User;
import Seminar5_1.notebook.view.UserView;
import Seminar5_1.notebook.repository.GBRepository;
import Seminar5_1.notebook.repository.impl.UserRepository;

import static Seminar5_1.notebook.util.DBConnector.DB_PATH;
import static Seminar5_1.notebook.util.DBConnector.createDB;

public class Main {
    public static void main(String[] args) {
        createDB();
        FileOperation fileOperation = new FileOperation(DB_PATH);
        GBRepository<User, Long> repository = new UserRepository(fileOperation);
        UserController controller = new UserController(repository);
        UserView view = new UserView(controller);
        view.run();
    }
}
