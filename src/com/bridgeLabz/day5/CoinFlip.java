package com.bridgeLabz.day5;
//1. Flip Coin and print percentage of Heads and Tails

import java.util.Scanner;

public class CoinFlip {
    public static void main(String[] args) {
        int heads = 0;
        int tails = 0;
        int count = 1;
        double random = 0.0;
        System.out.println("Enter the number :");
        Scanner num = new Scanner(System.in);
        int flip = num.nextInt();
        while (count <= flip) {
            random = Math.random();
            System.out.println(count + "  " + random);
            if (random < 0.5) {
                heads++;
                System.out.println("heads");
            } else {
                tails++;
                System.out.println("tails");
            }
            count++;
        }
        System.out.println( "   ");
        System.out.println("no. of heads" + heads);
        System.out.println("no. of tails" + tails);
        double headsPercent =(double) heads/flip * 100 ;
        double tailsPercent =(double) tails/flip * 100 ;

        System.out.println("the percent of heads is :" + headsPercent);
        System.out.println("the percent of tails is :" + tailsPercent);

    }
}
