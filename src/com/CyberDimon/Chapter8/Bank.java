package com.CyberDimon.Chapter8;

public class Bank {
    // video 63

    // 3.
    // menu of actions

    private String name;

    public Bank(String name) {
        this.name = name;
    }

    public void enterBank() {
        boolean exit = false;
        int selection = 0;
        System.out.println("Welcome to our " + this.name + "!");
        printMenuItems();
    }

    private void printMenuItems() {
        System.out.println("Please, select your action:");
        System.out.println("\r0 - show menu list");

        System.out.println("\r1 - add customer");
        System.out.println("\r2 - remove customer");
        System.out.println("\r3 - edit customer");
        System.out.println("\r4 - search customer");

        System.out.println("\r5 - add branch");
        System.out.println("\r6 - remove branch");
        System.out.println("\r7 - update branch");
        System.out.println("\r8 - search branch");

        System.out.println("\r7 - exit");
    }

    // 4.
    // add new branch
    // add new custoemer
    // show a list of customers
    // add new transaction

}
