package com.CyberDimon.Chapter7.PolymorphismChallenge;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private boolean engine;
    private int cylindres;

    public Car(String model, int cylindres, boolean engine) {
        this.model = model;
        this.cylindres = cylindres;
    }

    public void getCarLogo() {
        System.out.println("[Car] There are no logo");
    }

    public void startEngine() {
        if(engine)
            System.out.println("[Car] Start Engine");
        else
            System.out.println("[Car] Nothing to start!");
    }

    public int accelerate(int accelerate) {
        if (accelerate > 0)
            this.cylindres += accelerate;
        System.out.println("[Car] Accelerate cylindres");
        return this.cylindres;
    }

    public void breakEngine() {
        System.out.println("[Car] Break engine..");
    }

    public String getModel() {
        return model;
    }

    public int getCylindres() {
        return cylindres;
    }
}

class BMW extends Car {
    public BMW(String model, int cylindres) {
        super(model, cylindres, true);
    }

    @Override
    public void getCarLogo() {
        System.out.println("#BMW#");
    }
}

class Zapor extends Car {
    public Zapor(String model, int cylindres) {
        super(model, cylindres, false);
    }

    @Override
    public void getCarLogo() {
        System.out.println("..");
    }
}
