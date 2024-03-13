package ku.cs.posfinalproject.services;

public interface Datasource<T> {
    T readData();
    void writeData(T data);
}
