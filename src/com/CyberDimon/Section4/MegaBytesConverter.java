package com.CyberDimon.Section4;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        String answer;
        if (kiloBytes < 0) {
            answer = "Invalid Value";
        }
        else {
            answer = kiloBytes + " KB = " + (kiloBytes / 1024) + " MB and " + (kiloBytes % 1024) + " KB";
        }
        System.out.println(answer);
    }
}
