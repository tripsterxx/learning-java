package com.company;

interface MyCamera2{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("good morning");
    }
    default void recordVideo4k(){
        greet();
        System.out.println("recording in 4k...");
    };
}

interface MyWifi2{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("connecting.... ");
    }
//    void takeSnap(){
//        System.out.println("taking snap");
//    }
}

class MySmartPhone2 extends MyCellPhone2 implements MyWifi2, MyCamera2{
    public void takeSnap(){
        System.out.println("taking snap");
    }
    public String[] getNetworks(){
        System.out.println("getting list of networks");
        String[] networkList = {"Ash", "jio", "airtel"};
        return networkList;
    }
    //    public void recordVideo4k(){
//        System.out.println("recording in 4k 60fps...");
//    }
    public void recordVideo(){
        System.out.println("recording videos");
    }
    public void connectToNetwork(String network){
        System.out.println("connecting to: "+ network);
    }

    public void sampleMeth(){
        System.out.println("meth");
    }
}


public class cwh_59_polymorphism {
    public static void main(String[] args) {
        MyCamera2 cam1 = new MySmartPhone2(); // -> this is a smartphone but, use it as a camera
        // cam1.getNetworks(); --> not allowed.
        //cam1.sampleMath(); --> not allowed.
        cam1.recordVideo4k();

        MySmartPhone2 s = new MySmartPhone2();
        s.sampleMeth();
        s.recordVideo4k();
        s.recordVideo();
        s.getNetworks();
        s.callNumber(2349872);
    }
}
