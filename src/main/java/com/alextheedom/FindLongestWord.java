package com.alextheedom;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by atheedom on 21/08/15.
 */
public class FindLongestWord {


    public static void main(String... args) {

        List<String> words = new ArrayList<>();
        words.add("House");
        words.add("Looking");
        words.add("Chocolate");
        words.add("Globe");
        words.add("I");
        words.add("Pi");
        words.add("Sea");
        words.add("Dogs");
        words.add("Computers");
        words.add("References");

        int max = words.stream().mapToInt(String::length).max().getAsInt();
        System.out.println(max);


        String i = words.stream().reduce((s, s2) -> {
            if (s.length() > s2.length()) {
                return s;
            } else {
                return s2;
            }
        }).get();
        System.out.println(i);


        int y = words.stream()
                .mapToInt(String::length)
                .reduce((s, s2) -> {
                    if (s > s2) {
                        return s;
                    } else {
                        return s2;
                    }
                }).getAsInt();
        System.out.println(y);




    }


}
