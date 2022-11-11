package Practice_8;

import java.util.Collection;

public class BoundedWaitList<E> extends WaitList<E> {
    /** Изначальный размер списка */
    private int capacity;

    public int getCapacity() {
        return capacity;
    }

    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }

    public BoundedWaitList(Collection<E> c, int capacity) {
        super(c);
        this.capacity = capacity;
    }

    public void add(E element){
        if (content.size() < capacity){
            super.add(element);
        }else {
            throw new Error("Error: size > capacity");
        }
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                ", content=" + content +
                '}';
    }
}
