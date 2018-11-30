package com.CyberDimon.Chapter7.OOPChallengeApp;

public class Person {
    private int role = 0;
    private String name;
    private double cash = 0;

    public Person(int role, String name, double cash) {
        if (role >= 0 && role <= 2)
            this.role = role;
        else System.out.println(" .. GODMODE Disallowed");
        if (cash >= 0)
            this.cash = cash;
        else System.out.println(" .. what? Negative money?");
        this.name = name;
    }

    public int getRole() {
        return role;
    }

    public String getName() {
        return name;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }
}
