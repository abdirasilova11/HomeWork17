package com.company;

public class Main {

    public static void main(String[] args) {

        Animal[] animals = {new Animal(), new Shark(), new Turtle(), new Eagle()};
        for (Animal a : animals) {
            a.eat();
        }
        System.out.println("************************");
        System.out.println(animals.getClass());
        System.out.println("*************************");

        Animal[] animals1 = {new Animal(), new Shark(), new Turtle(), new Eagle()};
        for (Animal a : animals1) {
            if (a instanceof Shark) {
                ((Shark) a).attack();
            }
        }
        System.out.println("*************************");
        Animal[] animals2 = {new Animal(), new Shark(), new Turtle(), new Eagle()};
        for (Animal a : animals2) {
            if (a instanceof Turtle) {
                ((Turtle) a).swim();
            }
        }
        System.out.println("*************************");
        Animal[] animals3 = {new Animal(), new Shark(), new Turtle(), new Eagle()};
        for (Animal a : animals2) {
            if (a instanceof Eagle) {
                ((Eagle) a).fly();
            }
        }
        System.out.println("*************************");
        Shark [] shark = new Shark[1];
        shark [0] = new Shark().attack();
        System.out.println("*************************");
        Turtle [] turtle = new Turtle[1];
        turtle [0] = new Turtle().swim();
        System.out.println("*************************");
        Eagle [] eagle = new Eagle[1];
        eagle [0] = new Eagle().fly();


    }
}