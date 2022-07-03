//Getting user input in java
//In order to read data from the keyboard, java has a scanner class
//Scanner class has a lot of methods to read the data from the keyboard.

import java.util.Scanner;

public class cwh_05_TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking Input From The User");
        Scanner sc = new Scanner(System.in); // { System.in (read from the keyboard) }

        System.out.print("Enter number 1: ");
//        int a = sc.nextInt();
        float a = sc.nextFloat();
        System.out.print("Enter number 2: ");
//        int b = sc.nextInt();
        float b = sc.nextFloat();

//        int sum = a+b;
        float sum = a+b;
        System.out.print("The sum of these numbers is:- ");
        System.out.println(sum);

        System.out.print("integer detector:- ");
        boolean b1 = sc.hasNextInt(); // this line will take a input and the result will be in boolean form
        System.out.println(b1);       // that is if the no. is integer then the result will be true and vice versa.



        System.out.println("string functions ");
//        here sc.next() will read only single word and if a line is given then it will just take the fist word.
        String str = sc.next();
        System.out.println(str);

//        here sc.nextLine() will take the whole sentence if given and will also work just fine if single word is provided.
        String str2 = sc.nextLine();
        System.out.println(str2);

    }
}
