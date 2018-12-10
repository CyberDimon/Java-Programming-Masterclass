package com.CyberDimon.Chapter8;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    // video №63-64

    private String name;
    private ArrayList<Branch> branches = new ArrayList<Branch>();
    private Scanner scanner = new Scanner(System.in);

    public Bank(String name) {
        this.name = name;
    }

    // "Enter the bank" - makes more sense (in opposite to Bank's constructor)
    public void enterBank() {
        boolean exit = false;
        int selection = 0;
        System.out.println("Welcome to our " + this.name + "!");
        System.out.println(getParsedMenuItems());

        while(!exit) {
            System.out.println("Enter your choice: ");
            if(!scanner.hasNextInt()) {
                System.out.println("Enter a number!");
                scanner.nextLine();
                continue;
            }
            selection = scanner.nextInt();
            scanner.nextLine();

            switch (selection) {
                case 0:
                    System.out.println(getParsedMenuItems());
                    break;
                case 1:
                    // add customer
                    break;
                case 2:
                    // remove customer
                    break;
                case 3:
                    // edit customer
                    break;
                case 4:
                    // search customer
                    break;
                case 5:
                    addBranch();
                    break;
                case 6:
                    removeBranch();
                    break;
                case 7:
                    updateBranch();
                    break;
                case 8:
                    // search branch/customer
                    break;
                case 9:
                    System.out.println(getParsedBranchesList());
                    break;
                case 10:
                    exit = true;
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Unknown selection");
                    break;
            }
        }

    }

    /*
    *
    * CRUD operations for branches
    *
    * */

    public boolean addBranch() {
        String branchName = inputString("Enter your branch (and customer) name: ");
        if(findBranch(branchName) == null) {
            this.branches.add(new Branch(
                    branchName,
                    inputDouble("Type initial amount: ")
            ));
            return true;
        }

        return false;
    }

    private void removeBranch() {
        String name = inputString("Enter name of branch to remove: ");
        int index = findBranchIndex(name);
        if (index > -1) {
            branches.remove(index);
            System.out.println("Branch with name " + name + " is removed.");
        } else {
            System.out.println("Cannot remove branch with name '" + name + "'");
        }
    }

    private void updateBranch() {
        String oldBranchName = inputString("Input name of branch: ");
        int oldIndex = findBranchIndex(oldBranchName);
        if (oldIndex > -1) {
            System.out.println("[1]Update username\n[2]transaction\n[3]branch name\nor [0] to exit.");

            boolean exit = false;
            while(!exit) {
                int selection = inputInteger("Input your selection:");

                switch (selection) {
                    case 0:
                        exit = true;
                        break;
                    case 1:
                        changeUserName(oldBranchName, inputString("Type new name for user: "));
                        break;
                    case 2:
                        changeTransaction(oldIndex, oldBranchName);
                        break;
                    case 3:
                        changeBranchName(oldBranchName);
                        break;
                    default:
                        System.out.println("Inproper selection. Try again.");
                }
            }

        } else {
            System.out.println("There are no such " + oldBranchName);
        }

    }

    /*
     *
     * Methods for working with customer
     *
     * */

    private void changeUserName(String oldName, String newName) {
        System.out.println("Change user name ..");
    }

    private void changeBranchName(String oldName) {
        System.out.println("Change branch name ..");
    }

    private void changeTransaction(int branchIndex, String oldName) {
        System.out.println("Change transaction ..");
    }

    /*
    *
    * Methods for compiling String of branches/customer's transactions
    *
    * */

    private String getParsedTransactionsList() {
        String allTransactionsToPrint = "";

        return allTransactionsToPrint;
    }

    private String getParsedBranchesList() {
        String allBranchesToPrint = "";

        for(int i=0; i<this.branches.size(); i++) {
            String branchName = this.branches.get(i).getName();
            String transactionList = this.branches.get(i).getClientTransactions(branchName);
            allBranchesToPrint = allBranchesToPrint.concat("Branch Name: " + branchName.toString() + "\n");
            //branchList.concat("Customer Name: " + branches.get(i).); // return customer name ..
            allBranchesToPrint = allBranchesToPrint.concat("Customer transactions: " + transactionList.toString()); // client's name ..
        }

        return allBranchesToPrint;
    }

    /*
    * ... why it returns last appended substring !?
    * */
    private String getParsedMenuItems() {
        StringBuilder menuItems = new StringBuilder()
                .append("Please, select your action:")
                .append("\r0 - show menu list")
                .append("\r1 - add customer")
                .append("\r2 - remove customer")
                .append("\r3 - edit customer")
                .append("\r4 - search customer")
                .append("\r5 - add branch")
                .append("\r6 - remove branch")
                .append("\r7 - update branch")
                .append("\r8 - search branch")
                .append("\r9 - print branches list")
                .append("\r10 - exit");

        return menuItems.toString();
    }

    /*
    *
    * Methods for searching customers(as objects), their index numbers,
    * branches(as objects), their index numbers
    *
    * */

    private Branch findBranch(String branchName) {
        for(int i=0; i<branches.size(); i++) {
            Branch checkedBranch = this.branches.get(i);
            if(checkedBranch.getName().equals(branchName)) {
                return checkedBranch;
            }
        }

        return null;
    }

    private int findBranchIndex(String branchName) {
        for(int i=0; i<branches.size(); i++) {
            Branch checkedBranch = this.branches.get(i);
            if(checkedBranch.getName().equals(branchName)) {
                return i;
            }
        }

        return -1;
    }

    private Customer findCustomer(String branchName, String customerName) {
        Branch branch = findBranch(branchName);
        Customer customer = branch.findCustomer(customerName);
        return customer;
    }

    private int findCustomerIndex(String branchName, String customerName) {
        Branch branch = findBranch(branchName);
        int customerIndex = branch.findCustomerIndex(customerName);
        return customerIndex;
    }

    /*
    *
    * Methods for inputing strings and numbers
    *
    * */

    private String inputString(String whatToInput) {
        System.out.println(whatToInput);
        return scanner.nextLine();
    }

    private Double inputDouble(String whatToInput) {
        System.out.println(whatToInput);
        Double transaction = null;

        do {
            if (!scanner.hasNextDouble()) {
                System.out.println("Enter number!");
                scanner.nextLine();
            } else {
                transaction = scanner.nextDouble();
                scanner.nextLine();
                return transaction;
            }
        } while(!scanner.hasNextDouble());

        return transaction;
    }

    private Integer inputInteger(String whatToInput) {
        System.out.println(whatToInput);
        Integer intVal = null;

        do {
            if (!scanner.hasNextInt()) {
                System.out.println("Enter number!");
                scanner.nextLine();
            } else {
                intVal = scanner.nextInt();
                scanner.nextLine();
                return intVal;
            }
        } while(!scanner.hasNextInt());

        return intVal;
    }

}
