package com.howtoprogram.junit5.observablepractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.reactivex.Flowable;

public class Fizzbuzz {
	
	public static List<String> getResult(int a, int b) {
		List<String> lista = new ArrayList<>();
		Flowable.range(a, b).subscribe(x -> {
			if(x % 3 == 0 && x%5 == 0) {
				lista.add("FizzBuzz");
			}else if(x%3 == 0){
				lista.add("Fizz");
			}else if(x%5 == 0){
				lista.add("Buzz");
			}else {
				lista.add(Integer.toString(x));
			}
		});
		
		System.out.println(lista);
		return lista;
	}
	

//	public static String[] getResult(int a, int b) {
//		String[] result= {};
//		if(a<b) {
//			
//		int size = (b-a)+1;
//		result = new String[(size)];
//		
//			for(int i = 1; i<=b; i++) {	
//				if(i%3 == 0 && i%5 == 0) {
//					result[i-1] = "FizzBuzz";
//				}else if(i%3 == 0)
//				{
//					result[i-1] = "Fizz";
//				}else if(i%5 == 0) 
//				{
//					result[i-1] = "Buzz";
//				}else {
//					result[i-1] = Integer.toString(i);
//				}
//			}
//		}
//	return result;
//	}
}
