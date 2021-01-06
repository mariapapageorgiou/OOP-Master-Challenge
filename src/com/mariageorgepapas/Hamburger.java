package com.mariageorgepapas;

public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String firstAdditionName;
    private double firstAdditionPrice;

    private String secondAdditionName;
    private double secondAdditionPrice;

    private String thirdAdditionName;
    private double thirdAdditionPrice;

    private String fourthAdditionName;
    private double fourthAdditionPrice;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerFirstAddition(String name, double price) {
        this.firstAdditionName = name;
        this.firstAdditionPrice = price;
    }

    public void addHamburgerSecondAddition(String name, double price) {
        this.secondAdditionName = name;
        this.secondAdditionPrice = price;
    }
    public void addHamburgerThirdAddition(String name, double price) {
        this.thirdAdditionName = name;
        this.thirdAdditionPrice = price;
    }
    public void addHamburgerFourthAddition(String name, double price) {
        this.fourthAdditionName = name;
        this.fourthAdditionPrice = price;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger on a " + this.breadRollType
                + " roll with " + this.meat + ", price is " + this.price);
        if(this.firstAdditionName != null) {
            hamburgerPrice += this.firstAdditionPrice;
            System.out.println("Added " + this.firstAdditionName + " for an extra " + this.firstAdditionPrice);
        }
        if(this.secondAdditionName != null) {
            hamburgerPrice += this.secondAdditionPrice;
            System.out.println("Added " + this.secondAdditionName + " for an extra " + this.secondAdditionPrice);
        }
        if(this.thirdAdditionName != null) {
            hamburgerPrice += this.thirdAdditionPrice;
            System.out.println("Added " + this.thirdAdditionName + " for an extra " + this.thirdAdditionPrice);
        }
        if(this.fourthAdditionName != null) {
            hamburgerPrice += this.fourthAdditionPrice;
            System.out.println("Added " + this.fourthAdditionName + " for an extra " + this.fourthAdditionPrice);
        }

        return hamburgerPrice;

    }
}
