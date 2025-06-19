package com.aparna.DSPractice.hashmap;

import java.util.HashMap;
import java.util.Map;

public class CheckIfTheSentenceIsPangram {
    //Given a string sentence containing only lowercase
    // English letters, return true if sentence is a pangram, or false otherwise.

    public static void main(String[] args) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('a',1);
        map.put('b',1);
        map.put('c',1);
        map.put('d',1);
        map.put('e',1);
        map.put('f',1);
        map.put('g',1);
        map.put('h',1);
        map.put('i',1);
        map.put('j',1);
        map.put('k',1);
        map.put('l',1);
        map.put('m',1);
        map.put('n',1);
        map.put('o',1);
        map.put('p',1);
        map.put('q',1);
        map.put('r',1);
        map.put('s',1);
        map.put('t',1);
        map.put('u',1);
        map.put('v',1);
        map.put('w',1);
        map.put('x',1);
        map.put('y',1);
        map.put('z',1);
        //String sentence = "thequickbrownfoxjumpsoverthelazydog";
        String sentence = "thequickbrownfoxjumpsoverthelazydod";
        if(sentence.length() < 26)
        {
            throw new RuntimeException("Not a panagram");
        }
        for(int i =0;i< sentence.length();i++)
        {
            if(map.containsKey(sentence.charAt(i)))
            {
                map.put(sentence.charAt(i),2);
            }
        }

        for(Integer i :map.values())
        {
            if(i!=2)
            {
                throw new RuntimeException("Not a panagram");
            }
        }
        System.out.println("panagram");


    }
}
