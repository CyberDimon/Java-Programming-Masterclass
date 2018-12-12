package com.CyberDimon.Chapter8.ArraysListsAutoboxingUnboxing;

import java.util.Scanner;

public class MinimumElement {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        -Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.
//
//                -The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.
//
//                -Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.
//
//                -In the main() method read the count from the console and call the method readIntegers() with the count parameter.
//
//        -Then call the findMin() method passing the array returned from the call to the readIntegers() method.
//
//                -Finally, print the minimum element in the array.
//
//        Tips:
//        -Assume that the user will only enter numbers, never letters
//                -For simplicity, create a Scanner as a static field to help with data input
//        -Create a new console project with the name eMinElementChallengef

        boolean hasNextInt = false;
        System.out.println("Enter array size: ");
        hasNextInt = scanner.hasNextInt();

        int count = 5;
        if(hasNextInt) {
            count = scanner.nextInt();
        } else {
            System.out.println("Em.. ok. It's 5 by default :)");
        }
        scanner.nextLine();

        int[] array = readIntegers(count);
        int min = findMin(array);
        System.out.println("Minimum element in array: " + min);
    }

    private static int[] readIntegers(int count) {
        int[] array = new int[count];
        boolean hasNextInt = false;
        for(int i=0; i<count; i++) {
            System.out.println("Enter [" + i + "] element: ");
            hasNextInt = scanner.hasNextInt();

            if(hasNextInt) {
                array[i] = scanner.nextInt();
            } else {
                System.out.println("Please, enter number");
                i--;
            }
            scanner.nextLine();
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        int sizeOfArray = array.length;

        for(int i=0; i<sizeOfArray; i++)
            if(array[i] < min) min = array[i];

        return min;
    }
}
