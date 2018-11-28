package com.dima.Chapter3;

public class FloatAndDouble {

    public static void main(String[] args) {
        // 32 (4 bytes)
        int myIntValue = 5 / 3;

        // 32 (4 bytes)
        float myFloatValue = 5f / 3f;

        // 64 (8 bytes)
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        float myPounds = 10f;
        float kilograms = myPounds * 0.45359237f;
        System.out.println("Кило: " + kilograms);

        double pi = 3.141_592_7d;
    }
}
