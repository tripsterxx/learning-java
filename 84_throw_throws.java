package com.company;

class NegativeRadiusException extends Exception{
    @Override
    public String toString(){
        return "Radius can not be negative";
    }

    @Override
    public String getMessage(){
        return "Radius should not be negative";
    }
}

public class cwh_84_throw_throws {
    public static double area(int r) throws NegativeRadiusException{
        if (r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }

    public static int divide(int a, int b) throws ArithmeticException{
        // Made by Ash
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        // Shivam - uses divide function created by Harry
        try {
//            int c = divide(6,0);
//            System.out.println(c);

            double ar = area(-6);
            System.out.println(ar);
        }
        catch (NegativeRadiusException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("Exception");
        }


    }
}
