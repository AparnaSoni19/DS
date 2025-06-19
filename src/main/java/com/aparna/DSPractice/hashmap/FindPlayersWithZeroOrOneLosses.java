package com.aparna.DSPractice.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindPlayersWithZeroOrOneLosses {
    public static void main(String[] args) {
        int[][] matches ={{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}};
        Map<Integer,Integer> winnerMap = new HashMap<>();
        Map<Integer,Integer> looserMap = new HashMap<>();
        List<Integer> listWinner = new ArrayList<>();
        List<Integer> listLooser = new ArrayList<>();
        List<List<Integer>> listOfList = new ArrayList<>();
        for (int i = 0; i < matches.length; i++) {
            winnerMap.put(matches[i][0],  winnerMap.getOrDefault(matches[i][0],0)+1);
        }

        // Print second elements
        for (int i = 0; i < matches.length; i++) {
            looserMap.put(matches[i][1],  looserMap.getOrDefault(matches[i][1],0)+1);
        }
       for( Integer i:winnerMap.keySet())
       {
           if(!looserMap.containsKey(i))
           {
               listWinner.add(i);
           }
       }

        for( Integer i:looserMap.keySet())
        {
            if(looserMap.get(i)==1)
            {
                listLooser.add(i);
            }
        }
        listOfList.add(listWinner);
        listOfList.add(listLooser);

        System.out.println(listOfList);
    }
}
