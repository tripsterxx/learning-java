import java.util.Scanner;

public class cwh_23_for_loop {
    public static void main(String[] args) {
        // A for loop is usually used to execute a piece of code for specific number of times.
//        for (int i = 1; i<=10; i++){
//            System.out.println(i);
//        }

        // Practice Question: Write a program to print first n odd numbers using a for loop
        // 2i = Even Numbers = 0, 2, 4, 6, 8
        // 2i+1 = Odd Numbers = 1, 3, 5, 7, 9
//        int n = 10;
//        for(int i=0; i<n; i++){
//            System.out.println(2*i+1);
//        }

        //Decrementing for loop
//        for (int i=7; i!=0; i--){
//            System.out.println(i);
//        }

        //Write a program to print first n natural number in reverse order.
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number:-->>  ");
        int n = sc.nextInt();
        for(int i = n; i>0; i--){
            System.out.println(i);
        }
    }
}
