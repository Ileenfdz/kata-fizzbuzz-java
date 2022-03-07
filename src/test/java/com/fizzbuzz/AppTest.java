package com.fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void shouldAnswerWithFizzBuzz()
    {
        String expected = "FizzBuzz!";
        String actual = FizzBuzz.main(534);
        assertEquals( expected, actual );
    }

    @Test
    public void shouldAnswerWithBuzzIfContainsTheNumber()
    {
        String expected = "Buzz!";
        String actual = FizzBuzz.main(52);
        assertEquals( expected, actual );
    }

    @Test
    public void shouldAnswerWithFizzIfContainsTheNumber()
    {
        String expected = "Fizz!";
        String actual = FizzBuzz.main(23);
        assertEquals( expected, actual );
    }

    @Test
    public void shouldAnswerWithBuzzIfDivisibleByTheNumber()
    {
        String expected = "Buzz!";
        String actual = FizzBuzz.main(25);
        assertEquals( expected, actual );
    }

    @Test
    public void shouldAnswerWithFizzIfDivisibleByTheNumber()
    {
        String expected = "Fizz!";
        String actual = FizzBuzz.main(9);
        assertEquals( expected, actual );
    }
}
