package HomeWorkSeminar5.src.notebook;

import HomeWorkSeminar5.src.notebook.controller.UserController;
import HomeWorkSeminar5.src.notebook.repository.impl.FileOperation;
import HomeWorkSeminar5.src.notebook.model.User;
import HomeWorkSeminar5.src.notebook.repository.GBRepository;
import HomeWorkSeminar5.src.notebook.repository.impl.UserRepository;
import HomeWorkSeminar5.src.notebook.view.UserView;

import static HomeWorkSeminar5.src.notebook.util.DBConnector.DB_PATH;
import static HomeWorkSeminar5.src.notebook.util.DBConnector.createDB;

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
