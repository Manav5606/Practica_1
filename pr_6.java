package com.company;

import java.util.Scanner;

public class pr_6 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year,month,day,weeks,days;

        System.out.println("Enter number of days:");
         days = sc.nextInt();
        year = days/365;
        System.out.println("year: "+ year);

        month = (days%365)/30;
        System.out.println("month: "+month);

        weeks = ((days%365)%30)/7;
        System.out.println("weeks: "+ weeks);

        day = (((days%365)%30)%7);

        System.out.println("days: "+ day);
    }
}
