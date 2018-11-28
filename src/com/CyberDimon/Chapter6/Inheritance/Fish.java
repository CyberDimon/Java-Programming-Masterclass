package com.CyberDimon.Chapter6.Inheritance;

public class Fish extends Animal {

    private int gills;
    private int eyes;
    private int ins;

    public Fish(String name, int brain, int body, int size, int weight, int gills, int eyes, int ins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.ins = ins;
    }

    private void rest() {

    }

    private void moveMuscules() {

    }

    private void moveBackFin(){

    }

    private void swim(int speed) {
        moveMuscules();
        moveBackFin();
        super.move(speed);

    }


}
