package com.CyberDimon.Chapter7.CompositionChallenge;

public class Furniture {
    private Desk desk;
    private Bed bed;
    private Locker locker;

    public Furniture(Desk desk, Bed bed, Locker locker) {
        this.desk = desk;
        this.bed = bed;
        this.locker = locker;
    }

    public void lookAtTheRoom() {
        System.out.println(
                "There are " + desk.getColour() + " desk, " + bed.getSoftness() + " bed and " +
                        locker.getMaterial() + " locker."
        );
    }

}
