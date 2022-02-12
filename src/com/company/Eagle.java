package com.company;

public class Eagle extends Animal {

    public Eagle() {
    }

    @Override
    void eat() {
        System.out.println("Eagle eat meat.");
    }

    public Eagle fly(){
        System.out.println("Орел летит высоко");
        return null;
    }
}
