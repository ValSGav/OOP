package FinalHomeWork.model.impl;

import FinalHomeWork.model.Componentable;
import FinalHomeWork.model.Valueable;

public class Operand implements Componentable, Valueable {
    private double value;

    public Operand(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public int getRank() {
        return 0;
    }
}
