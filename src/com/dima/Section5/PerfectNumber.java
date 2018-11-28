package com.dima.Section5;

public class PerfectNumber {
    public static boolean isPerfectNumber(int num) {
        if (num <= 0) return false;

        int sum = 0;
        for(int i = 1; i < num; i++) {
            if (num % i == 0) sum += i;
            //System.out.println(num+"%"+i+"="+num%i);
        }

        if (sum == num) return true;
        return false;
    }
}
