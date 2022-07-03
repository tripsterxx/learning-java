package com.company;

class Circle{
    public int radius;
    Circle(){
        System.out.println("im non param of circle");
    }
    Circle(int r){
        System.out.println("i am circle parameterized constructor");
        this.radius = r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder1 extends Circle{
    public int height;
    Cylinder1(int r, int h){
        super(r);
        System.out.println("i am cylinder1 parameterized constructor");
        this.height =h;
    }

    @Override
    public double area(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}

public class cwh_52_ch10ps {
    public static void main(String[] args) {
        //problem 1
//        Circle c = new Circle(12);
        Cylinder1 obj = new Cylinder1(12,4);
    }
}
