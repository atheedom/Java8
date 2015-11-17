package com.alextheedom.negate;

import java.util.function.Predicate;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Created by Developer on 17/11/2015.
 */
public class OptionOne {

    public static <R> Predicate<R> not(Predicate<R> predicate) {
        return predicate.negate();
    }

    public static void main(String... args) {
        System.out.println(
                Stream.of(1, 2, 3, 4, 5, 6, 7).filter(not(c -> c % 2 == 0)).collect(toList())
        );
        System.out.println(
                Stream.of(1, 2, 3, 4, 5, 6, 7).filter(((Predicate<Integer>) c -> c % 2 == 0).negate()).collect(toList())
        );
    }
}
