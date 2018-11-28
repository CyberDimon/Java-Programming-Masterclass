package com.CyberDimon.Chapter3;

public class Operators {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        result *= 10;
        result %= 3;
        result++;

        System.out.println("result = " + result);

        boolean isAlien = false;

        if(!isAlien)
            System.out.println("I'm not an Alien!");

        int topScore = 99;
        if (topScore == 100 || topScore >= 90)
            System.out.println("TOPSCORE IS " + topScore + " !");

        boolean wasAlien = isAlien ? true : false;
        System.out.println(wasAlien);

        double myFirstDouble = 20;
        double mySecondDouble = 80;
        double myDoubleSum = (myFirstDouble + mySecondDouble) * 25;
        System.out.println("myDoubleSum: " + myDoubleSum);
        double myDoubleReminder = myDoubleSum % 40;
        if(myDoubleReminder <= 20)
            System.out.println("Total was over limit");

    }
}
