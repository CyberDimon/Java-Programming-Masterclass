package com.CyberDimon.Chapter5;

public class Sum3And5Challenge {

    public static void main(String[] args) {
        int num = 0;
        int count = 0;
        for(int i = 1; i < 1000; i++) {

            if( (i % 3 == 0) && (i % 5 == 0) )
            {
                System.out.println(num);
                num += i;
                count++;
            }

            if (count == 5) break;
        }
        System.out.println("num: " + num);

        System.out.println(sumOdd(1,11));
    }

    public static boolean isOdd(int number)
    {
        if (number < 0) return false;
        if (number % 2 == 1) return true;
        else return false;
    }

    public static int sumOdd(int start, int end)
    {
        if (Math.abs(start) > end) return -1;
        int sum = 0;
        for (int i = start; i <= end; i++)
        {
            //System.out.println(i);
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }


}
