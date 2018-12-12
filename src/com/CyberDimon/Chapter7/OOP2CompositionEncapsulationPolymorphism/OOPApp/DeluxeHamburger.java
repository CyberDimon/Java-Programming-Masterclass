package com.CyberDimon.Chapter7.OOP2CompositionEncapsulationPolymorphism.OOPApp;

public class DeluxeHamburger extends Hamburger {
    private boolean chips = true;
    private boolean drinks = true;
    public DeluxeHamburger(String breadRollType, String meat, double price) {
        super(breadRollType, meat, price);
        if(this.chips) super.addToPrice(10);
        if(this.drinks) super.addToPrice(15);
    }

    public void showPrice() {
        super.showPrice();
        if(this.chips) System.out.println("chips costs: " + 9.99);
        if(this.drinks) System.out.println("drinks costs: " + 9.99);
    }
}
