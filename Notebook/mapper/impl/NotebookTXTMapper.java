package Notebook.mapper.impl;

import Notebook.mapper.IMapper;
import Notebook.model.IRecord;
import Notebook.model.impl.NotebookRecord;

public class NotebookTXTMapper implements IMapper<IRecord, String> {

    @Override
    public IRecord fromImport(String data) {

        IRecord rec = new NotebookRecord(data);
        return rec;
    }

    @Override
    public String toExport(IRecord rec) {
        return rec.getAStringRepresents();
    }
}
