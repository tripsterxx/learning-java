package com.company;
/*
syntax of a method

datatype name(){
    //method body
}

following method returns sum of two numbers;
 int mySum(int a, int b){
    int c = a+b;
    return c;
}
 */

public class cwh_31_methods {
    int logic(int x, int y){
        int z;
        if (x>y){
            z = (x+y);
        }else {
            z = (x+y)*5;
        }
        return z;
    }

    static int logic(int x, int y){
        int z;
        if (x>y){
            z = (x+y);
        }else {
            z = (x+y)*5;
        }
        return z;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        c = logic(a,b);

        // Method invocation using Object creation
        //cwh_31_methods obj = new cwh_31_methods();
        //c = obj.logic(a,b);

        int a1 = 2;
        int b1 = 1;
        int c1 = logic(a1, b1);

        System.out.println(c);
        System.out.println(c1);
    }
}