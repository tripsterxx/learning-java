package com.company;

import java.io.FileWriter;
import java.io.IOException;

class MyDeprecated{
    @Deprecated
    void meth1(){
        System.out.println("I am method 1");
    }
}

interface MyInt{
    void display();
}

public class cwh_112_advancedPS2 {
    public static void main(String[] args) {
        MyDeprecated d = new MyDeprecated();
//        d.meth1();

        MyInt i = () -> {System.out.println("I am display");};
//        i.display();

        int num =5;
        String table = "";
        for (int j=0; j<10; j++){
            table += num + " X " + (j+1) + " = " + num*(j+1) + "\n";
//            table += "\n";
        }
        try {
            FileWriter fileWriter = new FileWriter("multiplicationTable.txt");
            fileWriter.write(table);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
