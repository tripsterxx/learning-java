public class cwh_25_practice_set_5 {
    public static void main(String[] args) {
        // Practice problem 1
//        int n = 4;
//        for (int i=n; i>0; i--){
//
//            for(int j=0; j<i; j++){
//                System.out.print("*");
//            }
//
//            System.out.print("\n");
//        }


        // Practice problem 2
//        int sum = 0;
//        int n = 3;
//        for (int i= 0 ; i<n ; i++){
//            sum = sum + (2*i);
//        }
//        System.out.println("sum of first 3 even number is: ");
//        System.out.println(sum);


        // Practice problem 3
//        int n = 5;
//        for (int i = 1; i<=10; i++){
//            System.out.printf("%d * %d = %d \n",n,i,n*i);
//        }

        // Practice problem 4
//        int n = 10;
//        for (int i = 10; i>=1; i--){
//            System.out.printf("%d * %d = %d \n",n,i,n*i);
//        }

        // Practice problem 5
        //factorial of a number using for loop
        // 3 -->> 3 * 2 * 1 or 1 * 2 * 3
        // factorial of n = n * n-1 * n-2 ... 1

//        int n =5;
//        int factorial = 1;
//        for (int i = 1; i<=n; i++){
//            factorial = factorial * i;
//            System.out.println(factorial);
//        }

        // Practice problem 6
        // factorial of a number using while loop
        // 5! = 5 *4*3*2*1 or 1*2*3*4*5
//        int n = 5;
//        int i = 1;
//        int factorial = 1;
//        while (i<n){
//            factorial *= i;
//            i++;
//        }
//        System.out.println(factorial);

        // Practice problem 7
//        int n = 4;
//        int i=n;
//        while (i>0){
//            int j = 0;
//            while(j<i){
//                System.out.print("*");
//                j++;
//            }
//            i--;
//            System.out.print("\n");
//        }


        // Practice problem 8
        // What can be done using one type of loop can also be done using the other two types of loops
        // This statement is absolutely True.


        // Practice problem 9
//        int n = 8;
//        int sum = 0;
//        for (int i = 1; i<=10; i++){
//            sum += n*i;
//        }
//        System.out.println(sum);


        // Practice problem 10
        // A do while loop is executed at least once.

        // Practice problem 11
        int sum = 0;
        int n = 5;
        int i = 0;
        while (i<=n){
            sum += (2*i);
            i++;
        }
        // 0 (0) 1(2) 2(6) 3(12) 4(20) 5(30)
        System.out.printf("sum of first %d even number is: ",n);
        System.out.println(sum);
    }
}
