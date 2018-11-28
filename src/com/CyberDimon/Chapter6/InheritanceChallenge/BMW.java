package com.CyberDimon.Chapter6.InheritanceChallenge;

public class BMW extends Car {
    private String color;
    private double price;

    public BMW(String color, double price) {
        super(120, "auto", true);
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
