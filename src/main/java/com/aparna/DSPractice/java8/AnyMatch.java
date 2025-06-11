package com.aparna.DSPractice.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AnyMatch {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext())
        {
            if(iterator.next()==4)
            {
                iterator.remove();
            }
        }
        System.out.println(list);

    }
}
