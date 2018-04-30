package com.howtoprogram.junit5.observablepractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import io.reactivex.Flowable;

public class Fizzbuzz {
	
	public static List<String> getResult(int a, int b) {
		List<String> lista = new ArrayList<>();
		if(a<b) {
			Flowable.range(a, b).map(x -> {
				if(x % 3 == 0 && x%5 == 0) {
					return "FizzBuzz";
				}else if(x%3 == 0){
					return "Fizz";
				}else if(x%5 == 0){
					return "Buzz";
				}else {
					return Integer.toString(x);
				}
			}).toList().subscribe(x -> {
				lista.addAll(x); 
			});
		}
		
		System.out.println(lista);
		return lista;
	}
}
