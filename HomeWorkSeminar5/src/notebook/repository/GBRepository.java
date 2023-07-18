package HomeWorkSeminar5.src.notebook.repository;

import java.util.List;
import java.util.Optional;

/**
 * �����������, ��� ���������� CreateReadUpdateDelete (CRUD) ��������
 *
 * @param <E> ��� ������ ������
 * @param <I> ��� ID ������ ������ E
 */
public interface GBRepository<E, I, T> {
    List<E> findAll();

    E create(E e);

    Optional<E> findById(I id);

    Optional<E> update(I id, E e);

    boolean delete(I id);

    List<T> readAll();

    void saveAll();

}
