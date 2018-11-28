package com.CyberDimon.Section5;

public class LargestPrime {
    public static int getLargestPrime(int number){
        int result = 0;
        if(number <=1){
            return -1;
        }
        int aux = number;
        int i = 2;
        while(aux != 0 && i <= number){
            if(aux % i == 0){
                result = i;
                aux = aux / i;
            }else{
                i++;
            }
        }
        return result;
    }
}
