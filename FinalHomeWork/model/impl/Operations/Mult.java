package FinalHomeWork.model.impl.Operations;

import FinalHomeWork.model.impl.Operation;

public class Mult extends Operation {
    public Mult() {
        super(2);
    }

    @Override
    public double calculate(double operandOne, double operandTwo) {
        return operandOne * operandTwo;
    }
}
