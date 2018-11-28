package com.CyberDimon.Section4;

public class AreaCalculator {
    public static double area(double radius) {
        double pi = 3.14159;
        double area;
        if (radius < 0) return -1.0;
        return radius * radius * pi;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) return -1.0;
        return x * y;
    }
}
