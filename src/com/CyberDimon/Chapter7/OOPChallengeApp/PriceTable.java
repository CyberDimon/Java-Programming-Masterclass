package com.CyberDimon.Chapter7.OOPChallengeApp;

import java.util.Scanner;

public class PriceTable {
    private static final String INVALID_PRICE = "Invalid PriceTable";
    private static final String NEED_PRICE = "Sorry, we need to know valid price for ";
    private static final String SET_PRICE = "Please, set price for ";

    private static double tomatoes = 0;
    private static double cucumbers = 0;
    private static double leaf = 0;
    private static double mayo = 0;
    private static double superFriedOption = 0;
    private static double meat = 0;
    private static double breadRoll = 0;
    private static double total = 0;

    public static boolean allPricesAreReadyForBurger(boolean tomatoes, boolean cucumbers, boolean leaf, boolean mayo, boolean superFriedOption, boolean meat, boolean breadRoll) {

        Scanner priceScanner = new Scanner(System.in);
        boolean hasNextDouble;
        double price;

        do {

            hasNextDouble = false;

            if (tomatoes && PriceTable.getTomatoes() == 0) {
                System.out.println(SET_PRICE + "tomatoes:");
                hasNextDouble = priceScanner.hasNextDouble();

                if(!hasNextDouble || !PriceTable.setTomatoes(priceScanner.nextDouble())) {
                    System.out.println(NEED_PRICE + "tomatoes!");
                    priceScanner.nextLine();
                    continue;
                }
            }

            if (cucumbers && PriceTable.getCucumbers() == 0) {
                System.out.println(SET_PRICE + "cucumbers:");
                hasNextDouble = priceScanner.hasNextDouble();

                if(!hasNextDouble || !PriceTable.setCucumbers(priceScanner.nextDouble())) {
                    System.out.println(NEED_PRICE + "cucumbers!");
                    priceScanner.nextLine();
                    continue;
                }
            }

            if (leaf && PriceTable.getLeaf() == 0) {
                System.out.println(SET_PRICE + "leaf:");
                hasNextDouble = priceScanner.hasNextDouble();

                if(!hasNextDouble || !PriceTable.setLeaf(priceScanner.nextDouble())) {
                    System.out.println(NEED_PRICE + "leaf!");
                    priceScanner.nextLine();
                    continue;
                }
            }

            if (mayo && PriceTable.getMayo() == 0) {
                System.out.println(SET_PRICE + "mayo:");
                hasNextDouble = priceScanner.hasNextDouble();

                if(!hasNextDouble || !PriceTable.setMayo(priceScanner.nextDouble())) {
                    System.out.println(NEED_PRICE + "mayo!");
                    priceScanner.nextLine();
                    continue;
                }
            }

            if (superFriedOption && PriceTable.getSuperFriedOption() == 0) {
                System.out.println(SET_PRICE + "'superFried Option':");
                hasNextDouble = priceScanner.hasNextDouble();

                if(!hasNextDouble || !PriceTable.setSuperFriedOption(priceScanner.nextDouble())) {
                    System.out.println(NEED_PRICE + "'super fried' option!");
                    priceScanner.nextLine();
                    continue;
                }
            }

            if (meat && PriceTable.getMeat() == 0) {
                System.out.println(SET_PRICE + "meat:");
                hasNextDouble = priceScanner.hasNextDouble();

                if(!hasNextDouble || !PriceTable.setMeat(priceScanner.nextDouble())) {
                    System.out.println(NEED_PRICE + "meat option!");
                    priceScanner.nextLine();
                    continue;
                }
            }

            if (breadRoll && PriceTable.getBreadRoll() == 0) {
                System.out.println(SET_PRICE + "bread roll:");
                hasNextDouble = priceScanner.hasNextDouble();

                if(!hasNextDouble || !PriceTable.setBreadRoll(priceScanner.nextDouble())) {
                    System.out.println(NEED_PRICE + "bread roll option!");
                    priceScanner.nextLine();
                    continue;
                }
            }

            //System.out.println("All required prices for " + getClass().getSimpleName() + " are setted up and correct.");
            break;
        } while (true);

        //priceScanner.close();
        return true;
    }

    // Setters
    public static boolean setTomatoes(double tomatoes) {
        if (tomatoes >0) {
            PriceTable.tomatoes = tomatoes;
            PriceTable.total += tomatoes;
        }
        else {
            System.out.println(INVALID_PRICE);
            return false;
        }
        return true;
    }

    public static boolean setCucumbers(double cucumbers) {
        if (cucumbers >0) {
            PriceTable.cucumbers = cucumbers;
            PriceTable.total += cucumbers;
        }
        else {
            System.out.println(INVALID_PRICE);
            return false;
        }
        return true;
    }

    public static boolean setLeaf(double leaf) {
        if (leaf >0) {
            PriceTable.leaf = leaf;
            PriceTable.total += leaf;
        }
        else {
            System.out.println(INVALID_PRICE);
            return false;
        }
        return true;
    }

    public static boolean setMayo(double mayo) {
        if (mayo >0) {
            PriceTable.mayo = mayo;
            PriceTable.total += mayo;
        }
        else {
            System.out.println(INVALID_PRICE);
            return false;
        }
        return true;
    }

    public static boolean setSuperFriedOption(double superFried) {
        if (superFried >0) {
            PriceTable.superFriedOption = superFried;
            PriceTable.total += superFried;
        }
        else {
            System.out.println(INVALID_PRICE);
            return false;
        }
        return true;
    }

    public static boolean setMeat(double meatPrice) {
        if (meatPrice >0) {
            PriceTable.meat = meatPrice;
            PriceTable.total += meatPrice;
        }
        else {
            System.out.println(INVALID_PRICE);
            return false;
        }
        return true;
    }

    public static boolean setBreadRoll(double breadRollPrice) {
        if (breadRollPrice >0) {
            PriceTable.breadRoll = breadRollPrice;
            PriceTable.total += breadRollPrice;
        }
        else {
            System.out.println(INVALID_PRICE);
            return false;
        }
        return true;
    }

    // Getters
    public static double getTomatoes() {
        return tomatoes;
    }

    public static double getCucumbers() {
        return cucumbers;
    }

    public static double getLeaf() {
        return leaf;
    }

    public static double getMayo() {
        return mayo;
    }

    public static double getSuperFriedOption() {
        return superFriedOption;
    }

    public static double getMeat() {
        return meat;
    }

    public static double getBreadRoll() {
        return breadRoll;
    }

    public static double getTotalPrice() {
        return total;
    }
}
