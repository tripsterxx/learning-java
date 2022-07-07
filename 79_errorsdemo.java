package com.company;


import java.util.Scanner;

public class cwh_79_errorsdemo {
    public static void main(String[] args) {
        //SYNTAX ERROR
//        int a = 10; //error no semicolon
//        b = 8;  // error b not declared

        // LOGICAL ERROR DEMO
        // write a program to print all prime numbers between 1 to 10.
        System.out.println(2);
        for(int i=1; i<5; i++){
            System.out.println(2*i+1);
        }

        //RUNTIME ERROR
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("integer part of 1000 divided by k is: "+ 1000/k); // it will give error if the input is 0.
    }
}
