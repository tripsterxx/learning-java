package com.company;

class Base{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("im in base and setting x now");
        this.x = x;
    }

    public void Base(){
        System.out.println("I am a constructor");
    }
}

class Derived extends Base{
    public  int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class DerivedSecond extends Derived{
    public void show(){
        System.out.println(getY());
        System.out.println(getX());
    }
}

public class cwh_45_inheritance {
    public static void main(String[] args) {
        //creating an object of Base class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        //creating an object of Derived class
        Derived d = new Derived();
        d.setX(43);
        System.out.println(d.getX());

        DerivedSecond d2 = new DerivedSecond();
        d2.setX(43);
        System.out.println(d2.getX());
        d2.show();


    }
}
