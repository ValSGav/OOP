package Seminar4;

import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {
    int index;
    T[] values;

    public ArrayIterator(T[] values) {
        this.values = values;
    }


    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public T next() {
        return null;
    }
}
