import java.util.Scanner;

public class cwh_13_strings {
    public static void main(String[] args) {
        String name = new String("Ash");
        String name = "Ash";
        System.out.print("The name is: ");
        System.out.print(name);

        int a = 6;
        float b = 6.534f;

        //%d for int and double, %f for float, %c for character, %s for string.

        System.out.printf("The value of a is '%d' and the value of b is %0.2f",a,b); // resultant value will be till 2 decimals.
        System.out.printf("The value of a is '%d' and the value of b is %8.2f",a,b); // it will take up 8 place spaces to pint the number and will print till 2 decimal point number.

        System.out.println();

        System.out.printf("The value of a is '%d' and the value of b is '%f'",a,b);
        System.out.format("The value of a is '%d' and the value of b is '%f'",a,b);
        // printf and format work literally the same.

        Scanner sc = new Scanner(System.in);
        String st = sc.next(); // first word only
        String st = sc.nextLine(); // whole line provided will be taken.
        System.out.println(st);
    }
}
