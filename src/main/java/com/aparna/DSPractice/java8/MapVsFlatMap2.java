package com.aparna.DSPractice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap2 {
    public static void main(String[] args) {


    List<String> sentence = Arrays.asList("hello world", "java stream");
        List<String> collect = sentence.
                stream()
                .flatMap(s -> Arrays.stream(s.split(" "))).collect(Collectors.toList());
       // System.out.println(collect);

        List<String> values=List.of("hello soni world", "java stream");
        List<String> collect1 = values.stream().flatMap(s -> Arrays.stream(s.split(" "))).collect(Collectors.toList());
        System.out.println(collect1);
    }
}
