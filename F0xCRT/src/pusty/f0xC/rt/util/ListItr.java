package pusty.f0xC.rt.util;

public class ListItr<E> extends OListIterator<E> {
	
	 protected int cursor = 0;
	 protected int lastRet = -1;
	 protected OList<E> list;
	 
	 public ListItr(OList<E> l,int index) {
		 list = l;
         cursor = index;
     }
     public boolean hasPrevious() {
         return cursor != 0;
     }
     public E previous() {
         int i = cursor - 1;
         E previous = list.get(i);
         lastRet = cursor = i;
         return previous;
     }
     public int nextIndex() {
         return cursor;
     }
     public int previousIndex() {
         return cursor-1;
     }
     public void set(E e) {
         if (lastRet < 0)
             return;
         list.set(lastRet, e);
     }
     public void add(E e) {
         int i = cursor;
         list.add(i, e);
         lastRet = -1;
         cursor = i + 1;
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
