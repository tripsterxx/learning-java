import java.util.Scanner;

public class cwh_15_ps3 {
    public static void main(String[] args) {
        // problem 1

        String name = "Jack Parker";
        name = name.toLowerCase();
        System.out.println(name);


        //problem 2

        String text = "To Get Changed To Underscore";
        text = text.replace(" ","_");
        System.out.println(text);


        //problem 3

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String yourName = sc.next();
        String letter = "Dear <|yourName|>, thanks a lot.";
        //letter = letter.replace("<|name|>", "ash"); //-->> could be done like this too.
        String formattedLetter = letter.replace("<|yourName|>", yourName.toUpperCase());
        System.out.print(formattedLetter);



        //problem 4

        String myString = "This string contains  double and   triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));


        // problem 5
        String myLetter = "Dear Ash,\n\tThis java course is Nice.\n\tThanks!";
        System.out.println(myLetter);
    }
}
