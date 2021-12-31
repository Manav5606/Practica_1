package com.company;

public class pr_12 {
    public static void main(String[] args) {
        int n1=100;
        int n2=200;
        int sum=0;

        for (int i = n1; i<n2; i++)
        {
            if (i%7==0)
            {
                System.out.println(i);
                sum = sum + i;
            }

        }
        System.out.println("");
        System.out.println("Sum of all the Numbers is: " + sum);

    }
}
