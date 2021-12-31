package com.company;

import java.util.Scanner;


import static java.lang.Math.sqrt;

public class pr_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float EQQ,TBO,demandrate,setupcost,holdingcost;
        System.out.println("Enter the demand rate");
        demandrate = sc.nextFloat();
        System.out.println("Enter the setup cost");
        setupcost = sc.nextFloat();
        System.out.println("Enter the holding cost per unit time");
        holdingcost = sc.nextFloat();

        EQQ = (float) sqrt((2*demandrate*setupcost)/holdingcost);
        TBO = (float) sqrt((2*setupcost)/demandrate*holdingcost);

        System.out.println("EQQ is: "+ EQQ);
        System.out.println("TBO is: "+ TBO);

    }
}
