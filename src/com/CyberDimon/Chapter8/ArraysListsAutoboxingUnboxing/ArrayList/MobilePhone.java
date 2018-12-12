package com.CyberDimon.Chapter8.ArraysListsAutoboxingUnboxing.ArrayList;

import com.CyberDimon.Chapter8.Contact;

import java.util.Scanner;

public class MobilePhone {

    private static Scanner scanner = new Scanner(System.in);
    private static Contact contactsList = new Contact(980458298, "Dima");

    public static void main(String[] args) {
        menuList();
    }

    private static void menuList() {
        System.out.println("Welcome, " + contactsList.getName() + "!");
        printMenuItems();
        int select = 0;
        boolean exit = false;

        while(!exit) {
            System.out.println("Please, select your action: ");
            if(scanner.hasNextInt()) {
                select = scanner.nextInt();
            } else {
                System.out.println("You have to type number");
                scanner.nextLine();
                continue;
            }
            scanner.nextLine();
            switch (select) {
                case 0:
                    printMenuItems();
                    break;
                case 1:
                    printList();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    editContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("There are no suche action. Please, try different number:");
                    printMenuItems();
                    break;
            }
        }
    }

    private static void printMenuItems() {
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list contacts.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To edit an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    private static void printList() {
        contactsList.printContactsList();
    }

    private static void addContact() {
        contactsList.addContact(inputContact("Please, enter contact to add: "));
    }

    private static void editContact() {
        contactsList.editContact(
                inputContact("Please, enter old contact: "),
                inputContact("Please, enter new contact: ")
        );
    }

    private static void removeContact() {
        contactsList.removeContact(inputContact("Please, enter contact to remove: "));
    }

    private static void searchContact() {
        contactsList.findContact(inputContact("Please, enter contact that you are looking for: "));
    }

    private static String inputContact(String outString) {
        System.out.println(outString + "\r");
        String contact = scanner.nextLine();
        return contact;
    }

}
