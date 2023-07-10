package Seminar4;

public interface GBList<T> extends Iterable {
    boolean add(T t);

    void remove(int index);

    T get(int index);

    int size();

    void update(int index, T t);

    GBList<T> join(T t);
}