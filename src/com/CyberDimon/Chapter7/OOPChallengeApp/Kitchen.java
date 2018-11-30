package com.CyberDimon.Chapter7.OOPChallengeApp;

public class Kitchen {
    private static Hamburger defaultBurger;

    public static void setDefaultPrices() {
//        PriceTable.setTomatoes(5);
//        PriceTable.setCucumbers(3);
//        PriceTable.setLeaf(2.5);
//        PriceTable.setMayo(5);
//        PriceTable.setSuperFriedOption(10);
//        PriceTable.setMeat(30);
//        PriceTable.setBreadRoll(5);

        defaultBurger = new Hamburger(
                true,true,true,true,
                false,true,true, 10);
    }

    public static Hamburger getDefaultBurger() {
        return defaultBurger;
    }
}
