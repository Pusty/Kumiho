package pusty.f0xC.rt.util;

public class Itr<E> extends OIterator<E> {
	   
    protected int cursor = 0;
    protected int lastRet = -1;
    protected OList<E> list;

    public Itr(OList<E> l) {
    	list = l;
    }
    public boolean hasNext() {
        return cursor != list.size();
    }

    public E next() {
        int i = cursor;
        E next = list.get(i);
        lastRet = i;
        cursor = i + 1;
        return next;
    }

    public void remove() {
        list.remove(lastRet);
        if (lastRet < cursor)
            cursor--;
        lastRet = -1;
    }

}
