package com.CyberDimon.Chapter8;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions = new ArrayList<Double>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(Double transaction) {
        transactions.add(transaction);
    }

    public void removeTransaction(Double transaction) {
        int index = transactions.indexOf(transaction);
        if (index > -1) {
            transactions.remove(index);
        }
    }

    public void editTransaction(Double oldTransaction, Double newTransaction) {
        int index = transactions.indexOf(oldTransaction);
        if (index > -1) {
            transactions.set(index, newTransaction);
        }
    }

    public String getParsedTransactionList() {
        String allTransactionsToPrint = "";
        for(int i=0; i<transactions.size(); i++) {
            Double val = transactions.get(i).doubleValue();
            allTransactionsToPrint.concat(val.toString() + "\n");
        }

        return allTransactionsToPrint;
    }
}
