package com.bridgeLabz.day2;
//3. Write a Program to find Palindrome Number
//eg. Input n=121 then after reverse output is same 121 then it is a palindrome.
//eg. Input n=321 then after reverse output is not same it's 123 then it is not a palindrome number.

import java.sql.SQLOutput;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int N , reverse = 0  , reminder ;
        System.out.println("enter the number N to be reversed ");
        Scanner r = new Scanner (System.in) ;
        N = r.nextInt() ;
        int temp = N ;
        while(N!=0)
        {
            reminder = N%10 ;
            reverse = reverse * 10 + reminder ;
            N = N/10 ;
        }
      if (temp== reverse)
      {
          System.out.println("the Number is palindrome " + temp );
      }
      else
      {
          System.out.println("the Number is not palindrome " + temp);
      }

    }
}
