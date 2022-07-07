package com.company;

public class cwh_80_tryCatchBlock {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
        try {
            int c = a/b;
            System.out.println("The result is: "+ c);
        }
        catch (Exception e){
            System.out.println("we fail to divide. Reason: "+ e);
            System.out.println();
        }
        System.out.println("End of the program");
    }
}
