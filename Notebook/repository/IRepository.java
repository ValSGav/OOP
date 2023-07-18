package Notebook.repository;

import java.util.List;

public interface IRepository<E> {
    boolean add(E e);
    boolean delete(int id);
    E find(int id);
    boolean update(int id, E e);
    List<E> getAll();

    void readDB();
    void saveDB();


}
