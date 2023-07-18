package Notebook.repository.impl;

import Notebook.model.IRecord;
import Notebook.repository.IRepository;

import java.util.List;

public class TXTRepository implements IRepository<IRecord> {

    String fileName;
    List<IRecord> workList;


    @Override
    public boolean add(IRecord iRecord) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public IRecord find(int id) {
        return null;
    }

    @Override
    public boolean update(int id, IRecord iRecord) {
        return false;
    }

    @Override
    public List<IRecord> getAll() {
        return null;
    }

    @Override
    public void readDB() {

    }

    @Override
    public void saveDB() {

    }
}
