package FinalHomeWork.model.impl.Operations.impl;

import FinalHomeWork.model.Componentable;
import FinalHomeWork.model.Operationable;
import FinalHomeWork.model.impl.Operations.PriorityOne;
import FinalHomeWork.model.impl.Operations.Summable;

public class Sum implements Operationable, Componentable, PriorityOne, Summable {
    @Override
    public long calculate(long operandOne, long operandTwo) {
        return operandOne + operandTwo;
    }
}
