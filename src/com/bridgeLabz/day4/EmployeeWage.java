package com.bridgeLabz.day4;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Problem ");
        Random random = new Random();
//contants
        int IS_FULL_TIME = 2;
        int IS_PART_TIME = 1;
        int empHrs;
        int RATE_PER_HRS = 20;
        int empWage;
        int empCheck = random.nextInt(3);
        System.out.println("EmpCheck "+empCheck);
//2 //2
        if(IS_FULL_TIME==empCheck) {
            empHrs = 8;
            System.out.println("Employee is present");
        }else if (IS_PART_TIME == empCheck){
            empHrs = 4;
        }else{
            empHrs=0;
            System.out.println("Employee is absent");
        }
        empWage = RATE_PER_HRS *empHrs; //20*8 = 160
        System.out.println("Employee Wage: "+empWage);
    }
}

