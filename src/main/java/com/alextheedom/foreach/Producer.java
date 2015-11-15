package com.alextheedom.foreach;

import java.util.stream.IntStream;

/**
 * Created by developer on 15/11/2015.
 */
public class Producer {
    public static void main(String... args){


        IntStream.range(1, 100).forEach(Consumer::multiplyByFive);


    }

}
