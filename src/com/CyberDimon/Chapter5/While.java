package com.CyberDimon.Chapter5;

public class While {

    public static void main(String[] args) {
        int count = 0;
        while(count != 5) {
            System.out.println("Count value is " + count);
            count++;
        }

        for (int i = 1; i < 7; i++) {
            System.out.println("Count value is " + i);
        }

        int countNotEvens = 0;
        int number = 4;
        int finishNumber = 20;

        while (number <= finishNumber) {
            number++;
            if(countNotEvens == 5) break;
            if(!(isEvenNumber(number))) {
                countNotEvens++;
                continue;
            }
            System.out.println("Even number: " + number);
        }

    }

    public static boolean isEvenNumber(int number) {
        if(number % 2 == 0) return true;
        else return false;
    }
}
