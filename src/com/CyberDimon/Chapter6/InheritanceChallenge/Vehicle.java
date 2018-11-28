package com.CyberDimon.Chapter6.InheritanceChallenge;

public class Vehicle {
//    private String name;
//    private String size;
    private int moving;

    public Vehicle(int moving) {
        this.moving = moving;
    }

    public void increaseSpeed() {
        this.moving++;
    }

    public void decreaseSpeed() {
        this.moving--;
    }

    public int getMoving() {
        return moving;
    }

    public void setMoving(int moving) {
        this.moving = moving;
    }

}
