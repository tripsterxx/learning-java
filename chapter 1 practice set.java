import java.util.Scanner;

public class CWH_CH1_PS {
    public static void main(String[] args) {
//        question 1:- sum 3 numbers
        int a = 2;
        int b = 2;
        int c = 2;
        int sum = a+b+c;
        System.out.println(sum);


//        question 2:- calculate cgpa
        float subject1 = 45;
        float subject2 = 95;
        float subject3 = 48;
        float sum = (subject1+subject2+subject3)/30;
        System.out.println(sum);

//        question 3:- program taking user input as name and then print a greeting message.
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter your name:-> ");
        String name = sc.next();
        System.out.print("hello "+name+" have a great day ");

//        question 4:- km to miles convertor
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Distance In KM:- ");
        float km = sc.nextFloat();
        float miles = km*0.621371f;
        System.out.println(km + " km is " + miles + " miles");

//        question 5:- number input by the user is integer or not
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter your number:-> ");
        System.out.println(sc.hasNextInt());
    }
}
