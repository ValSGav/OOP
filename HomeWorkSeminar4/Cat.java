package HomeWorkSeminar4;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

public class Cat extends Animal {

    int sweetLevel;

    public Cat(String color, String species, Integer legsCount, int sweetLevel) {
        super(color, species, legsCount);
        this.sweetLevel = sweetLevel;
    }

    public Cat() {
        this("", "", 0, 0);
    }

    private void FIndFood() {
        System.out.println("Cat found food ");
    }

    private void FIndFood(int... args) {
        System.out.println("Cat found food, count = " + Arrays.toString(args));
    }

    private void WakeUp() {
        System.out.println("Cat woke up ");
    }

    private void Sleep() {
        System.out.println("Cat sleeps ");
    }

    private void Eat() {
        System.out.println("Cat ate ");
    }

    public void Hunt(int... args) {
        WakeUp();
        FIndFood(args);
        Eat();
        Sleep();
    }

    @Override
    public Map<String, String> getDefaultMapOfData() {
        Map<String, String> returnMap = super.getDefaultMapOfData();
        returnMap.put("sweetLevel", Integer.toString(sweetLevel));
        return returnMap;
    }
}
