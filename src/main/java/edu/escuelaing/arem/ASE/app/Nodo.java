/**
 * 
 */
package edu.escuelaing.arem.ASE.app;

/**
 * @author jimmy.chirivi
 *
 */
public class Nodo {
	
	private float dato;
	private Nodo next;
	
	public Nodo(float dato) {
		this.dato = dato;
		this.next = null;
	}
	
	
	public void setDatoNodo(int dato) {
		this.dato = dato;
	}
	
	public float getDatoNodo() {
		return dato;
	}
	
	public void setNextNodo(Nodo next) {
		this.next = next;
	}
			
	public Nodo getNextNodo() {
		return next;
	}
	
	
}


