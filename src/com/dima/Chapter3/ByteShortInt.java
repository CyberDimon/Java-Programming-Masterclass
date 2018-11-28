package com.dima.Chapter3;

public class ByteShortInt {

    public static void main(String[] args) {

        // Int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myFinalInt = (myMinValue / 2);
        System.out.println("myFinalInt: " + myFinalInt);

        // Byte has a width of 8
        byte minByteValue = -128;
        byte maxByteValue = 127;
        byte myFinalByte = (byte) (minByteValue / 2);
        System.out.println("myFinalByte: " + myFinalByte);

        // Short has a width of 16
        short maxShortValue = 32767;
        short minShortValue = -32768;
        short myFinalShort = (short) (maxShortValue / 2);
        System.out.println("myFinalShort: " + myFinalShort);

        // Has a width of 64
        long minLongValue = -9_223_372_036_854_775_808L;
        long maxLongValue = 9_223_372_036_854_775_807L;

        // CHALLENGE
        byte newByte = 10;
        short newShort = 20;
        int newInt = 50;
        long newLong = 50_000L + 10L * (newByte + newShort + newInt);
        System.out.println("newLong: " + newLong);

    }
}
