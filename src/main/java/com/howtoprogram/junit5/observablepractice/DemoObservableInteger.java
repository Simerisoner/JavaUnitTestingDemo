package com.howtoprogram.junit5.observablepractice;
import java.util.Arrays;
import io.reactivex.Observable;


public class DemoObservableInteger {

	public static Integer[] getGreaterThanTen(Integer[] arrNumbers) {
		Integer[] arrIntNumbers = Arrays
				.stream(arrNumbers)
				.filter(x -> x>10)
				.toArray(Integer[]::new);

		Observable.fromArray(arrIntNumbers) 
		.blockingSubscribe(System.out::println);
		
		return arrIntNumbers;
	}

	public static Integer[] duplicateNumbers(Integer[] arrNumbers) {

		Integer[] arrIntNumbers = Arrays
				.stream(arrNumbers)
				.map(x -> x*2)
				.toArray(Integer[]::new);

		Observable.fromArray(arrIntNumbers) 
		.blockingSubscribe(System.out::println);
		
		return arrIntNumbers;
	}
}
