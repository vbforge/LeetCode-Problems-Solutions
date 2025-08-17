package com.vladproduction.fizz_buzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    static final String FIZZ = "FIZZ";
    static final String BUZZ = "BUZZ";
    static final String FIZZBUZZ = "FIZZBUZZ";

    //          multiples of three
    @Test
    public void multipleByThree(){
        byte[] expected = FIZZ.getBytes();
        byte[] actual = fizzBuzz.fizzbuzz(3);
        assertArrayEquals(expected,actual);
    }
    //          multiples of five
    @Test
    public void multipleByFive(){
        assertArrayEquals(BUZZ.getBytes(),fizzBuzz.fizzbuzz(5));
    }

    //          multiples of three and five
    @Test
    public void multipleByFiveAndThree(){
        assertArrayEquals(FIZZBUZZ.getBytes(),fizzBuzz.fizzbuzz(15));
    }


    @Test
    public void noMultipleByFiveAndThree() {
        assertThrows(IllegalArgumentException.class, () -> {
            fizzBuzz.fizzbuzz(19);
        });
    }

}