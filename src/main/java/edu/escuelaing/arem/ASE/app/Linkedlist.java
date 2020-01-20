/**
 * 
 */
package edu.escuelaing.arem.ASE.app;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import edu.escuelaing.arem.ASE.app.Nodo;

/**
 * @author jimmy.chirivi
 *
 */
public class Linkedlist<E> implements List<E>{
	private Nodo nodofirst;
	private Nodo nodolast;
	private Nodo nodonew;
	private Nodo nodoremove, nodoprev, nodoact;
	int longitud;
	public Linkedlist(){
		longitud = 0;
		nodofirst = null;
		nodolast = null;
	}
	
	public float getFirst() {
		return nodofirst.getDatoNodo();
	}
	
	public float getLast() {
		return nodolast.getDatoNodo();
	}

	public boolean add(float nodo) {
		nodonew = new Nodo(nodo);
		if (isEmpty()) {
			nodofirst = nodonew;
			nodolast = nodofirst;
			longitud += 1;
			return true;
		}
		else {
			nodolast.setNextNodo(nodonew);
			nodolast = nodonew;
			longitud +=1;
			return true;
		}
	}
	
	public boolean isEmpty() {
		if (longitud == 0) {
			return true;
		} 
		else {
			return false;
		}
	}
	
	public int size() {
		return longitud;
	}
	
	public Nodo removeFirst() {
		nodoremove = nodofirst;
		nodoprev = nodofirst;
		nodoact = nodofirst.getNextNodo();
		nodofirst = nodoact;
		for (int i = 1; i < size();i++) {
			nodoprev = nodoact;
			nodoact = nodoprev.getNextNodo();
			nodoprev.setNextNodo(nodoact);
		}
		longitud -= 1;
		return nodoremove;
	}
	
	public Nodo removeLast() {
		nodoprev = nodofirst;
		nodoact = nodofirst.getNextNodo();
		for(int i = 1 ; i < size();i++) {
			nodoprev = nodoact;
			nodoact = nodoprev.getNextNodo();
		}
		longitud -= 1;
		nodoprev.setNextNodo(null);
		return nodoact;
	}
	
	public E remove(int index) {
		if (index == 0) {
			
		}					
		return null;
	}

	public void add(int index, E element) {
		// TODO Auto-generated method stub
		
	}

	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addAll(int index, Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public void clear() {
		// TODO Auto-generated method stub
		
	}

	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public ListIterator<E> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	

	

	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public E set(int index, E element) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<E> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean add(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	

}
