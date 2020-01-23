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
public class Linkedlist implements List<Nodo>{
	private Nodo nodofirst;
	private Nodo nodolast;
	private Nodo nodonew;
	private Nodo nodoremove, nodoprev, nodoact,nodonext;
	int longitud;
	
	
	/**
	 *Creador de la clase Linkedlist 
	 *
	 *@param No tiene elementos de entrada
	 *@see Se crea una lista indexada donde se define l
	 *
	 */
	public Linkedlist(){
		longitud = 0;
		nodofirst = null;
		nodolast = null;
	}
	
	public Nodo getFirst() {
		return nodofirst;
	}
	
	public Nodo getLast() {
		return nodolast;
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
	
	public Nodo remove(int index) {
		index += 1; 
		if (index == 0) {
			removeFirst();
		}
		else {
			nodoprev = nodofirst;
			nodonext = nodofirst.getNextNodo();
			for(int i = 1; i < index;i++) {
				if (i == index-1) {
					nodoprev.setNextNodo(nodonext.getNextNodo());
				}
				else {
					nodoprev = nodonext;
					nodonext = nodonext.getNextNodo();
				}
				
			}
		}
		longitud -= 1;
		return null;
	}

	public void add(int index, Nodo element) {
		throw new RuntimeException ("Metodo en proceso");
		
	}

	public boolean addAll(Collection<? extends Nodo> c) {
		throw new RuntimeException ("Metodo en proceso");
	}

	public boolean addAll(int index, Collection<? extends Nodo> c) {
		throw new RuntimeException ("Metodo en proceso");
		
	}

	public void clear() {
		throw new RuntimeException ("Metodo en proceso");
		
	}

	public boolean contains(Object o) {
		throw new RuntimeException ("Metodo en proceso");
		
	}

	public boolean containsAll(Collection<?> c) {
		throw new RuntimeException ("Metodo en proceso");
	}

	public Nodo get(int index) {
		throw new RuntimeException ("Metodo en proceso");
	}

	public int indexOf(Object o) {
		throw new RuntimeException ("Metodo en proceso");
	}

	public Iterator<Nodo> iterator() {
		throw new RuntimeException ("Metodo en proceso");
	}

	public int lastIndexOf(Object o) {
		throw new RuntimeException ("Metodo en proceso");
	}

	public ListIterator<Nodo> listIterator() {
		throw new RuntimeException ("Metodo en proceso");
	}

	public ListIterator<Nodo> listIterator(int index) {
		throw new RuntimeException ("Metodo en proceso");
	}

	

	

	public boolean removeAll(Collection<?> c) {
		throw new RuntimeException ("Metodo en proceso");
	}

	public boolean retainAll(Collection<?> c) {
		throw new RuntimeException ("Metodo en proceso");
	}

	
	
	public Object[] toArray() {
		throw new RuntimeException ("Metodo en proceso");
	}

	public <T> T[] toArray(T[] a) {
		throw new RuntimeException ("Metodo en proceso");
	}

		public boolean remove(Object o) {
		throw new RuntimeException ("Metodo en proceso");
	}

	public boolean add(Nodo e) {
		// TODO Auto-generated method stub
		return false;
	}

	public Nodo set(int index, Nodo element) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Nodo> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
