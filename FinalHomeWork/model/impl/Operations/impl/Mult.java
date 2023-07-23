package FinalHomeWork.model.impl.Operations.impl;

import FinalHomeWork.model.Componentable;
import FinalHomeWork.model.Operationable;
import FinalHomeWork.model.impl.Operations.Multiplicationable;
import FinalHomeWork.model.impl.Operations.PriorityTwo;

public class Mult implements Operationable, Componentable, PriorityTwo, Multiplicationable {
    @Override
    public long calculate(long operandOne, long operandTwo) {
        return operandOne * operandTwo;
    }
}
