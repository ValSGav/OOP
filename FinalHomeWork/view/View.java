package FinalHomeWork.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class View {
    public Character showMenu(HashMap<Character, String> menu) {
        for (Map.Entry<Character, String> entry : menu.entrySet()) {
            System.out.printf("%s: %s", entry.getKey(), entry.getValue());
            System.out.println();
        }
        Scanner sc = new Scanner(System.in, "cp866");

        String result = sc.nextLine();

        if (menu.containsKey(result.charAt(1)))
            return result.charAt(1);
        else
            return 'e';

    }

    public String getExpression() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input math expression with '+-*/'");
        String ret = sc.nextLine();
        return ret;

    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}
