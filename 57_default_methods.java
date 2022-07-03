package com.company;

interface MyCamera{
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

interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone{
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

class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
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

}

public class cwh_57_default_methods {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.recordVideo4k();
        String[] ar = ms.getNetworks();
        for (String item: ar){
            System.out.println(item);
        }
    }
}
