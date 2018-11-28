package com.dima.Chapter4;

public class MethodOverloading {

    public static void main(String[] args) {
        //int newScore = calculateScore("Dima", 1000);
        //System.out.println("NewScore: " + newScore);
        //calculateScore();
        //calcFeetAndInchesToCentimeters(2,12);
        calcFeetAndInchesToCentimeters(157);

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && inches >= 0 && inches <= 12) {
            double centimeters = feet * 30.48 + inches * 2.54;
            System.out.println("centimeters = " + centimeters);
            return centimeters;
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            // calc feet in inches
            int feet = (int) (inches / 12);
            if (feet != 0 ) inches -= feet * 12;
            calcFeetAndInchesToCentimeters(feet, inches);
            //System.out.println("feets = " + feet);
        }
        return -1;
    }

//    public static int calculateScore(String playerName, int score) {
//        System.out.println("Player: " + playerName + " scored " + score + " points");
//        return score * 1000;
//    }
//
//    public static int calculateScore(int score) {
//        System.out.println("I scored " + score + " points");
//        return score * 1000;
//    }
//
//    public static int calculateScore() {
//        System.out.println("No player score ..");
//        return 0;
//    }
}
