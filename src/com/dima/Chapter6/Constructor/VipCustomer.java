package com.dima.Chapter6.Constructor;

public class VipCustomer {
    private String name;
    private int creditLimit;
    private String email;

    public VipCustomer() {
        this("noname", 0, "nomail");
    }

    VipCustomer(String name, int creditLimit) {
        this(name, creditLimit, "nomail");
    }

    VipCustomer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
