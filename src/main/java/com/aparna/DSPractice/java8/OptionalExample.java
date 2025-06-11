package com.aparna.DSPractice.java8;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

        Optional<String> name = Optional.of("Aparna");
        String engg = name.map(String::toUpperCase)
                .orElse("No engg");
        System.out.println(engg);

    }
}
