package com.company;

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i = 34;
        System.out.println("thank you");
    }
}

public class cwh_73_thread_constructor {
    public static void main(String[] args) {
        MyThr t = new MyThr("Ash");
        MyThr t2 = new MyThr("chintu");
        t.start();
        t2.start();
        System.out.println("the id of the thread t is: "+t.getId());
        System.out.println("the id of the thread t is: "+t.getName());

        System.out.println("the id of the thread t is: "+t2.getId());
        System.out.println("the id of the thread t is: "+t2.getName());


    }
}
