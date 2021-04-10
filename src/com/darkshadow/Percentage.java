package com.darkshadow;

import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        Scanner sa=new Scanner(System.in);
        System.out.println("Assigning Grade");
        System.out.println("Enter your Percentage to check your Grade: -");
        float a= sa.nextFloat();
        if (a>90){
            System.out.println("Grade A");
        }
        else if (a>75)
        {
            System.out.println("Grade B");
        }
        else if (a>65){
            System.out.println("Grade C");
        }

    }
}
