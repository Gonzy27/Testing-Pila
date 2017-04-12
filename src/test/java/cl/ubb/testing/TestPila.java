package cl.ubb.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPila {

	@Test
	public void stackIsEmpty() {
		Pila pila = new Pila();
		boolean result = pila.stackIsEmpty();
		assertEquals(true, result);
	}

	@Test
	public void addThreeSoStackIsNotEmpty() {
		Pila pila = new Pila();
		pila.add(3);
		boolean result = pila.stackIsEmpty();
		assertEquals(false, result);
	}

	@Test
	public void addOneAndTwoSoStackIsNotEmpty() {
		Pila pila = new Pila();
		pila.add(1);
		pila.add(2);
		boolean result = pila.stackIsEmpty();
		assertEquals(false, result);
	}

	@Test
	public void addFourAndFiveSizaOfStackShouldBeTwo() {
		Pila pila = new Pila();
		pila.add(4);
		pila.add(5);
		int result = pila.sizeOfStack();
		assertEquals(2, result);
	}
	
	@Test
	public void addSixAndSevenToPopAndGetSeven(){
		Pila pila = new Pila();
		pila.add(6);
		pila.add(7);
		int result = pila.pop();
		assertEquals(7, result);
	}
	
	@Test
	public void addEightAndNineToPopAndGetNineAndEight(){
		Pila pila = new Pila();
		pila.add(8);
		pila.add(9);
		int result = pila.pop();
		assertEquals(9, result);
		assertEquals(8, result);
	}
}
