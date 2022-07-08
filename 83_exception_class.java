package com.company;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString(){
        return "I am toString()";
    }

    @Override
    public String getMessage(){
        return "I am get message";
    }
}

class MaxAgeException extends Exception{
    @Override
    public String toString(){
        return "Age can not be greater than 125";
    }

    @Override
    public String getMessage(){
        return "make sure that the value entered is correct.";
    }
}

public class cwh_83_exception_class {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a<99){
            try {
//                throw new MyException();
//                throw new ArithmeticException("This is an arithmetic exception");
                throw new MaxAgeException();
            }
            catch (Exception e){
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                e.printStackTrace();
                System.out.println("finished");
            }
            System.out.println("yes finished");
        }

    }
}
