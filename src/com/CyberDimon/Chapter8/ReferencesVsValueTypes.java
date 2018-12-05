package com.CyberDimon.Chapter8;

import java.util.Arrays;

public class ReferencesVsValueTypes {
    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        // two references to same the same object in memory!
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        for(int i=0; i<anotherArray.length; i++) {
            anotherArray[i] = i+1;
        }

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        // Now anotherArray is reference to the new object
        anotherArray = new int[] {4, 5, 6, 7, 8};
        // void method!
        modifyArray(myIntArray);

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array) {
        array[0] = 222;

        // New object - another reference
        array = new int[] {111, 222, 333, 444, 555};
        array[0] = 333;
    }
}
