package Notebook.mapper;

public interface IMapper<E, T> {
    E fromImport(T t);
    T toExport(E e);
}
