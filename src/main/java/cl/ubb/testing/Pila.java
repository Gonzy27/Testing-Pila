package cl.ubb.testing;

import java.util.*;

public class Pila {
	
	private Pila arrayStack[];

	public Pila(){
		 arrayStack = new Pila[0];
	}
	
	public int sizeOfStack(){
		int cantidad;
		cantidad = arrayStack.length;
		return cantidad;
	}
	
}
