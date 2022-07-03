package com.company;

class Base1{
    Base1(){
        System.out.println("im a constructor of base 1");
    }
    Base1(int x){
        System.out.println("im a overloaded constructor of base 1 with value of x as:- "+x);
    }

    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Derived1 extends Base1{
    Derived1(){
//        super(0);
        System.out.println("im a derived1 class constructor");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("im an overloaded derived1 class constructor with value of y as:- "+y);
    }

    public int y;

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}

class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("im an child of derived1 constructor");
    }
    ChildOfDerived(int x, int y, int z){
        super(x,y);
        System.out.println("im an overloaded derived1 class constructor with value of z as:- "+z);
    }
}

public class cwh_46_constructorsInInheritance {
    public static void main(String[] args) {
        Base1 b = new Base1();
        Derived1 d = new Derived1();
        Derived1 d = new Derived1(14,9);
        ChildOfDerived cd = new ChildOfDerived();
        ChildOfDerived cd = new ChildOfDerived(12,13,15);
    }
}
