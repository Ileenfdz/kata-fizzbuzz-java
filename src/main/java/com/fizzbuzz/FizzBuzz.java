package com.fizzbuzz;

public class FizzBuzz {
    public static String main(Integer num) {
        String str = num.toString();

        return(num % 3 == 0 && num % 5 == 0 || str.contains("3") && str.contains("5")?"FizzBuzz!":
            num % 3 == 0 || str.contains("3")?"Fizz!":
            num % 5 == 0 || str.contains("5")?"Buzz!":
            (num + "!"));
    }
}
