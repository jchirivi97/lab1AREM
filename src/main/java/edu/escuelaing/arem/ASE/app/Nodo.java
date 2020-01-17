/**
 * 
 */
package edu.escuelaing.arem.ASE.app;

/**
 * @author jimmy.chirivi
 *
 */
public class Nodo<E> {
	
	public E dato;
	private Nodo next;
	private Nodo previous;
	
	public Nodo() {
	}
	
	
	public void setDatoNodo(E dato) {
		this.dato = dato;
	}
	
	public E getDatoNodo() {
		return dato;
	}
	
	public void setNextNodo(Nodo next) {
		this.next = next;
	}
	
	public void setPrevNodo(Nodo next) {
		this.next = next;
	}
	
	public Nodo getNextNodo() {
		return next;
	}
	
	public Nodo getPrevNodo() {
		return previous;
	}
}


