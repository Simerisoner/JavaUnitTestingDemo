package com.howtoprogram.junit5.observablepractice;

import org.junit.jupiter.api.*;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class FizzbuzzTest {
    
    @Test
    @DisplayName("Should validate fizzbuzz")
    void validateFizzbuzz() {
        
        String[] listExpected = {"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz"};
        List<String> result = Fizzbuzz.getResult(1,10);
        String[] resultArr = new String[result.size()];
        resultArr = result.toArray(resultArr);
        
        assertArrayEquals(listExpected, resultArr);
    }
    
    @Test
    @DisplayName("Should validate fizzbuzz")
    void validateFizzbuzzEmpty() { 
        String[] listExpected = {};
        List<String> result = Fizzbuzz.getResult(100,10);
        String[] resultArr = new String[result.size()];
        resultArr = result.toArray(resultArr);
        
        assertArrayEquals(listExpected,resultArr);
    }
  
}
