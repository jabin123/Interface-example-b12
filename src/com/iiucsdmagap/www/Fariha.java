package com.iiucsdmagap.www;

public class Fariha implements Human {

    @Override
    public void sleep() {
        System.out.println("sleeps sound");
    }

    @Override
    public void eats() {

        System.out.println("She ests spicy");
    }

    @Override
    public void runs() {
        System.out.println("Runs fast");
    }

    @Override
    public void works() {
        System.out.println("Attentively");
    }

    @Override
    public void walks() {
        System.out.println("slowly");
    }
}
