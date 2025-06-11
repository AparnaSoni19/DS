package com.aparna.DSPractice.java8;

import java.util.Arrays;
import java.util.List;

public class Lamda {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Anita", "Charlie");
        withoutLamda(names);
        withLamda(names);
        withLamdaUpper(names);
        withLamdaReduce(names);

    }

    private static void withLamda(List<String> names) {
        System.out.println("with Lamda");
        names.stream().filter(name->name.startsWith("A")).forEach(System.out::println);

    }

    private static void withLamdaReduce(List<String> names) {
        System.out.println("with Lamda");
        String reduce = names.stream().reduce("", (a, b) -> a + b);
        System.out.println(reduce);
    }
    private static void withLamdaUpper(List<String> names) {
        System.out.println("with Lamda Upper");
        names.stream().filter(name->name.startsWith("A")).map(String::toUpperCase)
                .forEach(System.out::println);
    }

    private static void withoutLamda(List<String> names) {
        System.out.println("Without Lamda");
        for(String name :names)
        {
            if(name.startsWith("A"))
            {
                System.out.println(name);
            }
        }
    }
}
