package edu.escuelaing.arem.ASE.app;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import edu.escuelaing.arem.ASE.app.Linkedlist;
import edu.escuelaing.arem.ASE.app.Nodo;

/**
 * Hello world!
 * @param <E>
 *
 */
public class principal
{
	Linkedlist list;
	Nodo actual,siguiente;
	float Tmean = 0,Tstdes = 0,m;
	
	
	public float mean () {
		actual = list.getFirst();
		Tmean += actual.getDatoNodo();
		siguiente = actual.getNextNodo();
		for (int i = 2; i < list.size();i++ ) {
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
		for (int i = 2; i < list.size(); i++) {
			actual = siguiente;
			siguiente = actual.getNextNodo();
			Tstdes += (float) Math.pow((actual.getDatoNodo() - m), 2);
		}
		return (float) Math.sqrt(Tstdes / (list.size()-1));
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
    	contenidofile("/Users/jimmy97/Desktop/test.txt");
    }
}