package com.company;

import java.util.Scanner;

public class pr_11 {

    public static void main(String[] args) {

            // number m = new number( "10","100");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Starting Number");
        int s = sc.nextInt();
        System.out.println("Enter an Ending Number");
        int s1 = sc.nextInt();

            number m = new number(s, s1);
            m.Showmenu();

    }
}

class number{
    int n1,n2;
    int odd;
    int even;
    int evensum=0;
    int oddsum=0;
    int count=0;



    public number(int s, int s1) {
        count=0;
        n1= s;
        n2= s1;
    }

    void Total_evenintegers(){
        for (int i = n1; i <=n2 ; i++) {
            if (i % 2 ==0) {
                count++;
                System.out.println(i);

            }
        }
        System.out.println("Total Number of an even integers are: " + count);

    }

    void Total_oddintegers(){
        for (int i = n1; i <=n2 ; i++) {
            if (i % 2 !=0) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("Total Number of an odd integers are: " + count);

    }

    void Sumof_evenintegers(){
        for (int i = n1; i <=n2 ; i++) {
            if (i % 2 ==0) {
                evensum+=i;

            }
        }

        System.out.println("Sum of an even integers is: " + evensum);
    }

    void Sumof_oddintegers(){
        for (int i = n1; i <=n2 ; i++) {
            if (i % 2 !=0) {
                oddsum+=i;

            }
        }
        System.out.println("Sum of an odd integers is: " + oddsum);

    }


    void Showmenu(){
        int a=0;
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter an Integer: ");
//        int n1 = sc.nextInt();
//        System.out.println("Enter an Integer: ");
//        int n2 = sc.nextInt();

        System.out.println("1. Total number of even integers ");
        System.out.println("2. Total number of odd integers ");
        System.out.println("3. Sum of all even integers ");
        System.out.println("4. Sum of all odd integers ");
        System.out.println("5. Exit");

        do {
            System.out.println("Enter an option");
            a = sc.nextInt();

            switch (a){
                case 1:
//                    System.out.println("Enter an Integer: ");
//                    int s = sc.nextInt();
//                    int s1 = sc.nextInt();
                    Total_evenintegers();
                    break;

                case 2:
                    Total_oddintegers();
                    break;

                case 3:
                    Sumof_evenintegers();
                    break;

                case 4:
                    Sumof_oddintegers();
                    break;

                default :
                    System.out.println("Invalid");
                    break;
            }
        }while (a!=5);
    }
}
