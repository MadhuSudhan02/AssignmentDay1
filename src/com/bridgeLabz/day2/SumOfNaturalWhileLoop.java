package com.bridgeLabz.day2;

import java.util.Scanner;

public class SumOfNaturalWhileLoop {
    public static void main(String[] args) {
        int N , i = 1 , result = 0 ;
        System.out.println("enter the no. N");
        Scanner r = new Scanner(System.in);
        N=r.nextInt();
        while (i<=N)
        {
            result = result + i ;
            i++ ;
        }
        System.out.println("the sum of N natural no. is " + result );
    }
}
