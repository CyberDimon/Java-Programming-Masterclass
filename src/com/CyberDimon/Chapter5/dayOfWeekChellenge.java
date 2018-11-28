package com.CyberDimon.Chapter5;

public class dayOfWeekChellenge {

    public static void main(String[] args) {
        System.out.println(printDayOfTheWeek(6));
        printDayOfTheWeek_if(2);
        printNumberInWord(3);
        System.out.println(getDaysInMonth(1,2020));
        System.out.println(getDaysInMonth(2,2020));
        System.out.println(getDaysInMonth(2,2018));
        System.out.println(getDaysInMonth(-1,2020));
        System.out.println(getDaysInMonth(1,-2020));
    }

    public static String printDayOfTheWeek(int day) {
        switch(day) {
            case 1:
                return "Понедельник";
            case 2:
                return "Вторник";
            case 3:
                return "Среда";
            case 4:
                return "Четверг";
            case 5:
                return "Пятница";
            case 6:
                return "Суббота";
            case 7:
                return "Воскресенье";
            default:
                return "Нет такого дня";
        }
    }

    public static void printDayOfTheWeek_if(int day) {
        if(day == 1)
            System.out.println("Понедельник");
        else if (day == 2)
            System.out.println("Вторник");
        else if (day == 3)
            System.out.println("Среда");
        else if (day == 4)
            System.out.println("Четверг");
        else if (day == 5)
            System.out.println("Пятница");
        else if (day == 6)
            System.out.println("Суббота");
        else if (day == 7)
            System.out.println("Воскресенье");
        else
            System.out.println("Нет такого дня");

    }

    public static void printNumberInWord(int number)
    {
        switch(number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
        }
    }

    public static boolean isLeapYear(int year)
    {
        if (year < 1 || year > 9999) return false;
        if ( (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) )
            return true;
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) return -1;
        if (year < 1 || year > 9999) return -1;
        switch(month) {
            case 1:
                return 31;
            case 2:
                if(isLeapYear(year)) return 29;
                else return 28;
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
            default:
                return -1;
        }
    }

}
