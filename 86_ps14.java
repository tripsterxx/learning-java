package com.company;

import java.util.Scanner;

public class cwh_86_ps14 {
    public static void main(String[] args) {
        // problem 1
        // syntax error - int a = 7
        // logical error -
         int age = 78;
         int year_born = 2000 -78;
//        System.out.println(6/0);

        //problem 2
        try {
//            int a = 666/0;
            int a = 666/9;
        }
        catch (IllegalArgumentException e){
            System.out.println("hehe");
        }
        catch (ArithmeticException e){
            System.out.println("haha");
        }

        boolean flag = true;
        int [] marks = {7, 56, 6};
        Scanner sc = new Scanner(System.in);
        int index;
        int i=0;
        while (flag && i<5){
            try {
                System.out.println("enter the value of index:");
                index = sc.nextInt();
                System.out.println("The value of marks[int] is: "+marks[index]);
                break;
            }
            catch (Exception e){
                System.out.println("Invalid index");
                i++;
            }
        }
        if (i>=5){
            System.out.println("error");
        }
    }
}
