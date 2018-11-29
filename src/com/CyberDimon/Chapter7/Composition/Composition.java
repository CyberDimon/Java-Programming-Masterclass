package com.CyberDimon.Chapter7.Composition;

public class Composition {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27 inch Beast", "Acer", "27, wide",
                new Resolution(2540, 1440) );

        Motherboard theMotherboard = new Motherboard("B3-200", "Asus",4,6,"v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();

    }
}
