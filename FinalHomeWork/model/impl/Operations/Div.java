package FinalHomeWork.model.impl.Operations;

import FinalHomeWork.model.impl.Operation;

public class Div extends Operation {
    public Div() {
        super(2);
    }
    @Override
    public double calculate(double operandOne, double operandTwo) {

        return (double) operandOne / operandTwo;

    }

}
