package FinalHomeWork.model.impl.Operations;

import FinalHomeWork.model.impl.Operation;

public class Sub extends Operation {
    public Sub() {
        super(1);
    }

    @Override
    public double calculate(double operandOne, double operandTwo) {
        return operandOne - operandTwo;
    }
}
