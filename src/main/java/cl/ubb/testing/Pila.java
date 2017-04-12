package cl.ubb.testing;

import java.util.*;

public class Pila {
	
	private Object arrayStack[];
	private int topStack;
	private static int capacityStack;
	
	public Pila(){
		 topStack = -1;
		 capacityStack = 100;
		 arrayStack = new Object[capacityStack];
	}
	
	public boolean stackIsEmpty(){
		if(topStack == -1){
			return true;
		}
		return false;
	}
	
	public int sizeOfStack(){
		return topStack;
	}
	
	public void add(int i){
		topStack++;
		arrayStack[topStack] = i;
	}
}
