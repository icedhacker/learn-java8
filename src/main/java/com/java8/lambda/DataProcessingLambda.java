package com.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DataProcessingLambda {

    public static void main(String[] args) {
        List<String> input = Arrays.asList("Hello", "World");
        List<String> result = new ArrayList<>();

        Consumer<String> c1 = System.out::println; // (String s) -> System.out.println(s);
        Consumer<String> c2 = (String s) -> result.add(s.toUpperCase());

        // Example of chaining Consumers.
        input.forEach(c1.andThen(c2));
        result.forEach(c1);
    }
}
