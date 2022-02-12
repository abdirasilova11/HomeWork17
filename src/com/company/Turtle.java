package com.company;

public class Turtle extends Animal{

    public Turtle() {
    }

    @Override
    void eat() {
        System.out.println("Turtle what eat I don't no.");
    }

    public Turtle swim(){
        System.out.println("Скорость черепахи 0.3 км/ч");
        return null;
    }

}
