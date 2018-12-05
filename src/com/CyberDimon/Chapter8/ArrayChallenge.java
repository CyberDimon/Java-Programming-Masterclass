package com.CyberDimon.Chapter8;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayChallenge {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Create a program using arrays that sorts a list of integers in descending order.
        // Descending order is highest value to lowest.
        // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
        // ultimately have an array with 106,81,26, 15, 5 in it.
        // Set up the program so that the numbers to sort are read in from the keyboard.
        // Implement the following methods - getIntegers, printArray, and sortIntegers
        // getIntegers returns an array of entered integers from keyboard
        // printArray prints out the contents of the array
        // and sortIntegers should sort the array and return a new array containing the sorted numbers
        // you will have to figure out how to copy the array elements from the passed array into a new
        // array and sort them and return the new sorted array.

        int n = sizeOfArray();
        int[] myArray = new int[n];
        myArray = scanArray(myArray);
        myArray = sortArray(myArray);
        printArray(myArray);
    }

    public static int sizeOfArray() {
        int size = 0;
        System.out.println("Please, enter size of array: ");
        size = scanner.nextInt();

        return size;
    }

    public static int[] scanArray(int[] array) {
        int n = array.length;
        for(int i=0; i<n; i++) {
            System.out.println("Please, enter [" + i + "] element: ");
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static int[] sortArray(int[] array) {
        int n = array.length;
        int[] sortedArray = Arrays.copyOf(array, n);
//        int[] sortedArray = new int[n];
//        for(int i=0; i<n; i++) {
//            sortedArray[i] = array[i];
//        }
        boolean flag = true;
        int temp;

        // while there are nothing to swap
        while(flag) {
            flag = false;

            // swap next and prev elements if next > prev
            for(int i=0; i<(n-1); i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }

    public static void printArray(int[] array) {
        int n = array.length;
        System.out.println();
        for(int i=0; i<n; i++) {
            System.out.println("[" + i + "] element: " + array[i]);
        }
    }

}