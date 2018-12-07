package com.CyberDimon.Chapter8;

import java.util.ArrayList;

public class Branch {

    ArrayList<Customer> customers = new ArrayList<Customer>();

    public Branch(String name, Double transaction) {
        // Brand new customer walked in to the bank and opens initial account.
        // init first customer

        // 1. check if name was not used in branch!!

        customers.add(new Customer(name));
        // init first transaction
        getCustomer(name).addTransaction(transaction);
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
        int index = findCustomer(name);
        if (index > -1) {
            return customers.get(index);
        }

        return null;
    }

    private int findCustomer(String name) {
        return customers.indexOf(name);
    }
}
