package com.CyberDimon.Chapter3;

public class Strings {
    public static void main(String[] args) {
        String myString = "This is a string";
        System.out.println("str = " + myString);
        String newString = "str: " + myString + '\u00A9';
        System.out.println(newString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("Result: " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = myInt + lastString;
        System.out.println("str + int: " + lastString);
    }
}
