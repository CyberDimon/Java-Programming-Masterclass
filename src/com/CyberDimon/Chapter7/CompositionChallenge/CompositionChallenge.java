package com.CyberDimon.Chapter7.CompositionChallenge;

public class CompositionChallenge {
    public static void main(String[] args) {

        // Create a single room of a house using composition.
        // Think about the things that should be included in the room.
        // Maybe physical parts of the house but furniture as well
        // Add at least one method to access an object via a getter and
        // then that objects public method as you saw in the previous video
        // then add at least one method to hide the object e.g. not using a getter
        // but to access the object used in composition within the main class
        // like you saw in this video.

        Furniture myFurniture = new Furniture(
                new Desk(new Dimension(40,30,40),"steel + wood", "brown"),
                new Bed(new Dimension(100,45,25), "soft"),
                new Locker(new Dimension(30,110,40),"wood","brown",true)
                );
        Room myRoom = new Room(new Dimension(120,80,75), myFurniture);

        myRoom.describeRoom();
    }
}
