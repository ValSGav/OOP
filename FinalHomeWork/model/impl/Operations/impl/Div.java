package FinalHomeWork.model.impl.Operations.impl;

import FinalHomeWork.model.Componentable;
import FinalHomeWork.model.Operationable;
import FinalHomeWork.model.impl.Operations.Divisionable;
import FinalHomeWork.model.impl.Operations.PriorityTwo;

public class Div implements Operationable, Componentable, PriorityTwo, Divisionable {

    @Override
    public long calculate(long operandOne, long operandTwo) {
        return (long) operandOne/operandTwo;
    }
}
