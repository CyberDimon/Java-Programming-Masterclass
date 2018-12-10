package com.CyberDimon.Chapter8;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
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
        for(int i=0; i<this.transactions.size(); i++) {
            Double val = this.transactions.get(i).doubleValue();
            allTransactionsToPrint = allTransactionsToPrint.concat(val.toString() + "\n");
        }

        return allTransactionsToPrint;
    }
}
