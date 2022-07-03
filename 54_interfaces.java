package com.company;

interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedup(int increment);
}

interface HornBicycle{
    void blowHornK3g();
    void blowHornmhn();
}

class AvonCycle implements Bicycle, HornBicycle{
    void blowHorn(){
        System.out.println("pe pee poo poo");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedup(int increment){
        System.out.println("applying speedUP");
    }
    public void blowHornK3g(){
        System.out.println("Kabhi khushi kabhi gum pe peep pepe pe");
    };
    public void blowHornmhn(){
        System.out.println("main hoon na");
    };
}

public class cwh_54_interfaces {
    public static void main(String[] args) {
        AvonCycle cycleAsh = new AvonCycle();
        cycleAsh.applyBrake(1);
        // You can create properties in interfaces
        System.out.println(cycleAsh.a);
        // You can not modify the properties in interfaces as they are final
        //cycleAsh.a = 5;
        //System.out.println(cycleAsh.a);

        cycleAsh.blowHornK3g();
        cycleAsh.blowHornmhn();
    }
}
