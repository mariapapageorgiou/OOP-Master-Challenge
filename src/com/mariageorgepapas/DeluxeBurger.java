package com.mariageorgepapas;

public class DeluxeBurger extends Hamburger {

    // no field additions. create an empty constructor and pass the values we want through Hamburger methods.
    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.54, "white");
        super.addHamburgerFirstAddition("Chips", 2.75);
        super.addHamburgerSecondAddition("Drink", 1.81);
    }

    @Override
    public void addHamburgerFirstAddition(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerSecondAddition(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerThirdAddition(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerFourthAddition(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
}
