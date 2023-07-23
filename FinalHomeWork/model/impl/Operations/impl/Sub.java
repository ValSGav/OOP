package FinalHomeWork.model.impl.Operations.impl;

import FinalHomeWork.model.Componentable;
import FinalHomeWork.model.Operationable;
import FinalHomeWork.model.impl.Operations.PriorityOne;
import FinalHomeWork.model.impl.Operations.Substractinable;

public class Sub implements Operationable, Componentable, Substractinable, PriorityOne {
    @Override
    public long calculate(long operandOne, long operandTwo) {
        return operandOne - operandTwo;
    }
}
