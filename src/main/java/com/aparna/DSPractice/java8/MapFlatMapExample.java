package com.aparna.DSPractice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapFlatMapExample {
    public static void main(String[] args) {
        List<String> fruits= Arrays.asList("apple", "banana", "orange");
        //Make list of values to UPPERCASE
        System.out.println(fruits);
        List<String> collect = fruits.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect);

        List<String> collect1 = fruits
                .stream()
                .flatMap(word -> Arrays.stream(word.split("")))
                .collect(Collectors.toList());
        System.out.println(collect1);
    }
}
