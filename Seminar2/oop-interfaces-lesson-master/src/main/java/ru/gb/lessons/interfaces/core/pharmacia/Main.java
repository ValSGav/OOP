package ru.gb.lessons.interfaces.core.pharmacia;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Component component1 = new Component("aspirin", "10 mg.", 10);
        Component component2 = new Component("spirit", "100 mg.", 100);
        Component component3 = new Component("methanol", "10 mg.", 1000);

        Drug drug1 = new Drug();
        drug1.addComponent(component1).addComponent(component2).addComponent(component3);

        Drug drug2 = new Drug();
        drug2.addComponent(component1).addComponent(component3);

        Drug drug3 = new Drug();
        drug3.addComponent(component2).addComponent(component3);

        Drug drug4 = new Drug();
        drug4.addComponent(component1).addComponent(component2).addComponent(component3);


        while (drug1.hasNext()){
            System.out.println(drug1.next());
        }

        while (drug1.hasNext()){
            System.out.println(drug1.next());
        }

        List<Drug> arr = new ArrayList<>();
        arr.add(drug1);
        arr.add(drug2);
        arr.add(drug3);

        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);

        // Домашнее здание, переопределены методы equals и hashCode класс Drug
        Set<Drug> result = new HashSet<>();
        result.add(drug1);
        result.add(drug2);
        result.add(drug3);
        result.add(drug4);
        System.out.println(result.size()); //

    }
}
