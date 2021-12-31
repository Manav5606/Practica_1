package com.company;

import java.util.Scanner;

public class pr_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num,rem,rev = 0;
        System.out.println("Enter an number");
        num = sc.nextInt();

        while (num>0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println(rev);
    }
}
