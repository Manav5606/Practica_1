package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class pr_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,temp=0;
        n = sc.nextInt();
        int [] array = new int [n];

        for (int i = 0; i <n ; i++) {
            array[i]= sc.nextInt();
        }

//        Arrays.sort(array);
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < array.length; i++)
        {
            for (int j = i+1; j < array.length ; j++) {
                if (array[i]>array[j])
                {
                        temp=array[i];
                        array[i]=array[j];
                        array[j]=temp;
                }
            }
//            System.out.println(array[i]);
        }
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
