package cl.ubb.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPila {

	@Test
	public void stackIsEmpty(){
		Pila pila = new Pila();
		int result = pila.sizeOfStack();
		assertEquals(0, result);
	}

}
