package Lesson5.SummOfTwoNumbers;

import java.util.Scanner;

public class View {

    private static Scanner sc;

    static {
        sc = new Scanner(System.in, "cp886");
    }

    public int getIntInputFomUser(String title) {
        System.out.print(title);
        return sc.nextInt();
    }

    public String getOperationInputFromUser(String title) {
        System.out.print(title);
        return sc.next();
    }
}
