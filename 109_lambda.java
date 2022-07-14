package com.company;

import java.util.HashSet;

@FunctionalInterface
interface DemoAno{
    void meth1(int a);
//    void meth2();
}

//class AshFunc implements DemoAno{
//    @Override
//    public void meth1() {
//        System.out.println("Im method 1");
//    }
//}


//class AnnonyDemo implements DemoAno{
//    public void display(){
//        System.out.println("hello");
//    }
//
//    @Override
//    public void meth1() {
//        System.out.println("im meth 1");
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println("im meth 2");
//    }
//}

public class cwh_109_lambda {

    public static void main(String[] args) {
//        DemoAno obj = new AnnonyDemo();
//        obj.meth1();

//        DemoAno obj = new AnnonyDemo();
//        obj.meth1();

        // anonymous class
//        DemoAno obj = new DemoAno() {
//            @Override
//            public void meth1() {
//                System.out.println("meth 1");
//            }
//
//            @Override
//            public void meth2() {
//                System.out.println("meth 2");
//            }
//        };
//        obj.meth1();

        //lambda expressions
//        DemoAno obj = new AshFunc();
//        obj.meth1();

        DemoAno obj = (a)->{
            System.out.println("im method one from this lambda function " + a);
        };
        obj.meth1(69);
    }
}
