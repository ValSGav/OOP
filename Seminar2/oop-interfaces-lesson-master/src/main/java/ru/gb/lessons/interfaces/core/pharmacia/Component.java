package ru.gb.lessons.interfaces.core.pharmacia;

public class Component {
    private final String name;
    private final String weight;
    private final int power;

    public Component(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", this.name, this.weight, this.power);
    }
}
