package ru.gb.lessons.interfaces.core.pharmacia;


import java.lang.annotation.Native;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Drug implements Iterator<Component>, Comparable<Drug> {

    protected List<Component> components;
    protected int componentsCount;

    public Drug() {
        this.components = new ArrayList<Component>();
        this.componentsCount = 0;
    }

    public Drug addComponent(Component component) {

        components.add(component);

        return this;
    }

    @Override
    public boolean hasNext() {
        boolean hasNextState = componentsCount < components.size();
        if (!hasNextState) componentsCount = 0;
        return hasNextState;
    }

    public int getPower() {
        int power = 0;
        for (Component currentComponent :
                this.components) {
            power += currentComponent.getPower();
        }

        return power;
    }

    public String getDrugReprezentation() {
        StringBuilder sb = new StringBuilder();

        for (Component currentComponent: this.components){
                    sb.append(currentComponent.toString());
                    sb.append(" ");
        };
        return sb.toString().stripIndent();
    }


    @Override
    public Component next() {
        return components.get(componentsCount++);
    }

    @Override
    public int compareTo(Drug o) {
        int resCompare = Integer.compare(this.getPower(), o.getPower());
        resCompare =
                resCompare == 0 ?
                        this.getDrugReprezentation().compareTo(o.getDrugReprezentation())
                        : resCompare;

        return resCompare;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Drug) {
            return this.getPower() == ((Drug) obj).getPower()
                    && this.getDrugReprezentation().equals(((Drug) obj).getDrugReprezentation());

        } else return false;
    }

    @Override
    public String toString() {
        return String.format(
                "{%s (%s)}"
                ,this.getDrugReprezentation()
                ,Integer.toString(this.getPower()));
    }

    @Override
    public int hashCode() {
        return ((String) this.getDrugReprezentation()).hashCode();
    }
}
