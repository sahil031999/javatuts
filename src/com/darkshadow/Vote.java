package com.darkshadow;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sa= new Scanner(System.in);
        System.out.println("Vote Eligibility: -");
        int a = sa.nextInt();
        if (a>=18){
            System.out.println("Eligible for vote");
        }
        else{
            System.out.println("Not eligible for vote");
        }
    }
}
