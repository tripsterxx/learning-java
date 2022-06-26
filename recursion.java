package com.company;

import java.util.Scanner;

public class cwh_34_recursion {
    // Factorial(0) = 1
    // Factorial(n) = n * n-1 * ... 1
    // Factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
    // Factorial(n) = n * factorial(n-1)

    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }


    static int factorial_iterative(int n){
        if(n==0 || n==1){
            return 1;
        }
        else {
            int product =1;
            for (int i=1; i<=n; i++){
                product *= i;
            }
            return product;
        }
    }


    // program on fibonacci sequence
    static int fibonacciNthElement(int x){
        if (x==1){
            return 0;
        } else if (x==2) {
            return 1;
        }
        else {
            int a = 0;
            int b = 1;
            int result=0;

            // Logic with for loop
            for (int i=1; i<=x-2;i++){
                result = a+b;
                a = b;
                b = result;
            }
            return result;

            // Logic with while loop
//            int i=1;
//            while (i<=x-2){
//                result = a+b;
//                a = b;
//                b = result;
//                i++;
//            }
//            return result;
        }
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("The value of factorial n is: "+factorial(n));
        System.out.println("The value of factorial of 0 is: "+factorial(0));
        System.out.println("The value of factorial n is: "+factorial_iterative(n));
        
        Scanner sc = new Scanner(System.in);
        int nthElement = sc.nextInt();
        System.out.printf("Element %d of fibonacci series is: " + fibonacciNthElement(nthElement),nthElement);
    }


}
