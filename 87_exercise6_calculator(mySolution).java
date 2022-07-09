/*
        Exercise 6: you have to create a custom calculator with following operations:
        1. + -> addition -> done
        2. - -> subtraction -> done
        3. * -> multiplication -> done
        4. / -> division -> done

        which throws following exception:
        1. invalid input exception ex: 8 & 9 --> done
        2. can not divide by 0 exception --> done
        3. Max Input Exception : if any of the input is greater than 100000  --> done
        4. MaxMultiplierReachedException - Don't allow any multiplication input to be greater than 7000. --> done
*/

package com.company;
import java.util.Scanner;

class InvalidInputException extends Exception{
    @Override
    public String toString(){
        return "Error!! operator provided can not be resolved";
    }

    @Override
    public String getMessage(){
        return "Operator should be one of the options provided above!";
    }
}

class MaxInputException extends Exception{
    @Override
    public String toString(){
        return "Error!! Number Greater Than Maximum Number Supported...";
    }

    @Override
    public String getMessage(){
        return "Input number greater than 100000!";
    }
}

class MaxMultiplierReachedException extends Exception{
    @Override
    public String toString(){
        return "Error!! Max Multiplier Reached...";
    }

    @Override
    public String getMessage(){
        return "Input number less than 7000!";
    }
}

class CustomExceptions extends Exception{
    public void throwInvalidInputException(){
        try{
            throw new InvalidInputException();
        }
        catch (Exception e){
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
    }

    public void throwMaxInputException(){
        try{
            throw new MaxInputException();
        }
        catch (Exception e){
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
    }

    public static void throwMaxMultiplierReachedException(){
        try{
            throw new MaxMultiplierReachedException();
        }
        catch (Exception e){
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
    }
}


class Calculator{
    Calculator(){
        System.out.println("| Welcome to the Custom Calculator App |");
        System.out.println("Use: \n+ -> for addition \n- -> for subtraction \n* -> for multiplication \n/ -> for division.");
    }

    // for normal use (number of inputs = enough for normal complex stuffs.)
    // not added into the program
    public int ArrayAddition(int ...arr){
        int result = 0;
        for (int a: arr){
            result += a;
        }
        return result;
    }

    // addition
    public int addition(int a, int b){
        return a+b;
    }

    //subtraction
    public int subtract(int a, int b){
        return a-b;
    }

    //multiplication
    public int multiply(int a, int b){
        if(a>7000||b >7000){
            CustomExceptions.throwMaxMultiplierReachedException();
        }
        else {
            System.out.println("The multiplication of the following numbers is: "+(a*b));
        }
        return 0;
    }

    //division
    public float divide(int a, int b){
        System.out.println("The division of the following numbers is: "+ (a/b));
        return 0;
    }
}


public class cwh_87_exercise6_calculator {
    public static void main(String[] args) {
        CustomExceptions customExceptions = new CustomExceptions();
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);

        boolean running = true;
        while (running){

            // Asking for the first argument.
            System.out.print("please enter your first Argument: ");
            int firstNumber = sc.nextInt();
            // Asking for the operation type.
            System.out.print("Which Type Of Operation Do You Want To Do: ");
            String  operator = sc.next();
            // Asking for the second argument.
            System.out.print("Please enter the second Argument: ");
            int secondNumber = sc.nextInt();


            if (firstNumber >=100000){
                System.out.println("First number greater than 100000");
                customExceptions.throwMaxInputException();
                continue;
            }
            if(secondNumber<=0){
                try {
                    throw new ArithmeticException();
                }catch (Exception e){
                    System.out.println("can not divide by 0");
                    System.out.println(e.toString());
                }
                continue;
            }

            switch (operator) {
                case "+" ->
                        System.out.println("The result of addition is: " + calc.addition(firstNumber, secondNumber));
                case "-" ->
                        System.out.println("The result of subtraction is: " + calc.subtract(firstNumber, secondNumber));
                case "*" ->
                        calc.multiply(firstNumber, secondNumber);
                case "/" ->
                        calc.divide(firstNumber, secondNumber);
                default -> customExceptions.throwInvalidInputException();
            }
        }
    }
}