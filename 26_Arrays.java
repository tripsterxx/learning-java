public class cwh_26_Arrays {
    public static void main(String[] args) {
        // classroom of 500 students - You have to store marks of these 500 students.
        /*
        You have 2 options:
        1. create 500 variables
        2. Use Array (recommended)
         */
        // NOTE: array is a collection of similar types of data

        // There are three main ways to create an array in java.
        // 1. Declaration and memory allocation.
         int [] marks = new int[5];

        // 2. Declaration and then memory allocation.
         int [] marks;
         marks = new int[5];

        // Initialization
        marks[0] = 100;
        marks[1] = 60;
        marks[2] = 70;
        marks[3] = 90;
        marks[4] = 86;

        // 3. Declaration, memory allocation and initialization together
         int [] marks = {100, 20, 80, 45, 71, 69};
        System.out.println(marks[5]);

    }
}
