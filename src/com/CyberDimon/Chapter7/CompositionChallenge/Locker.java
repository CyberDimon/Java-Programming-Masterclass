package com.CyberDimon.Chapter7.CompositionChallenge;

public class Locker {
    private Dimension dimension;
    private String material;
    private String colour;
    private Boolean usesKey;

    public Locker(Dimension dimension, String material, String colour, Boolean usesKey) {
        this.dimension = dimension;
        this.material = material;
        this.colour = colour;
        this.usesKey = usesKey;
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

    public Boolean getUsesKey() {
        return usesKey;
    }
}
