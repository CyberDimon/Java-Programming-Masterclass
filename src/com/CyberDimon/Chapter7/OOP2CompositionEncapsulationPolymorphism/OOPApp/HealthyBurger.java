package com.CyberDimon.Chapter7.OOP2CompositionEncapsulationPolymorphism.OOPApp;

public class HealthyBurger extends Hamburger {
    private boolean leaf;
    private boolean onion;

    public HealthyBurger(String meat, double price, boolean leaf, boolean onion) {
        super("brown rye bread roll", meat, price);

        if(leaf) super.addToPrice(3.25);
        this.leaf = leaf;
        if(leaf) super.addToPrice(100);
        this.onion = onion;
    }

    public void showPrice() {
        super.showPrice();
        if(this.leaf) System.out.println("leaf costs: " + 9.99);
        if(this.onion) System.out.println("onion costs: " + 9.99);
    }

    public boolean isLeaf() {
        return leaf;
    }

    public boolean isOnion() {
        return onion;
    }
}
