package Practice_11;

import java.util.LinkedList;

public class LinkedQueque<E> implements Queue<E>{

    private LinkedList<E> linkedList;

    @Override
    public void push(E element) {
        linkedList.add(element);
    }

    @Override
    public E pop() {
        return linkedList.remove(0);
    }

    @Override
    public E peek() {
        return linkedList.get(0);
    }

    @Override
    public int size() {
        return linkedList.size();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }
}
