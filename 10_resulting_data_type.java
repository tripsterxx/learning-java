public class cwh_10_resulting_data_type {
    public static void main(String[] args) {
        /*byte x = 5;
        int y = 6;
        short z = 8;
        int a = y+z;
        float b = 6.54f + x;
        System.out.println(b);*/

//        Increment and Decrement operator
        int i = 56;
        System.out.println(i++); //first i is used then incremented (56 print)
        System.out.println(i); // now incremented value printed (57 print)
        System.out.println(++i); // now value of is increased then used (58 print)
        System.out.println(i); // value of i is used (58 print)

        int y = 7;
        int x = ++y * 8;
        System.out.println(x); // 64 obviously

        char a = 'a';
        System.out.println(++a);
    }
}
