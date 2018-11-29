package com.CyberDimon.Chapter7.CompositionChallenge;

public class Room {
    private Dimension dimension;
    private Furniture furniture;

    public Room(Dimension dimension, Furniture furniture) {
        this.dimension = dimension;
        this.furniture = furniture;
    }

    public void describeRoom() {
        System.out.println("Room dimension: " + dimension.getX() + ", " + dimension.getY() + ", " + dimension.getZ());
        furniture.lookAtTheRoom();
    }

}
