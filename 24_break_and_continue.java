public class cwh_24_break_and_continue {
    public static void main(String[] args) {
        // Break and Continue using loop
        for (int i = 0; i<5; i++){
            System.out.println(i);
            System.out.println("java is great!!");
            if (i==2){
                System.out.println("ending the loop");
                break;
            }
        }

        // Break and Continue using while loop
        int i =0;
        while (i<5){
            System.out.println(i);
            System.out.println("java is great!!");
            if (i==2){
                System.out.println("ending the loop");
                break;
            }
            i++;
        }

        // Break and Continue using do while loop
        int i =0;
        do {
            System.out.println(i);
            System.out.println("java is great!!");
            if (i==2){
                System.out.println("ending the loop");
                break;
            }
            i++;
        }while (i<5);
        System.out.println("loop ends here!");

        //using continue statement.
        for (int i =0; i<50;i++){
            if (i==2){
                System.out.println("ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("java is great!!");
        }

    }
}
