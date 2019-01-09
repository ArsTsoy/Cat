package com.company;

/**
 * Порода больших кошек.
 * Умеет: мурлыкать (purr), мяукать (meow) и прыгать Высоко (jump)
 * Имплементация метода display - своя.
 */
public class MaineCoonCat extends Cat implements Displayable{

    @Override
    public void display() {
        //display implementation

        System.out.println("Maine coon cat is displayed, it is very big");
    }
}