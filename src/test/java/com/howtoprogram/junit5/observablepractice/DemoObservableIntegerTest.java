package com.howtoprogram.junit5.observablepractice;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class DemoObservableIntegerTest {
	Integer[] arrNumbers = {1,5,10,20};
	Integer[] testlist = {};
	
	@Test
	@DisplayName("Should Greater than Then")
	void shouldGraterThanTen() {
		Integer[] listExpected = {20};
		
		Integer[] result = DemoObservableInteger.getGreaterThanTen(arrNumbers);
		assertArrayEquals(listExpected,result);
	}
	
	@Test
	@DisplayName("Should duplicate")
	void shouldDuplicate() {
		Integer[] listExpected = {2,10,20,40};
		
		Integer[] result = DemoObservableInteger.duplicateNumbers(arrNumbers);
		assertArrayEquals(listExpected,result);
	}
	
	@Test
	@DisplayName("Should duplicate empty")
	void shouldValidateEmptyArrayDuplicate() {
		
		Integer[] result = DemoObservableInteger.duplicateNumbers(testlist);
		assertArrayEquals(testlist,result);
	}
	@Test
	@DisplayName("Should Greater than Then")
	void shouldEmptyArrayGraterThanTen() {
		
		Integer[] result = DemoObservableInteger.getGreaterThanTen(testlist);
		assertArrayEquals(testlist,result);
	}
}
