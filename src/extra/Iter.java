package extra;

import java.util.ArrayList;
import java.util.Iterator;

public class Iter<T> {
	private Iterator<T> iterador;
	private ArrayList<T> list;

	public Iter(ArrayList<T> pList) {
	        this.iterador = pList.iterator();
	        this.list = pList;
	}

	public T getNext() {
	        if (iterador.hasNext()) {
	            return iterador.next();
	        } else {
	            iterador = list.iterator();
	            return getNext();
	        }
	}
}
