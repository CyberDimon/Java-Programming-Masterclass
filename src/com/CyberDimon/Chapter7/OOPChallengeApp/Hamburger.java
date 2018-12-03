package com.CyberDimon.Chapter7.OOPChallengeApp;

public class Hamburger {
    private String breadRollType = "";
    private String meat = "";
    private boolean lettuce = false;
    private boolean tomato = false;
    private boolean carrot = false;
    private boolean cheese = false;
    private double price = 0;

    public Hamburger(String breadRollType, String meat, double price) {
        if(price >= 0)
        this.price = price;

        if(breadRollType == "classic") this.price += 1.75;
        this.breadRollType = breadRollType;

        if(meat == "chicken") this.price += 9.99;
        this.meat = meat;

    }

    public void showPrice() {
        System.out.printf( "Total " + getClass().getSimpleName() + " price: %.2f", this.getPrice() );
        System.out.println();

        String priceOutput =
                "bread costs: " + 1.75 + "\n" +
                "meat costs: " + 9.99 + "\n";

        if(this.lettuce) priceOutput += "lettuce costs: " + 9.99 + "\n";
        if(this.tomato) priceOutput += "tomato costs: " + 9.99 + "\n";
        if(this.carrot) priceOutput += "carrot costs: " + 9.99 + "\n";
        if(this.cheese) priceOutput += "cheese costs: " + 9.99 + "\n";

        System.out.println(priceOutput);
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isTomato() {
        return tomato;
    }

    public boolean isCarrot() {
        return carrot;
    }

    public boolean isCheese() {
        return cheese;
    }

    public double getPrice() {
        return price;
    }

    public void setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
        this.price += 9.99;
    }

    public void setTomato(boolean tomato) {
        this.tomato = tomato;
        this.price += 9.99;
    }

    public void setCarrot(boolean carrot) {
        this.carrot = carrot;
        this.price += 9.99;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
        this.price += 9.99;
    }

    public void addToPrice(double price) {
        this.price += price;
    }

}
