package com.howtoprogram.junit5.observablepractice;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class FizzbuzzTest {
    
    @Test
    @DisplayName("Should validate fizzbuzz")
    void validateFizzbuzz() {
        
        String[] listExpected = {"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz"};
        String[] result = Fizzbuzz.getResult(1,10);
        assertArrayEquals(listExpected,result);
    }
    
    @Test
    @DisplayName("Should validate fizzbuzz")
    void validateFizzbuzzEmpty() { 
        String[] listExpected = {};
        String[] result = Fizzbuzz.getResult(100,10);
        assertArrayEquals(listExpected,result);
    }
    
    @Test
    @DisplayName("Sholud validate with Observable")
    void validateWithObservable() {
    	String[] listExpected = {};
        String[] result = Fizzbuzz.getResultObs(100,10);
        assertArrayEquals(listExpected,result);
    }
}
