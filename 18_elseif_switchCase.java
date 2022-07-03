import java.util.Scanner;

public class cwh_18_elseif_switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your age: ");
        int age = sc.nextInt();

        switch (age) {
            case 18 -> {
                System.out.println("You are going to become an adult");
                System.out.println("You are going to become an adult");
            }
            case 23 -> System.out.println("You are going to join a job");
            case 60 -> System.out.println("You are going to get retired ");
            default -> System.out.println("Enjoy your life!");
        }
        System.out.println("Thanks for using your java code!!");
      switch (age){
            case 18:
                System.out.println("You are going to become an adult");
                break;
            case 23:
                System.out.println("You are going to join a job");
                break;
            case 60:
                System.out.println("You are going to get retired ");
                break;
            default:
                System.out.println("Enjoy your life!");
        }
        System.out.println("Thanks for using your java code!!");


        // if ,else if, else ladder
        if(age>56){
            System.out.println("you are experienced");
        }
        else if (age>46){
            System.out.println("you are semi experienced");
        }
        else if (age > 36) {
            System.out.println("you are semi semi experienced");
        }
        else {
            System.out.println("you are not experienced");
        }



    }
}
