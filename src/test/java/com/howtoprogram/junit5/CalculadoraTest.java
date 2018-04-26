package com.howtoprogram.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	private static Calculadora calculadora;
	
	@BeforeAll
	static void setUpAll() {
		calculadora = new Calculadora();
	}
	@Test
	@DisplayName("Suma")
	void testGetSuma() {
		int expectedSuma = 15;
		assertEquals(expectedSuma,calculadora.suma(10,5));
	}
	
	@Test
	@DisplayName("Resta")
	void testGetResta() {
		int expectedSuma = 5;
		assertEquals(expectedSuma,calculadora.resta(10,5));
	}
	
	@Test
	@DisplayName("Division")
	void testGetDivision() {
		int expectedSuma = 2;
		assertEquals(expectedSuma,calculadora.division(10,5));
	}
	
	@Test
	@DisplayName("Division entre 0")
	void testGetDivisionEntreCero() {
		int expectedSuma = 0;
		assertEquals(expectedSuma,calculadora.division(0,0));
	}
	
	@Test
	@DisplayName("Multiplicacion")
	void testGetMultiplicacion() {
		int expectedSuma = 50;
		assertEquals(expectedSuma,calculadora.multiplicacion(10,5));
	}
}
