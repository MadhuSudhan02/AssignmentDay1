package com.bridgeLabz.day2;

//1. Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5

import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        int N , result = 0 ;
        System.out.println("enter the no. N");
        Scanner r = new Scanner(System.in);
        N=r.nextInt();
        for(int i=1 ;i<=N ; i++)
        {
            result = result + i ;
        }
        System.out.println("the result is " + result);

    }
}
