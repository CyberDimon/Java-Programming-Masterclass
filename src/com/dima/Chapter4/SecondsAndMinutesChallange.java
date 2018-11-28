package com.dima.Chapter4;

public class SecondsAndMinutesChallange {
    public static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        //System.out.println(getDurationString(100));
        //System.out.println(getDurationString(3231,-12));
        //printYearsAndDays(525600);
        System.out.println(isCatPlaying(true, 10));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (!summer && (temperature >= 25 && temperature <= 35) ) return true;
        else if(summer && (temperature >= 25 && temperature <= 45) )  return true;
        else return false;
    }

    public static void printEqual(int x, int y, int z) {
        if (x < 0 || y < 0 || z < 0) System.out.println("Invalid Value");
        else if (x == y && y == z) System.out.println("All numbers are equal");
        else if (x != y && y != z && x != z) System.out.println("All numbers are different");
        else System.out.println("Neither all are equal or different");
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) System.out.println("Invalid Value");
        else {
            long day = (long) ((minutes / 60L) / 24L);
            long year = (long) (day / 365);
            day %= 365;
            System.out.println(minutes + " min = " + year + " y and " + day + " d");
        }
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
            int hours = 0;
            if (minutes > 59) {
                hours = (int) (minutes / 60);
                minutes = minutes - (hours * 60);
            }
            String time = "";// = hours + "h " + minutes + "m " + seconds + "s ";
            if (hours < 10) time += "0" + hours + "h ";
            else time += hours + "h ";
            if (minutes < 10) time += "0" + minutes + "m ";
            else time += minutes + "m ";
            if (seconds < 10) time += "0" + seconds + "s ";
            else time += seconds + "s ";

            return time;
        }

        return INVALID_VALUE_MESSAGE;
    }

    public static String getDurationString(int seconds) {
        if (seconds >= 0) {
            int minutes = (int) (seconds / 60);
            seconds = seconds - (minutes * 60);
            //System.out.println(minutes + " " + seconds);
            return getDurationString(minutes, seconds);
        }

        return INVALID_VALUE_MESSAGE;
    }
}
