package com.howtoprogram.junit5;

public class Calculadora {
	int result;
	
	public int suma(int a, int b) {
		result =a+b;
		return result;
	}
	public int resta(int a, int b) {
		result =a-b;
		return result;
	}
	public int division(int a, int b) {
		if(b == 0) {
			result = 0;
		}else {
			result =a/b;
		}
		return result;
	}
	public int multiplicacion(int a, int b) {
		result =a*b;
		return result;
	}
}
