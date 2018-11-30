package com.CyberDimon.Chapter7.OOPChallengeApp;

import java.util.Scanner;

public class Hamburger {

    private boolean tomatoes;
    private boolean cucumbers;
    private boolean leaf;
    private boolean mayo;
    private boolean superFriedOption;
    private boolean meat;
    private boolean breadRoll;
    private double  marketingPrice;

    /*
    *
    * Hamburger's components will effect on total price.
    * Each component has it's own price, can be changed, and will effect on total price immidiately
    *
    * */
    public Hamburger(boolean tomatoes, boolean cucumbers, boolean leaf, boolean mayo, boolean superFriedOption, boolean meat, boolean breadRoll, double marketingPrice) {

        this.tomatoes = tomatoes;
        this.cucumbers = cucumbers;
        this.leaf = leaf;
        this.mayo = mayo;
        this.superFriedOption = superFriedOption;
        this.meat = meat;
        this.breadRoll = breadRoll;
        this.marketingPrice = 0;

        PriceTable.allPricesAreReadyForBurger(
                tomatoes, cucumbers, leaf, mayo, superFriedOption, meat, breadRoll
        );

    }

    /*
    *
    * Because total price depends not only on components prices.
    * There are is one good side: discounts are also allowed.
    * (So, marketingPrice have to be negative)
    *
    * */
    public double getHamburgerPrice() {
        // ... + potatoes and nuggets?
        return PriceTable.getTotalPrice() + marketingPrice;
    }

    //

}
