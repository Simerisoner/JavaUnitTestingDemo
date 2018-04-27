package com.howtoprogram.junit5.observablepractice;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class DemoObservableTest {
	int[] arrNumbers = {1,5,10,20};
	int[] testlist = {};
	
	@Test
	@DisplayName("Should Greater than Then")
	void shouldGraterThanTen() {
		int[] listExpected = {20};
		
		int[] result = DemoObservable.getGreaterThanTen(arrNumbers);
		assertArrayEquals(listExpected,result);
	}
	
	@Test
	@DisplayName("Should duplicate")
	void shouldDuplicate() {
		int[] listExpected = {2,10,20,40};
		
		int[] result = DemoObservable.duplicateNumbers(arrNumbers);
		assertArrayEquals(listExpected,result);
	}
	
	@Test
	@DisplayName("Should duplicate empty")
	void shouldValidateEmptyArrayDuplicate() {
		
		int[] result = DemoObservable.duplicateNumbers(testlist);
		assertArrayEquals(testlist,result);
	}
	@Test
	@DisplayName("Should Greater than Then")
	void shouldEmptyArrayGraterThanTen() {
		
		int[] result = DemoObservable.getGreaterThanTen(testlist);
		assertArrayEquals(testlist,result);
	}
}
