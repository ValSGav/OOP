package Seminar1;

public class Animal {
    private String name;
    private Integer age;
    private String vaccinate;
    private String color;
    private String owner;
    private Integer legsCount;

    public Animal(String name, Integer age, String vaccinate, String color, String owner, Integer legsCount) {
        this.name = name;
        this.age = age;
        this.vaccinate = vaccinate;
        this.color = color;
        this.owner = owner;
        this.legsCount = legsCount;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getColor() {
        System.out.println();
        return color;
    }

    public static void foo() {
        System.out.println("I am foo!");
    }
}
