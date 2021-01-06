package com.mariageorgepapas;

public class HealthyBurger extends Hamburger {

    private String firstHealthyAdditionName;
    private double firstHealthyAdditionPrice;

    private String secondHealthyAdditionName;
    private double secondHealthyAdditionPrice;

    public HealthyBurger(String meat, double price) {
        super("Healthy Burger", meat, price, "Brown rye");
    }

    public void addFirstHealthyAddition(String name, double price){
        this.firstHealthyAdditionName = name;
        this.firstHealthyAdditionPrice = price;
    }

    public void addSecondHealthyAddition(String name, double price){
        this.secondHealthyAdditionName = name;
        this.secondHealthyAdditionPrice = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if(this.firstHealthyAdditionName !=null) {
            hamburgerPrice += this.firstHealthyAdditionPrice;
            System.out.println("Added " + this.firstHealthyAdditionName + " for an extra " + this.firstHealthyAdditionPrice);
        }
        if(this.secondHealthyAdditionName !=null) {
            hamburgerPrice += this.secondHealthyAdditionPrice;
            System.out.println("Added " + this.secondHealthyAdditionName + " for an extra " + this.secondHealthyAdditionPrice);
        }

        return hamburgerPrice;
    }
}
