package Practice_8;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class UnfairWaitList<E> extends WaitList<E>{

    public UnfairWaitList() {
    }

    public UnfairWaitList(Collection<E> c) {
        super(c);
    }

    public void remove(E element){
        content.remove(element);
    }

    public void moveToBack(E element){
        if(content.remove(element)){
            ConcurrentLinkedQueue<E> temp = new ConcurrentLinkedQueue<E>();
            temp.add(element);
            temp.addAll(content);
            content=temp;
        }
    }
}