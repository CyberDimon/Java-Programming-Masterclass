package com.CyberDimon.Section5;

public class SumOdd {
    public static boolean isOdd(int number)
    {
        if (number < 0) return false;
        if (number % 2 == 1) return true;
        else return false;
    }

    public static int sumOdd(int start, int end)
    {
        if (start < 0) return -1;
        if (start > end) return -1;
        //if (start == end) return 0;
        int sum = 0;
        for (int i = start; i <= end; i++)
        {
            //System.out.println(i);
            if (isOdd(i)) {
                sum += i;
            }
        }
        //if (sum == 0) return 0;
        return sum;
    }
}
