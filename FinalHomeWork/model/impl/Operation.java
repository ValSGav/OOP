package FinalHomeWork.model.impl;

import FinalHomeWork.model.Componentable;
import FinalHomeWork.model.Operationable;

public abstract class Operation implements Componentable, Operationable {
    private int rank;

    public Operation(int rank) {
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }
}
