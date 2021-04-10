package com.darkshadow;

import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner sa= new Scanner(System.in);
        System.out.println("Convertor:-");
        System.out.print("Enter kilometre:");
        double a= sa.nextDouble();
        System.out.print("kilometre:");
        double b= a/1.609;
        System.out.println( b+" miles");
    }
}
