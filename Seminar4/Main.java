package Seminar4;

public class Main {
    public static void main(String[] args) {
        GBList<Number> gbList = new GBArrayList<>();
        gbList.join(1).join(2).join(3).join(4).join(5);
        gbList.add(7);
        gbList.add(8);
        System.out.println(gbList.toString());
    }
}
