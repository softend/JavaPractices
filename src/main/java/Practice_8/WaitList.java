package Practice_8;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E>{

    protected ConcurrentLinkedQueue<E> content;

    public WaitList(Collection<E> c) {
        this.content = new ConcurrentLinkedQueue<>(c);
    }

    public WaitList() {
    }

    @Override
    public void add(E element) {
        content.add(element);
    }

    @Override
    public E remove() {
        return content.remove();
    }

    @Override
    public boolean contains(E element) {
        return content.contains(element);
    }

    @Override
    public boolean containsAll(Collection<E> c) {
        return content.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }

    @Override
    public String toString() {
        String res = "";

        for (E e : content) {
            res += (e.toString() + "\n");
        }

        return res;
    }
}
