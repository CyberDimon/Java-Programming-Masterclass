package com.CyberDimon.Section4;

public class BarkingDog {
    public static boolean bark(boolean barking, int hourOfDay) {
        if( barking && (hourOfDay < 8 && hourOfDay > -1 || hourOfDay > 22 && hourOfDay < 24) ) return true;
        return false;
    }
}
