package com.CyberDimon.Chapter7.OOP2CompositionEncapsulationPolymorphism.Encapsulation;

public class Printer {

    private int paper = 0;
    private int colors;
    private String model;
    private int tonerLevel;
    private boolean duplex;

    public Printer(int paper, int colors, String model, int tonerLevel, boolean duplex) {
        this.paper = paper;
        this.colors = colors;
        this.model = model;
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
    }

    public void printPaper(int paper) {
        if (paper <= this.paper) {
            if(this.duplex)
                this.paper -= (paper / 2) + (paper % 2);
            else
                this.paper -=paper;
            System.out.println("Paper left: " + this.paper);
        }
        else System.out.println("Need more paper");
    }

    public void addPaper(int paper) {
        if (paper > 0) this.paper += paper;
        System.out.println("There are " + this.paper + " paper(s)");
    }

    public int fillToner(int substance) {
        if(substance > 0) {
            if (substance > 100)
                this.tonerLevel = 100;
            else
                this.tonerLevel += substance;
            System.out.println("Toner level: " + this.tonerLevel);
        }

        return this.tonerLevel;
    }
}
