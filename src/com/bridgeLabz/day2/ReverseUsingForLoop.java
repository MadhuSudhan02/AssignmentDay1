package com.bridgeLabz.day2;

import java.util.Scanner;
//2. Write a Program to reverse the integer number eg. Input n=231 reverse is 132
//using for loop

public class ReverseUsingForLoop {
    public static void main(String[] args) {
        int N , reverse = 0  , reminder ;
        System.out.println("enter the number N to be reversed ");
        Scanner r = new Scanner (System.in) ;
        N = r.nextInt() ;
        for (;N!=0 ; N = N/10)
        {
            reminder = N%10 ;
            reverse = reverse * 10 + reminder ;
        }
        System.out.println("the reverse number is " + reverse);
    }
}
