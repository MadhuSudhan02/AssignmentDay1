package com.bridgeLabz.day3;
//4) Java Program to print the smallest element in an array

import java.util.Scanner;

public class SmallerArray {
    public static void main(String[] args) {
        int a[] = new int [5] ;
        int min , i;
        System.out.println("enter the element of arrays");
        Scanner r = new Scanner(System.in) ;
        for( i =0 ; i< a.length ; i++ )
        {
            a[i] = r.nextInt() ;
        }
        System.out.println("the entered arrays is " + a[i]);
        min = a[0] ;
        for (i=1 ; i<a.length ; i++)
        {
            if(a[i]<min)
            {
                min = a[i] ;
            }
        }
        System.out.println("the Smallest number is " + min );

    }
}
