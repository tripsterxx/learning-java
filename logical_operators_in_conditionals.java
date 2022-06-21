public class cwh_17_logical_operators_in_conditionals {
    public static void main(String[] args) {

        System.out.println("For logical AND..");
        boolean a = true;
        boolean b = true;
        if (a && b){
            System.out.println("Y");
        }
        else {
            System.out.println("N");
        }




        System.out.println("For logical OR..");
        boolean a = true;
        boolean b = false;
        if (a || b){
            System.out.println("Y");
        }
        else {
            System.out.println("N");
        }

        

        boolean a = true;
        boolean b = false;
        System.out.println("For logical NOT");
        System.out.println("Not(a) is ");
        System.out.println(!a);
        System.out.println("Not(b) is ");
        System.out.println(!b);

    }
}
