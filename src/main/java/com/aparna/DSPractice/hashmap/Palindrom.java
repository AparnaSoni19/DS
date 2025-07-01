package com.aparna.DSPractice.hashmap;//String s = "madykaouam";//makam //maam


public class Palindrom
{
public static void main(String[] args)
{
   String s="madykaouam";
   StringBuilder sb= new StringBuilder();
   int i =0;
   int j =s.length()-1;
   while(i<j)
      {
        if(s.charAt(i)==s.charAt(j))
         {
           sb.append(s.charAt(i));
         }
       i++;
       j--;
      }
 
 for(int x =sb.length()-1;x>=0;x--)
 {
 sb.append(sb.charAt(x));
 }
 
 System.out.println(sb);
     }
 }

