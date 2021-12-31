package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class PR_16_array_function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n,temp=0;
        System.out.println("Enter the umber of elements you wnat to enter");
        n = sc.nextInt();
        int [] array = new int [n];

        for (int i = 0; i <n ; i++) {
            array[i]= sc.nextInt();
        }

        Arrays.sort(array);
        System.out.println("Elements of array sorted in ascending order: ");

        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]);
        }
    }
}
