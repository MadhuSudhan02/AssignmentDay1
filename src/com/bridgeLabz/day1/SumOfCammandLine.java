package com.bridgeLabz.day1;

public class SumOfCammandLine {
    public static void main(String[] args) {
        int a, b, c;
        try {
            a = Integer.parseInt(args[0]); // raper class to convert string to interger
            b = Integer.parseInt(args[1]);
            c=a+b ;
            System.out.println("sum" + c);

        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}