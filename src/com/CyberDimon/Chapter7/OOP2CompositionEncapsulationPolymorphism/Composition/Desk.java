package com.CyberDimon.Chapter7.OOP2CompositionEncapsulationPolymorphism.Composition;

public class Desk {
    private Dimension dimension;
    private String material;
    private String colour;

    public Desk(Dimension dimension, String material, String colour) {
        this.dimension = dimension;
        this.material = material;
        this.colour = colour;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }
}
