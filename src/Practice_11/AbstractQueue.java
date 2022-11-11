package Practice_11;

import java.util.LinkedList;

public class AbstractQueue<E>{
    LinkedList<E> linkedList;

    public int size() {
        return linkedList.size();
    }

    public boolean isEmpty() {
        return linkedList.isEmpty();
    }


}
