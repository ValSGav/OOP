package FinalHomeWork.model.impl;

import FinalHomeWork.model.Componentable;

public class Operand implements Componentable {
    private long value;

    public Operand(long value) {
        this.value = value;
    }

    public long getValue() {
        return value;
    }
}
