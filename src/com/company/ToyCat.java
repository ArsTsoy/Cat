package com.company;

/**
 * Игрушечный пушистый котик
 * Умеет: отображаться (display) и мяукать (meow).
 * Имплементация метода display - своя.
 */
public class ToyCat extends Cat implements Displayable,Meowable {

    public void display() {
        //display implementation

        System.out.println("Toy cat is displayed, it is soft");
    }

    @Override
    public void meow() {
        System.out.println("Does this cat meow? - Meow!");
    }

//    @Override
//    public void purr() {
//        //do nothing
//
//        System.out.println("This cat does not purr!");
//    }

//    @Override
//    public void jump() {
//        //do nothing
//
//        System.out.println("This cat does not jump!");
//    }
}
