package com.aparna.DSPractice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Anita", "Charlie");
        names.stream().filter(name->name.startsWith("A")).forEach(System.out::println);
        names.stream().map(String::toUpperCase).forEach(System.out::println);
        List<String> collect = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect);

    }
}
