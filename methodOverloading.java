package com.company;

public class cwh_32_methodOverloading {
    static  void foo(){
        System.out.println("Good morning bro");
    }
    static  void foo(int a){
        System.out.println("good morning "+a+" bro");
    }
    static void foo(int a,int b){
        System.out.println("good morning "+a+" bro");
        System.out.println("good morning "+b+" bro");
    }

    static void foo(int a,int b, int c){
        System.out.println("good morning "+a+" bro");
        System.out.println("good morning "+b+" bro");
    }


    static void change(int a){
        a = 98;
    }
    static void change2(int [] arr ){
        arr[0] = 98;
    }


    static void tellJoke(){
        System.out.println("I invented a new word \n Plagiarism");
    }
    public static void main(String[] args) {
         tellJoke();

        // Case 1: Changing the integer.
        int x = 45;
        change(x);
        System.out.println("The value of x after running change is: "+x);

        // Case 2: changing the Array.
        int [] marks = {52,73,77,89,98,94};
        change2(marks);
        System.out.println("The value of x after running change 2 is: "+ marks[0]);

        // Method overloading
        // Arguments are actual
        // The numbers which we pass-in in the methods are arguments and when we define normal integers or floats while making methods are called parameters.

        foo();
        foo(3000);
        foo(3000,4000);
    }
}
