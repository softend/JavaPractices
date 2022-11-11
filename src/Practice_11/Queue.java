package Practice_11;

public interface Queue<E>{
    void push(E element);
    E pop();
    E peek();
    int size();
    boolean isEmpty();

    String toString();
}
