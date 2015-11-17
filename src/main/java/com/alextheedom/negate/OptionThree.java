package com.alextheedom.negate;

import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Created by Developer on 17/11/2015.
 */
public class OptionThree {

    public static void main(String... args) {

        System.out.println(
                Stream.of(1, 2, 3, 4, 5, 6, 7).filter((c -> c % 2 != 0)).collect(toList())
        );
        System.out.println(
                Stream.of("Cat", "", "Dog")
                        .filter(str -> !str.isEmpty()).collect(toList())
        );
    }
}