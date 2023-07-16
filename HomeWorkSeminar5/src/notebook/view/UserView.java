package HomeWorkSeminar5.src.notebook.view;

import HomeWorkSeminar5.src.notebook.controller.UserController;
import HomeWorkSeminar5.src.notebook.model.User;
import HomeWorkSeminar5.src.notebook.util.Commands;

import java.util.List;
import java.util.Scanner;

public class UserView {
    private final UserController userController;

    public UserView(UserController userController) {
        this.userController = userController;
    }

    public void run() {
        Commands com;

        while (true) {

            String command = prompt("������� �������: ");
            com = Commands.valueOf(command);

            switch (com) {
                case EXIT:
                    userController.saveAllUsers();
                    return;
                case CREATE:
                    String firstName = prompt("���: ");
                    String lastName = prompt("�������: ");
                    String phone = prompt("����� ��������: ");
                    userController.saveUser(new User(firstName, lastName, phone));
                    break;
                case READ:
                    String id = prompt("������������� ������������: ");
                    try {
                        User user = userController.readUser(Long.parseLong(id));
                        System.out.println(user);
                        System.out.println();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case LIST:
                    try {
                        List<User> listUser = userController.readAllUser();
                        System.out.println(listUser);
                    } catch (Exception e) {
                        throw new RuntimeException();
                    }
                    break;
                case UPDATE:
                    try {

                        Long currentId = Long.parseLong(prompt("������� ID ������������ ������������: "));

                        User newUser = new User(currentId
                                , prompt("������� ��� ������������ ������������: ")
                                , prompt("������� ������� ������������ ������������: ")
                                , prompt("������� ������� ������������ ������������: "));

                        userController.update(currentId, newUser);

                    } catch (Exception e) {
                        throw new RuntimeException();
                    }
                    break;
                case DELETE:
                    try {
                        userController.removeUser(Long.parseLong(prompt("������������� ���������� ������������: ")));
                    } catch (Exception exception) {
                        throw new RuntimeException();
                    }
            }
        }
    }


    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
