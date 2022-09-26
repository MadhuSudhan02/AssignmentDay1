package com.bridgeLabz.day3;

import java.util.Scanner;

public class LargestArray {
    public static void main(String[] args) {
        int a[] = new int [5] ;
        int max , i;
        System.out.println("enter the element of arrays");
        Scanner r = new Scanner(System.in) ;
        for( i =0 ; i< a.length ; i++ )
        {
            a[i] = r.nextInt() ;
        }
        System.out.println("the entered arrays is " + a[i]);
        max = a[0] ;
        for (i=1 ; i<a.length ; i++)
        {
            if(a[i]>max)
            {
                max = a[i] ;
            }
        }
        System.out.println("the greatest number is " + max );

    }

}
