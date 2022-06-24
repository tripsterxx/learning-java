public class cwh_27_Arrays_forEachLoop {
    public static void main(String[] args) {
        int [] marks = {100, 20, 80, 45, 69};


        float [] marks = {100.32f, 20.43f, 80.0f, 45.21f, 69.43f};
        System.out.println(marks.length);
        System.out.println(marks[4]);



        String [] students = {"ash", "rohan", "shubham", "lovish"};
        System.out.println(students.length);
        System.out.println(students[0]);
         

         Displaying the array (for loop) (This is in reverse order)
        for (int i= marks.length-1; i>=0; i--){
            System.out.println(marks[i]);
        }

        // Displaying the array in for each loop
        for(int element: marks){
            System.out.println(element);
        }
    }
}
