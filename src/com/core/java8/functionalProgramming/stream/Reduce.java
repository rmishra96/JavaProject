package com.core.java8.functionalProgramming.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        int results= numbers.stream().reduce(0,(a,b) -> a+b);
        System.out.println(results);

        int result1s= numbers.stream().reduce(1,(a,b) -> a*b);
        System.out.println(result1s);

        Optional results2 =  numbers.stream().reduce((a, b) -> a+b);
        System.out.println(results2.get());
    }
}
