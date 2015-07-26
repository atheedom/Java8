package com.alextheedom.functionalinterface;

/**
 * Created by atheedom on 26/07/15.
 */
public class Car implements Vehicle {

    public void drive(){
        System.out.println("Driving forward");
    }

    public static void main(String... args){
        Car delorean = new Car();
        delorean.drive();
        delorean.fly();
    }
}
