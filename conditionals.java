public class cwh_16_conditionals {
        public static void main(String[] args) {
            // note that the else block is optional
                int age = 18;
//            if (age>18){
//                System.out.println("Yes boy you can drive");
//            }
//            if (age==18){
//                System.out.println("Yes boy you can drive");
//            }
            boolean condition = (age == 18);
            if (condition){
                System.out.println("Yes boy you can drive");
            }
            else{
                System.out.println("No boy you can not drive yet");
            }
        }
}
