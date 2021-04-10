package com.darkshadow;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner sa= new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a= sa.nextInt();
        System.out.println("Enter the second number:");
        int b= sa.nextInt();
        System.out.println("Enter the third number:");
        int c= sa.nextInt();
        System.out.println("Sum of the numbers:");
        int sum= a+b+c;
        System.out.println(sum);

    }
}
