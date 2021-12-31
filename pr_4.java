package com.company;

import java.util.Scanner;

public class pr_4 {
    public static void main(String[] args) {

                int val;
                char ascii;
                Scanner sc=new Scanner(System.in);

                System.out.println("Enter The Value:");
                val=sc.nextInt();

                ascii=(char)val;

                System.out.println("The Output Is:"+ascii);

    }
}
