package com.iiucsdmagap.www;

public class Nilufa implements Human {

    @Override
    public void sleep() {
        System.out.println("sleeps deeply");
    }

    @Override
    public void eats() {
        System.out.println("Eats chips");
    }

    @Override
    public void runs() {
        System.out.println("runs Slowly");
    }

    @Override
    public void works() {
        System.out.println("works hard");

    }

    @Override
    public void walks() {
        System.out.println("normally");
    }
}
