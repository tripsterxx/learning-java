import java.util.Scanner;
public class PercentageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks obtained in subject 1:- ");
        int sub1 = sc.nextInt();

        System.out.print("Enter marks obtained in subject 2:- ");
        int sub2 = sc.nextInt();

        System.out.print("Enter marks obtained in subject 3:- ");
        int sub3 = sc.nextInt();

        System.out.print("Enter marks obtained in subject 4:- ");
        int sub4 = sc.nextInt();

        System.out.print("Enter marks obtained in subject 5:- ");
        int sub5 = sc.nextInt();

        System.out.println();
        float marksObtained = sub1+sub2+sub3+sub4+sub5;
        System.out.println("You scored "+marksObtained+" marks");
        float percentage = marksObtained/5;
        System.out.print("Your total percentage is:--> "+percentage+"%");
    }

}
