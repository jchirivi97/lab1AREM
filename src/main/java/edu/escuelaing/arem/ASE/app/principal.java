package edu.escuelaing.arem.ASE.app;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import edu.escuelaing.arem.ASE.app.Linkedlist;
import edu.escuelaing.arem.ASE.app.Nodo;

/**
 * 
 * @param 
 *
 */
public class principal
{
	public Linkedlist list;
	private Nodo actual,siguiente;
	float Tmean = 0,Tstdes = 0,m;
	
	public principal () {
		list = new Linkedlist();
	}
	
	public float mean () {
		actual = list.getFirst();
		Tmean += actual.getDatoNodo();
		siguiente = actual.getNextNodo();
		for (int i = 1; i < list.size();i++ ) {
			actual = siguiente;
			siguiente = actual.getNextNodo();
			Tmean += actual.getDatoNodo();
		}
		return Tmean / list.size();
	}
	
	
	
	public float StandardDesviation () {
		m = Tmean / list.size();
		actual = list.getFirst();
		Tstdes += (float) Math.pow((actual.getDatoNodo() - m),2);
		siguiente = actual.getNextNodo();
		for (int i = 1; i < list.size(); i++) {
			actual = siguiente;
			siguiente = actual.getNextNodo();
			Tstdes += (float) Math.pow((actual.getDatoNodo() - m), 2);
		}
		
				
		return (float) Math.round(Math.sqrt(Tstdes / (list.size()-1)) * 100) / 100;
	}
	
	public Linkedlist getLinkedlist() {
		return list;
	}
	
	public static void contenidofile (String file) throws FileNotFoundException,IOException {
		String cadena;
		FileReader f = new FileReader(file);
		BufferedReader b = new BufferedReader(f);
		while ((cadena = b.readLine()) != null ) {
			System.out.println(cadena);
		}
	}
	
    public static void main( String[] args ) throws IOException
    {
    	//contenidofile("/Users/jimmy97/Desktop/test.txt");
    	principal princ = new principal();
    	princ.list.add(160);
		princ.list.add(591);
		princ.list.add(114);
		princ.list.add(229);
		princ.list.add(230);
		princ.list.add(270);
		princ.list.add(128);
		princ.list.add(1657);
		princ.list.add(624);
		princ.list.add(1503);
		
		System.out.println(princ.mean());
		System.out.println(princ.StandardDesviation());
		
    	
    }
}
