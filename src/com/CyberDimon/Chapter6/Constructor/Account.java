package com.CyberDimon.Chapter6.Constructor;

public class Account {

    private int number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account() {
        // this() - first line!
        this(111111, 0.00, "Default", "nomail", "000 000 000");
//        System.out.println("Empty constructor");
    }

    public Account(int number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
//        System.out.println("Constructor with paremeters");

        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;

//        setNumber(number);
//        setBalance(balance);
//        setCustomerName(customerName);
//        setCustomerEmailAddress(customerEmailAddress);
//        setCustomerPhoneNumber(customerPhoneNumber);
    }

    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this(111111, 0.00, customerName, customerEmailAddress, customerPhoneNumber);
//        this.customerName = customerName;
//        this.customerEmailAddress = customerEmailAddress;
//        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double depositAmmount) {
        this.balance += depositAmmount;
        System.out.println("Deposit of " + depositAmmount + " made. New balance is " + this.balance);
    }

    public void widthdrawal(double widthrawalAmmount) {
        if(this.balance - widthrawalAmmount <0) {
            System.out.println("Only " + this.balance + " available. Widthdrawal not processed.");
        } else {
            this.balance -= widthrawalAmmount;
            System.out.println("Widthrawal of " + widthrawalAmmount + " processed. Remaining balance = " + this.balance);
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
