package com.fizzbuzz;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try(Scanner input = new Scanner (System.in)){
            for (int i = 1; i <= 100; i++) {
                FizzBuzz(i);
            }

        };
    }

    public static void FizzBuzz(Integer num) {
        String str = num.toString();

        System.out.println(num % 3 == 0 && num % 5 == 0 || str.contains("3") && str.contains("5")?"FizzBuzz!":
            num % 3 == 0 || str.contains("3")?"Fizz!":
            num % 5 == 0 || str.contains("5")?"Buzz!":
            (num + "!"));
    }
}
