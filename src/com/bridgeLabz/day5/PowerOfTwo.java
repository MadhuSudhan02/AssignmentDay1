package com.bridgeLabz.day5;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n , p ,result = 1 ;
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in) ;
        n=sc.nextInt() ;
        System.out.println("enter the power");
        p= sc.nextInt();
        for(int i=1 ; i<=p ; i++)
        {
            result = result * n ;
        }
        System.out.println("the result is : " +result);
    }
}
