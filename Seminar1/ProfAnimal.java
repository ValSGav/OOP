package Seminar1;

public class ProfAnimal extends Animal{
    private int eyesCount;
    public ProfAnimal(String name, Integer age, String vaccinate, String color, String owner, Integer legsCount, int eyesCount) {
        super(name, age, vaccinate, color, owner, legsCount);
        this.eyesCount = eyesCount;
    }

    public int getEyesCount() {
        return eyesCount;
    }
}