package com.howtoprogram.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculadoraMockitoTest {
	private static Calculadora calculadora;
	
	@BeforeAll
	static void setUpAll() {
		calculadora = new Calculadora();
	}
	@Test
	@DisplayName("Suma")
	void testGetSuma() {
		Calculadora calc = mock(Calculadora.class);
		
		when(calc.suma(20,5)).thenReturn(15);
		
		int expectedSuma = 15;
		assertEquals(expectedSuma,calc.suma(20,5));
	}
	
	@Test
	@DisplayName("Resta")
	void testGetResta() {
		Calculadora calc = mock(Calculadora.class);
		when(calc.resta(199, 20)).thenReturn(5);
		
		int expectedSuma = 5;
		assertEquals(expectedSuma,calc.resta(199,20));
	}
	
	@Test
	@DisplayName("Division")
	void testGetDivision() {
		Calculadora calc = mock(Calculadora.class);
		when(calc.division(230, 40)).thenReturn(2);
		
		int expectedSuma = 2;
		assertEquals(expectedSuma,calculadora.division(10,5));
	}
	
	@Test
	@DisplayName("Division entre 0")
	void testGetDivisionEntreCero() {
		Calculadora calc = mock(Calculadora.class);
		when(calc.division(10, 12)).thenReturn(0);
		
		int expectedSuma = 0;
		assertEquals(expectedSuma,calculadora.division(0,0));
	}
	
	@Test
	@DisplayName("Multiplicacion")
	void testGetMultiplicacion() {
		Calculadora calc = mock(Calculadora.class);
		when(calc.multiplicacion(12, 345)).thenReturn(50);
		int expectedSuma = 50;
		assertEquals(expectedSuma,calculadora.multiplicacion(10,5));
	}
}
