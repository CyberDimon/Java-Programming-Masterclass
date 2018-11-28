package com.CyberDimon.Chapter5;

public class Switch {

    public static void main(String[] args) {
//	    int value = 1;
//	    if (value == 1) {
//            System.out.println("Val == 1");
//        } else if (value == 2) {
//            System.out.println("Val == 2");
//        } else {
//            System.out.println("Val == 2");
//        }

        int switchValue = 6;
        String swithStr = "Dima";

        switch(swithStr) {
            case "Dima":
                System.out.println("val == 1");
                break;

            case "Vasya":
                System.out.println("val == 2");
                break;

//            case 3: case 4: case 5:
//                System.out.println("3, 4 or 5:");
//                System.out.println("Actually it was" + switchValue);
//                break;

            default:
                System.out.println("Default");
                break;
        }


        String month = "June";
        month = month.toLowerCase();
        //System.out.println(month);



        char c = 'G';
        switch(c) {
            case 'A':
                System.out.println("a");
                break;
            case 'B':
                System.out.println("b");
                break;
            case 'C':
                System.out.println("c");
                break;
            case 'D':
                System.out.println("d");
                break;
            default:
                System.out.println("no");
                break;
        }

    }
}
