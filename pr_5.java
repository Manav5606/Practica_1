package com.company;

import java.util.Scanner;

public class pr_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //int into byte
        System.out.println("Enter an int");
        int a = sc.nextInt();
        System.out.println("int is: " + a);
        byte b = (byte) a;
        System.out.println("byte is: " + b);

        // double into int
        System.out.println("Enter an Double");
        double c = sc.nextDouble();
        //System.out.println("int is: " + c);
        int d = (int) c;
        System.out.println("int is: " + d);

        // double into byte
        System.out.println("Enter an Double");
        double e = sc.nextDouble();

        byte f = (byte) e;
        System.out.println("int is: " + f);
    }


}
