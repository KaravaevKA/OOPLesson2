package zoo.base;

public interface ICollection <T>{
    void add(T element);
    boolean remove(T element);
    T get(int index);
    T remove(int index);
    void getInfoAll();

    void add(Animal element);
}
