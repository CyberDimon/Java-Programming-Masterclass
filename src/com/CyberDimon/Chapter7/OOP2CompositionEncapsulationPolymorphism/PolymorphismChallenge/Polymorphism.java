package com.CyberDimon.Chapter7.OOP2CompositionEncapsulationPolymorphism.PolymorphismChallenge;

public class Polymorphism {
    public static void main(String[] args) {
        // We are going to go back to the car analogy.
        // Create a base class called Car
        // It should have a few fields that would be appropriate for a generice car calss.
        // engine, cylinders, wheels, etc.
        // Constructor should initialize cylinders (number of) and name, and set wheels to 4
        // and engine to true. Cylinders and names would be passed parameters.
        //
        // Create appropriate getters
        //
        // Create some methods like startEngine, accelerate, and brake
        //
        // show a message for each in the base class
        // Now create 3 sub classes for your favorite vehicles.
        // Override the appropriate methods to demonstrate polymorphism in use.
        // put all classes in the one java file (this one).

        for(int i =0; i <5; i++ ) {
            Car car = randomCar();
            System.out.println("Car #" + i + " is " + car.getModel());
            car.getCarLogo();
            System.out.println();
        }

    }

    public static Car randomCar () {
        int random = (int) (Math.random() * 3) + 1; // 3 instead of 2 - sometimes it just car
        switch (random) {
            case 1:
                return new BMW("Z1", 120);
            case 2:
                return new Zapor("blue",0);
            default:
                return new Car("No model", 0,false);
        }
    }
}
