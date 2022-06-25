public class cwh_29_practiceSet6 {
    public static void main(String[] args) {
        // Practice problem 1
        /*float [] marks = {5.7f, 67.4f, 34.34f, 32.4f, 65.6f};
        float sum= 0;
        for (float element: marks){
            sum = sum +element;
        }
        System.out.println("The value of sum is "+ sum);


        // Practice problem 2

        float [] marks = {5.7f, 4, 34.34f, 32.4f, 65.6f};
        float num = 4;
        boolean isInArray = false;

        for (float element: marks){
            if(num == element){
                isInArray = true;
                break;
            }
        }

        if (isInArray){
            System.out.println("The value is present in the array");
        }
        else {
            System.out.println("the value is not present in the array");
        }



        // Practice Problem 3

        float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum= 0;
        for (float element: marks){
            sum = sum +element;
        }
        System.out.println("The average marks is "+ sum/ marks.length);


        // Pracatice problem 4
        int [][] mat1 = {{1, 2, 3},
                         {4, 5, 6}};

        int [][] mat2 = {{1, 2, 3},
                         {4, 5, 6}};

        int [][] result = {{0, 0, 0},
                         {0, 0, 0}};

        for(int i=0; i< mat1.length; i++){ // row number of times
            System.out.println(mat1.length);
            System.out.println("i = "+i);

            for(int j=0; j<mat1[i].length; j++){ // column number of time
                System.out.println(mat1[i].length);
                System.out.println("j = "+j);

                System.out.printf("setting value for i=%d and j=%d\n",i,j);
                result[i][j] = mat1[i][j] + mat2[i][j];

                System.out.println(result[i][j]);
                System.out.println();
            }
        }


        // Printing the elements of a 2-d array
        for(int i=0; i< mat1.length; i++){ // row number of times
            for(int j=0; j<mat1[i].length; j++){ // column number of time
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println("");
        }


        // Practice problem 5
        int a = Math.floorDiv(5,2); // used for greatest integer.
        int [] arr = {1, 2, 3, 4, 5, 6};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for (int i=0; i<n; i++){
            // swap a[i] and a[l-1-i]
            //  a   b   temp
            // |4| |3| ||
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for (int element: arr){
            System.out.print(element + " ");
        }


        // Practice problem 6
        // maximum number in an array
        int [] arr = {1, 2, 3, -42, 5, 6};
        int max = Integer.MIN_VALUE;
//        int max = 0;
        for (int e: arr){
            if(e>max){
                max =e;
            }
        }
        System.out.println("The maximum value of the array is: "+ max);


        // Practice problem 7
        // Minimum value in an array
        int [] arr = {1, 2, 3, -42, 5, 60};
        int min = Integer.MAX_VALUE;
        for (int e: arr){
            if (e<min){
                min = e;
            }
        }
        System.out.println("the minimum value in the array is: "+ min);

         */


        // Practice problem 8
//        int [] arr = {1, 2100, 3, -42, 5, 60};
        int [] arr = {1, 2, 3, 4, 5, 6};
        boolean isSorted = true;
        for (int i=0; i < arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println("The array is sorted");
        }
        else {
            System.out.println("The array is not sorted");
        }
    }
}