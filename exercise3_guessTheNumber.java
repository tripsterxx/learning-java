package com.company;
/*
        43
        98-no -bigger
        30-no -smaller
        Create a class Game, which allow a user to play "Guess the Number" game once.
        Game should have the following methods:
        1. Constructor to generate the random number -->> done
        2. takeUserInput() to take a user input of number -->> done
        3. isCorrectNumber() to detect whether the number entered by the user is true -->> done
        4. getters and setters for number of guesses
        Use properties such as noOfGuesses(int), etc to get this task done
*/

import java.util.Random;
import java.util.Scanner;

class Game{
    // Generating random number for computer.
    Random rand = new Random();

    //Initialising scanner class.
    Scanner sc = new Scanner(System.in);

    //Generating random number between 0 and 100
    int randomNumber = rand.nextInt(101);

    // Defining variables. -> user input and a totalCount private variable for getter and setter to increase the total count
    int userInput;
    private int totalCount = 1;

    // setter for increasing the count.
    public void incCount(){
        totalCount++;
    }
    // Getter for showing the total count.
    public void showCount(){
        System.out.println("Total guesses:- " + totalCount);
    }

    //boolean for running and stopping the game.
    boolean running = true;


    //Main Game class.
    public Game(){
        System.out.println("Guess the number between 0 and 100");
        System.out.println(randomNumber);
        while (running){
            System.out.print("Guess:-> ");
            userInput = sc.nextInt();
            isCorrectNumber(userInput);
            userInputCheck(userInput);
        }
    }

    // userInputCheck
    public void userInputCheck(int input){
        if(userInput>100){
            System.out.println("value higher than 100.. guess lower!!");
        } else if (userInput<0) {
            System.out.println("value smaller than 0... guess higher!!");
        }
    }

    // Checker function for checking the number is guessed correct or not
    public void isCorrectNumber(int userInput){
        if(userInput == randomNumber){
            System.out.println("correct Guess");
            showCount();
            running = false;
        }
        else if (userInput<randomNumber) {
            System.out.println("too small number... guess higher");
            incCount();
        }else if(userInput>randomNumber){
            System.out.println("too big number... guess lower");
            incCount();
        }else {
            System.out.println("system error");
        }
    }
}

public class cwh_43_exercise3_guessTheNumber {
    public static void main(String[] args) {
        // Initializing the game here. / starting the game!!
        Game game = new Game();
    }
}
