package com.alextheedom.functionalinterface;

/**
 * Created by atheedom on 26/07/15.
 */
public interface Vehicle {


    void drive();

    default public void fly(){
        System.out.println("I can fly now.");
    }



}
