package com.company;

import java.util.Scanner;

public class pr_15_patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n;
        n = sc.nextInt();


    // First Pattern


        for (int i = 1; i <=n ; i++) {
            for (int j = i; j <=n ; j++) {
                System.out.print("$");
            }
            System.out.println("");
        }

        System.out.println("------------------");

    // Second Pattern

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                if ((i+j)%2==0)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }

            }
            System.out.println("");
        }


        System.out.println("---------------------");

        // Third Pattern

        for (int i = 1; i <=n ; i++) {
            for (int j = i; j <=n ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}
