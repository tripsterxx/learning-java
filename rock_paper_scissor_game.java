import java.util.Random;
import java.util.Scanner;

public class cwh_20_ps2_RPS {
    public static void main(String[] args) {
        //Generating random number for computer's choice.
        Random random = new Random();
        int compChoiceNum = random.nextInt(3);
        String compChoice = "";

        //Converting computer generated random number to specific character
        if(compChoiceNum == 0){
            compChoice = "r";
        }
        else if(compChoiceNum == 1){
            compChoice = "p";
        }
        else {
            compChoice = "s";
        }

        //Taking user input.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice{ r(Rock), p(Paper), s(Scissor) }");
        String userChoice = sc.next();

        //Game logic :HERE:
        if (compChoice.equals(userChoice)){
            System.out.format("It's a Tie! you both choose %s",userChoice);
        }

        else if (compChoice.equals("r") && userChoice.equals("p")) {
            System.out.printf("User won! userChoice: %s || computerChoice: %s",userChoice,compChoice);
        }else if (compChoice.equals("r") && userChoice.equals("s")) {
            System.out.printf("Computer won! userChoice: %s || computerChoice: %s",userChoice,compChoice);
        }

        else if (compChoice.equals("p") && userChoice.equals("s") ) {
            System.out.printf("User won! userChoice: %s || computerChoice: %s",userChoice,compChoice);
        } else if (compChoice.equals("p") && userChoice.equals("r") ) {
            System.out.printf("Computer won! userChoice: %s || computerChoice: %s",userChoice,compChoice);
        }

        else if (compChoice.equals("s") && userChoice.equals("r") ) {
            System.out.printf("User won! userChoice: %s || computerChoice: %s",userChoice,compChoice);
        }else if (compChoice.equals("s") && userChoice.equals("p") ) {
            System.out.printf("Computer won! userChoice: %s || computerChoice: %s",userChoice,compChoice);
        }
        else {
            System.out.println("Please enter a valid choice!! Also in lowerCase.");
        }

        System.out.println();
        System.out.println("Thanks for playing. Have a Peaceful Day Ahead!!");
    }
}
