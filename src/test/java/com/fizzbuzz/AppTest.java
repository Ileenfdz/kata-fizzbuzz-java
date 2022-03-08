package com.fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void Should_Return_Buzz_If_It_Contains_The_Number_5(){
        assertEquals( "Buzz!", FizzBuzz.main(52) );
    }

    @Test
    public void Should_Return_Fizz_If_It_Contains_The_Number_3(){
        assertEquals( "Fizz!", FizzBuzz.main(23) );
    }

    @Test
    public void Should_Return_Buzz_If_It_Is_Divisible_By_The_Number_5(){
        assertEquals( "Buzz!", FizzBuzz.main(25) );
    }

    @Test
    public void Should_Return_Buzz_If_It_Is_Divisible_By_The_Number_3(){
        assertEquals( "Fizz!", FizzBuzz.main(9) );
    }

    @Test
    public void Should_Return_The_Number_Given(){
        assertEquals( "11!", FizzBuzz.main(11) );
    }
}
