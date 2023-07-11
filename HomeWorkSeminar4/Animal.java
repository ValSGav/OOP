package HomeWorkSeminar4;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Arrays;

public class Animal {
    private String name;
    private int age;
    private String vaccination;
    private String color;
    private String species;
    private Owner owner;
    private int legsCount;
    private int id;

    private static Random rd;

    static {
        rd = new Random();
    }

    public Animal(String name, int age, String vaccination, String color,
                  String species, Owner owner, int legsCount, int id) {
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
        this("", 0, "", color, species, new Owner("unknown"), legsCount, rd.nextInt(1, 1000000));
    }

    public Animal() {
        this("", "", 0);
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Animal: {name = %s, owner = %s, age = %d}", name, owner, this.age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVaccination(String vaccination) {
        this.vaccination = vaccination;
    }

    public int getId() {
        return id;
    }

    public Map<String, String> getDefaultMapOfData() {
        Map<String, String> returnHashMap = new HashMap<String, String>();
        returnHashMap.put("name", "-");
        returnHashMap.put("age", "-");
        returnHashMap.put("vaccination", "-");
        returnHashMap.put("color", "-");
        returnHashMap.put("species", "-");
        returnHashMap.put("owner", "-");
        returnHashMap.put("legsCount", "-");
        returnHashMap.put("id", "-");
        return returnHashMap;
    }

    public static Map<String, String> convertStringDataToMap(String data) {

        Map<String, String> returnMap = new HashMap<String, String>();
        String[] dataSet = data.split(";");

        for (String currentData : dataSet
        ) {
            String[] currentKeyValue = currentData.split(":");
            if (currentKeyValue.length == 2) {
                returnMap.put(currentKeyValue[0], currentKeyValue[1]);
            }
        }
        return returnMap;
    }

    public static String convertMapDataToString(Map<String, String> map) {
        StringBuilder returnString = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()
        ) {
            if (!returnString.isEmpty())
                returnString.append(";");
            returnString.append(String.format("%s:%s", entry.getKey(), entry.getValue()));
        }
        return returnString.toString();
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<String, String> getMapOfThisObject() {
        Map<String, String> returnMap = getDefaultMapOfData();

        returnMap.put("name", this.name);
        returnMap.put("age", Integer.toString(this.age));
        returnMap.put("vaccination", this.vaccination);
        returnMap.put("color", this.color);
        returnMap.put("species", this.species);
        returnMap.put("owner", this.owner.toString());
        returnMap.put("legsCount", Integer.toString(this.legsCount));
        returnMap.put("id", Integer.toString(this.id));

        return returnMap;
    }

}