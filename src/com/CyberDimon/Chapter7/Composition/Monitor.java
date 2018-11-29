package com.CyberDimon.Chapter7.Composition;

public class Monitor {
    private String model;
    private String manufacturer;
    private String size;
    // Composition - Resolution class as component of Monitor
    private Resolution nativeResolution;

    public Monitor(String model, String manufacturer, String size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + "," + y + " in colour " + color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
