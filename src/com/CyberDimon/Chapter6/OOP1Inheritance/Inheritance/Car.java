package com.CyberDimon.Chapter6.OOP1Inheritance.Inheritance;

public class Car extends Vehicle {
    private String steering;
    private Boolean changingGears;

    public Car(int moving, String steering, Boolean changingGears) {
        super(moving);
        this.steering = steering;
        this.changingGears = changingGears;
    }

    public void changeGears() {
        if(changingGears)
            System.out.println("Changing ..");
        else
            System.out.println("Unchangable");
    }

    public String getSteering() {
        return steering;
    }

    public void setSteering(String steering) {
        this.steering = steering;
    }

    public Boolean getChangingGears() {
        return changingGears;
    }

    public void setChangingGears(Boolean changingGears) {
        this.changingGears = changingGears;
    }

}
