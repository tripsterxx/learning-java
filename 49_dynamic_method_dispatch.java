package com.company;

class Phone{
    public void on(){
        System.out.println("turning on phone...");
    }
    public void showTime(){
        System.out.println("time is 8 AM");
    }

}

class SmartPhone extends Phone{
    public void music(){
        System.out.println("playing music...");
    }
    public void on(){
        System.out.println("turning on smartphone...");
    }
}

public class cwh_49_dynamic_method_dispatch {
    public static void main(String[] args) {
        //Phone obj = new Phone(); // Allowed
        //SmartPhone smobi = new SmartPhone(); // Allowed
        //obj.name();

        Phone obj = new SmartPhone(); // yes it is allowed
//        SmartPhone obj2 = new Phone(); --> not allowed

        obj.showTime();
        obj.on();
        // obj.music(); -> Not Allowed



        /*
        All summary HERE:-->>
        super class
            meth1
            meth2 -> (i)

        sub class
            meth2 -> overridden (ii)
            meth3

        scenario 1-->
        super obj = new sub(); -> allowed
        obj.meth2() -> (ii) is called (method of object)
        obj.meth3() -> not allowed

        scenario 2-->
        sub obj = new super(); --> definitely not allowed.
         */
    }
}
