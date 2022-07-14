package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class cwh_111_file {
    public static void main(String[] args){
        /*
        File myFile = new File("hello.txt");
        try {
            myFile.createNewFile();
            System.out.println("file created");
        } catch (IOException e) {
            System.out.println("Unable to create this file! ");
            e.printStackTrace();
        }
        try {
            FileWriter fileWriter = new FileWriter("hello.txt");
            fileWriter.write("this is my first file from this java course\nok now bye");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



        //reading a file
        File myFile = new File("hello.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

         */

        // deleting a file
        File myFile = new File("hello.txt");
        if (myFile.delete()){
            System.out.println("I have deleted: "+ myFile.getName());
        }
        else {
            System.out.println("some problem occured while deleting the file");
        }
    }
}
