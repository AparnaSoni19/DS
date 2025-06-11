package com.aparna.DSPractice.java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapVsFlatMap {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("Aparna");
        list.add("Soni");
        list.add("AADya");
        list.add("Divya");

        List<String> list1 = new ArrayList();
        List<String> list2 = new ArrayList();
        list1.add("Aparna");
        list1.add("Soni");
        list2.add("AADya");
        list2.add("Divya");
        List<List<String>> names = new ArrayList<>();
        names.add(list1);
        names.add(list2);


       // names.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(a-> System.out.println(a));

       // names.stream().flatMap(l->l.stream()).forEach(a-> System.out.println(a.toLowerCase(Locale.ROOT)));
        List<String> collect = names.stream().flatMap(Collection::stream).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect);
        // list.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(a-> System.out.println(a));
    }
}
