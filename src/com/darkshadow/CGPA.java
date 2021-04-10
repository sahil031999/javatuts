package com.darkshadow;

import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner sa= new Scanner(System.in);
        System.out.println("Calculate CGPA ");
        System.out.print("Marks in English:");
        float a= sa.nextFloat();
        System.out.print("Marks in Math:");
        float b= sa.nextFloat();
        System.out.print("Marks in Science:");
        float c= sa.nextFloat();
        System.out.print("Marks in Hindi:");
        float d= sa.nextFloat();
        System.out.print("Marks in Social studies:");
        float e = sa.nextFloat();
        float CGPA = (a+b+c+d+e)/5;
        System.out.print("CGPA ="+CGPA);

    }
}
