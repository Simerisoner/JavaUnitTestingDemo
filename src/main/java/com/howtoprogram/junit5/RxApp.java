package com.howtoprogram.junit5;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Flowable;

public class RxApp {
	
	public RxApp() {}
	
	public void Fizzbuzz(int a, int b) {
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
	}
	
//	public void Fizzbuzz2(int a, int b) {
//		List<String> lista = new ArrayList<>();
//		Flowable.range(a, b).(x -> {
//			
//			
//		});
//		
//		System.out.println(lista);
//	}
	
	public static void main (String []args) {
		RxApp rx = new RxApp();
		rx.Fizzbuzz(1,15);
	}
}	
