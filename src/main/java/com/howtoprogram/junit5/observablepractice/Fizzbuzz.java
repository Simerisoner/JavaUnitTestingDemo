package com.howtoprogram.junit5.observablepractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.reactivex.Flowable;

public class Fizzbuzz {

	public static String[] getResult(int a, int b) {
		String[] result= {};
		if(a<b) {
		int size = (b-a)+1;
		result = new String[(size)];
			for(int i = 1; i<=b; i++) {	
				if(i%3 == 0 && i%5 == 0) {
					result[i-1] = "FizzBuzz";
				}else if(i%3 == 0)
				{
					result[i-1] = "Fizz";
				}else if(i%5 == 0) 
				{
					result[i-1] = "Buzz";
				}else {
					result[i-1] = Integer.toString(i);
				}
			}
		}
	return result;
	}
	
	public static String[] getResultObs(int a, int b) {
		String[] result = {};
		
//		Integer[] arrIntNumbers = Arrays.stream(arrNumbers).boxed().toArray(Integer[]::new);
//		List<Integer> resultList = new ArrayList<>();
//		Flowable
//		.fromArray(arrIntNumbers)
//		.filter(x -> x > 10)
//		.toList()
//		.subscribe(x -> {
//			resultList.addAll(x);
//		});
//		Flowable<Integer> flow = Flowable.range(a, b);
//		flow.subscribe();
//		System.out.println(flow.getClass());
		
		return result;
	}
}
