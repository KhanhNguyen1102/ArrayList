package manager.service;

public interface GeneralService<T> {
    int add(T person);

    void print();

    int find(int id);

    void update(int id,T person);

    void delete(int id);
}
