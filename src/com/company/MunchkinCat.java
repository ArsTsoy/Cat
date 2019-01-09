package com.company;

/**
 * Порода кошек, с короткими лапками.
 * Умеет: мурлыкать (purr), мяукать (meow), и прыгать Низко (jump, своя имплементация)
 * Имплементация метода display - своя.
 */
public class MunchkinCat extends Cat implements Displayable, Jumpable, Purrable, Meowable {

    @Override
    public void display() {
        //display implementation

        System.out.println("Munchkin cat is displayed, he has small paws");
    }

    @Override
    public void jump() {
        //jump implementation

        System.out.println("How does this cat jump? - Jumps low");
    }

    @Override
    public void meow() {
        System.out.println("Does this cat meow? - Meow!");
    }

    @Override
    public void purr() {

    }
}