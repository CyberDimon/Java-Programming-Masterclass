package com.dima.Chapter6.Classes;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = validModel;
        } else {
            this.model = null;
        }

    }

    public String getModel() {
        return this.model;
    }

}
