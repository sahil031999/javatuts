package com.darkshadow;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        if (sa.nextInt()%2==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("odd number");
        }
    }
}




