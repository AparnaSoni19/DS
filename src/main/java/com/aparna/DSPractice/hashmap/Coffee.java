package com.aparna.DSPractice.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Coffee {
    public static void main(String[] args) {
        String orders = "ELCAMELCAMELCAME";
        Map<String, Integer> map = new HashMap<>();
        map.put("ELCAM", 0);
        map.put("LCAME", 0);
        map.put("CAMEL", 0);
        List<String> list = new ArrayList<>();

        for (int i = 0; i < orders.length() - 5; i++) {
            String val = orders.substring(i, i + 5);
            System.out.println(val);
            if (map.containsKey(val)) {
                map.put(val, map.get(val) + 1);
            }
        }

        for (String val : map.keySet()) {
            if (map.get(val) > 1) {
                list.add(val);
            }
        }
        System.out.println(list);
    }
}
