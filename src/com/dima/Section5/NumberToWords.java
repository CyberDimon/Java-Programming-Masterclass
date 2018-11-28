package com.dima.Section5;

public class NumberToWords {
    public static void numberToWords(int number) {
        int holder = reverse(number);
        int holder1=reverse(number);
        if (holder < 0) {
            System.out.println("Invalid Value");
        } else {
            while (holder != 0) {
                int lastDigit = holder % 10;
                holder /= 10;
                switch (lastDigit) {
                    case 0: {
                        System.out.println("Zero");
                        break;
                    }
                    case 1: {
                        System.out.println("One");
                        break;
                    }
                    case 2: {
                        System.out.println("Two");
                        break;
                    }
                    case 3: {
                        System.out.println("Three");
                        break;
                    }
                    case 4: {
                        System.out.println("Four");
                        break;
                    }
                    case 5: {
                        System.out.println("Five");
                        break;
                    }
                    case 6: {
                        System.out.println("Six");
                        break;
                    }
                    case 7: {
                        System.out.println("Seven");
                        break;
                    }
                    case 8: {
                        System.out.println("Eight");
                        break;
                    }
                    case 9: {
                        System.out.println("Nine");
                        break;
                    }
                    default: {
                        System.out.println("Invalid Value");
                    }
                }
            }
            int diff = (getDigitCount(number) - getDigitCount(holder1));
            if (diff != 0) {
                for (int i = 1; i <= diff; i++) {
                    System.out.println("Zero");
                }
            }
        }
    }

    public static int reverse(int num) {

        int reverse = 0;
        int holder = num;
        while (holder != 0) {
            int lastDigit = holder % 10;
            holder = holder / 10;
            reverse *= 10;
            reverse += lastDigit;

        }
        return reverse;
    }

    public static int getDigitCount(int num) {
        int holder = num;
        int count = 0;
        if (num < 0) {
            return -1;
        }
        if (holder == 0) {
            return 1;
        } else {
            while (holder != 0) {
                count++;
                holder /= 10;

            }
        }
        return count;
    }
}
