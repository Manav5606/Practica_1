package com.company;

import java.util.Scanner;

public class pr_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Maths,Physics,Chemistry,sum;
        System.out.println("Enter the Marks of Maths");
        Maths = sc.nextInt();
        System.out.println("Enter the Marks of Physics");
        Physics = sc.nextInt();
        System.out.println("Enter the Marks of Chemistry");
        Chemistry = sc.nextInt();

        sum=Maths+Physics+Chemistry;

        if (Maths>100 || Physics>100 || Chemistry>100)
        {
            System.out.println("Enter Marks Between 1 to 100");
        }
        else if (Maths >=60 && Physics >=50 && Chemistry >=40 && sum>=200 )
        {
            System.out.println("You are eligible for admission");
        }
        else if (Maths+Physics>=150)
        {
            System.out.println("You are eligible for admission");
        }

        else
        {
            System.out.println("You are not eligible");
        }
    }
}
