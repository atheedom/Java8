package com.alextheedom.lambdas;



import java.util.function.Supplier;



public class StubService implements Runnable {

    private final Supplier<String> messageGenerator;

    public StubService( Supplier<String> messageGenerator) {
        this.messageGenerator = messageGenerator;
    }

    @Override
    public void run() {
       System.out.println(messageGenerator.get());
    }

}
