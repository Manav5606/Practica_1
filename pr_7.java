package com.company;
import java.util.Scanner;

public class pr_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int u,a,t,distance;

        System.out.println("enter an initial velocity (u)");
         u = sc.nextInt();

        System.out.println("enter an acceleration (a)");
        a = sc.nextInt();

        System.out.println("enter an time interval(t)");
        t = sc.nextInt();

        distance = ((u*t)+ ((a*t*t))/2);

        System.out.println("Ditance travel is "+ distance);
    }
}
