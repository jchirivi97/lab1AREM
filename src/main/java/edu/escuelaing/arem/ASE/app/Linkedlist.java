/**
 * 
 */
package edu.escuelaing.arem.ASE.app;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import edu.escuelaing.arem.ASE.app.*;

/**
 * @author jimmy.chirivi
 *
 */
public class Linkedlist<E> implements List<E>{
	private Nodo<E> nodohead;
	private Nodo<E> nodonew;
	int contador = 0;
	public Linkedlist(){
		
	}

	public boolean add(E nodo) {
		if (isEmpty()) {
			nodonew = new Nodo<E>();
			nodonew.setDatoNodo(nodo);
			nodohead.setNextNodo(nodonew);
			nodohead.setPrevNodo(nodonew);
			contador += 1;
			return true;
		}
		else {
			nodonew = new Nodo<E>();
			nodohead.getNextNodo().setNextNodo(nodonew);
			nodohead.setPrevNodo(nodonew);
			contador +=1;
			return true;
		}
	}
	
	public boolean isEmpty() {
		if (contador == 0) {
			return true;
		} 
		else {
			return false;
		}
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

	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	public E remove(int index) {
		
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

	public int size() {
		// TODO Auto-generated method stub
		return 0;
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
	
	
	
	

}
