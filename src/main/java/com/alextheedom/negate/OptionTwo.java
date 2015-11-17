package com.alextheedom.negate;

import java.util.function.Predicate;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Created by Developer on 17/11/2015.
 */
public class OptionTwo {

    public static <T> Predicate<T> predicate(Predicate<T> predicate) {
        return predicate;
    }

    public static void main(String... args) {
        System.out.println(
                Stream.of("Cat", "", "Dog")
                        .filter(predicate(String::isEmpty).negate())
                        .collect(toList())
        );

    }

}
