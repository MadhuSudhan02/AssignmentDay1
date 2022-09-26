package com.bridgeLabz.day5;

public class HarmonicNumber {
    public static void main(String args[])
    {

        // num is the number of values we want in a series
        int num = 5;
        double result = 0.0;

        System.out.println("The harmonic series is: ");

        // printing the harmonic series till num value
        // using for loop
        for (int i = num; i > 0; i--) {

            // calculating harmonic values
            result = result + (double)1 / i;
            System.out.print(result + ", ");
        }
    }
}
