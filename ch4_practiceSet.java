import java.util.Scanner;

public class cwh_19_ch4_practiceSet {
    public static void main(String[] args) {
        //Question 2
        /*
        byte m1, m2, m3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks in Physics: ");
        m1 = sc.nextByte();
        System.out.print("Enter your marks in Chemistry: ");
        m2 = sc.nextByte();
        System.out.print("Enter your marks in Mathematics: ");
        m3 = sc.nextByte();

        float avg = (m1+m2+m3)/3.0f;
        System.out.println("Your overall percentage is: "+ avg);
        if (avg >= 40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congratulation you have been promoted");
        }
        else {
            System.out.println("Sorry you have not been promoted. please try again");
        }

         */

        //Question 3
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income in Lakhs per annum: ");
        float income = sc.nextFloat();
        float tax = 0;
        if (income<2.5){
            tax = tax + 0;
        }
        else if (income>2.5 && income<= 5f){
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if (income>5f && income <= 10f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        }
        else if (income>10f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
            tax = tax + 0.3f * (income-10f);
        }

        System.out.println("The total tax is "+tax);

         */

        /*
        // Question 4
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");

        int day = sc.nextInt();
        switch (day){
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
            default -> System.out.println("pls enter between 1 to 7");
        }
         */

        // Question 5
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the year you want to check whether it is a leap year or not:");
        int year = sc.nextInt();
        int leapCheck = year%4;
        if (leapCheck == 0){
            System.out.println("Yes it is a leap year!! YAY");
        }
        else {
            System.out.println("No it is not a leap year!");
        }
    }

}
