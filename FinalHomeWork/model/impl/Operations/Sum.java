package FinalHomeWork.model.impl.Operations;

import FinalHomeWork.model.impl.Operation;

public class Sum extends Operation {
    public Sum() {
        super(1);
    }

    @Override
    public double calculate(double operandOne, double operandTwo) {
        return operandOne + operandTwo;
    }
}
