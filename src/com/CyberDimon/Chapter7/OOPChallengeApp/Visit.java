package com.CyberDimon.Chapter7.OOPChallengeApp;

import java.util.Scanner;

public class Visit {

    private Person person;

    // Can make orders, knows total price
    private boolean orderMode = false;
    // Can eat food with discounts and knows about pricing policy
    private boolean workerMode = false;
    // Can set prices
    private boolean managerMode = false;
    private Hamburger defaultBurger;

    public Visit(int role, String name, double cash) {
        this.person = new Person(role, name, cash);
        Kitchen.setDefaultPrices();
        this.defaultBurger = Kitchen.getDefaultBurger();

        System.out.println("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---");
        System.out.println("Wellcome to 'Happy Burger', " + this.person.getName() + "!");
        if(this.person.getRole() == 0) {
            System.out.println("You are a visitor, and you have " + this.person.getCash() + "$");
        } else if (this.person.getRole() == 1) {
            System.out.println("You are a worker");
        } else if (this.person.getRole() == 2) {
            System.out.println("You are a manager");
        }
        System.out.println("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---");

        if(this.person.getRole() >= 0) this.orderMode = true;
        if(this.person.getRole() >= 1) this.workerMode = true;
        if(this.person.getRole() >= 2) this.managerMode = true;

        chooseYourAction();
    }

    private void chooseYourAction() {

        Scanner menuScanner = new Scanner(System.in);
        int code = -1;
        boolean hasNextInt;

        do {
            hasNextInt = false;
            code = -1;

            System.out.println("What can we do for you? (" + this.person.getCash() + ")");
            System.out.println("[0] - exit");

            if(this.person.getRole() == 2)
                System.out.println("[1] - set some prices");

            if(true)
                System.out.println("[2] - buy classic hamburger for " + this.defaultBurger.getHamburgerPrice() + "$");


            System.out.println("select your action number: ");
            hasNextInt = menuScanner.hasNextInt();

            if(hasNextInt)
                code = menuScanner.nextInt();
            else System.out.println("No! You have to type a number");

            menuScanner.nextLine();

            if(code == 0) break;

            switch(code) {
                case 1:

                    break;
                case 2:
                    if(this.person.getCash() - this.defaultBurger.getHamburgerPrice() > 0) {
                        this.person.setCash(this.person.getCash() - this.defaultBurger.getHamburgerPrice());
                        System.out.println("You ordered classic hamburger only for " + this.defaultBurger.getHamburgerPrice() + "$");
                    }
                    else
                        System.out.println("You can not buy that burger.");
                    break;

                case 3:
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Unknow action. Try again.");
            }

        } while(code != 0);

        menuScanner.close();
        System.out.println("Thank you, " + this.person.getName() + "! Visit us again!");
    }
}
