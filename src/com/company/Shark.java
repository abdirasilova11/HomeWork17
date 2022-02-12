package com.company;

public class Shark extends Animal{

    public Shark() {
    }

    @Override
    void eat() {
        System.out.println("Shark eat little fishs.");
    }

   public Shark attack(){
        System.out.println("Акула атакует маленькему рыбу");
       return null;
   }
}
