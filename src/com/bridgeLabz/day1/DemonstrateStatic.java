package com.bridgeLabz.day1;

public class DemonstrateStatic {
    static int a = 7 ;
    static void display()
    {
        System.out.println("Sudhan");
    }
    static
    {
        System.out.println("Madhu");
    }

    public static void main(String[] args) {
        display();
        System.out.println(a);

    }


}
