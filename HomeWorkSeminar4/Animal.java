package HomeWorkSeminar4;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Arrays;

public class Animal {
    private String name;
    private Integer age;
    private String vaccination;
    private String color;
    private String species;
    private Owner owner;
    private Integer legsCount;
    private int id;

    private static Random rd;

    static {
        rd = new Random();
    }

    public Animal(String name, Integer age, String vaccination, String color,
                  String species, Owner owner, Integer legsCount, int id) {
        this.name = name;
        this.age = age;
        this.vaccination = vaccination;
        this.color = color;
        this.species = species;
        this.owner = owner;
        this.legsCount = legsCount;
        this.id = id;
    }

    public Animal(String color, String species, Integer legsCount) {
        this(null, null, null, color, species, null, legsCount, rd.nextInt(1, 1000000));
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Animal: {name = %s, owner = %s}", name, owner);
    }

    public int getId() {
        return id;
    }

    public static Map<String, String> convertStringDataToMap(String data) {
        Map<String, String> returnHashMap = new HashMap<String, String>();

        String[] dataSet = data.split(";");

        for (String currentData : dataSet
        ) {
            String[] currentKeyValue = currentData.split(":");
            if (returnHashMap.containsKey(currentKeyValue[0])) {
                returnHashMap.put(currentKeyValue[0], currentKeyValue[1]);
            }
        }

        return returnHashMap;
    }
}