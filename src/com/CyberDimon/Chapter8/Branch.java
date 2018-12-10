package com.CyberDimon.Chapter8;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name, Double initialAmount) {
        this.name = name; // name of branch
        this.customers = new ArrayList<Customer>();
        this.customers.add(new Customer(name, initialAmount));
    }

    public String getName() {
        return name;
    }

    public boolean newCustomer(String customerName, double initialAmount) {
        if(findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }

        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);

        if(findCustomer(customerName) != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }

        return false;
    }

    public Customer findCustomer(String customerName) {
        // indexOf would not work for arrayList of Customer objects
        for(int i=0; i< this.customers.size(); i++) {
            // Customer's object property
            Customer chackedCustomer = this.customers.get(i);
            if(chackedCustomer.getName().equals(customerName)) {
                return chackedCustomer;
            }
        }

        return null;
    }

    public int findCustomerIndex(String customerName) {
        // indexOf would not work for arrayList of Customer objects
        for(int i=0; i< this.customers.size(); i++) {
            // Customer's object property
            Customer chackedCustomer = this.customers.get(i);
            if(chackedCustomer.getName().equals(customerName)) {
                return i;
            }
        }

        return -1;
    }

    // 2. add transaction to client. (check if client exists)

    public String getAllClients(boolean withTransactions) {
        String allClients = "";
        for (int i=0; i<customers.size(); i++) {
            allClients.concat(customers.get(i).getName() + "\n");
            if (withTransactions) {
                allClients.concat("[Transactions table]");
                allClients.concat("--- --- --- --- --- ---");
                allClients.concat(customers.get(i).getParsedTransactionList());
                allClients.concat("--- --- --- --- --- ---\n");
            }
        }

        return allClients;
    }

    public String getClientTransactions(String name) {
        return getCustomer(name).getParsedTransactionList();
    }

    private Customer getCustomer(String name) {
        int index = findCustomerIndex(name);
        if (index > -1) {
            return customers.get(index);
        }

        return null;
    }

}
