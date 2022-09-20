package com.bridgeLabz.day2;

import java.util.Scanner;

//2. Write a Program to reverse the integer number eg. Input n=231 reverse is 132
//using while loop
public class RevereseIntegerNumber {
    public static void main(String[] args) {
        int N , reverse = 0  , reminder ;
        System.out.println("enter the number N to be reversed ");
        Scanner r = new Scanner (System.in) ;
        N = r.nextInt() ;
        while(N!=0)
        {
            reminder = N%10 ;
            reverse = reverse * 10 + reminder ;
            N = N/10 ;
        }
        System.out.println("the reverse number is " + reverse);
    }


}
