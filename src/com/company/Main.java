package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Main

{
    public static void main (String args[]){

        String friends [] = {"peterfhfhgf" , "paul ", "Ma"} ;

        Arrays.sort(friends,( first , second ) -> first.length()-second.length());
        System.out.println(Arrays.toString(friends));
        ArrayList<String> enimes = new ArrayList<>(Arrays.asList("Malfoy","crabbi","Goyle",null));

        enimes.removeIf(e -> e == null) ;
        System.out.println(enimes);



    }









}
