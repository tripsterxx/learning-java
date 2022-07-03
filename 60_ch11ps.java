package com.company;

abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{
    void write(){
        System.out.println("write");
    }
    void refill(){
        System.out.println("refill");
    }
    void changeNib(){
        System.out.println("changing the nib");
    }
}

class Monkey{
    void jump(){
        System.out.println("jumping...");
    }
    void bite(){
        System.out.println("biting...");
    }
}

interface BasicAnimal {
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("eating..");
    }
    public void sleep(){
        System.out.println("sleeping..");
    }

    void speak(){
        System.out.println("hello human");
    }
}

public class cwh_60_ch11ps {
    public static void main(String[] args) {
        // question 1 and 2
        FountainPen pen = new FountainPen();
        pen.changeNib();

        //question 3
        Human ash = new Human();
        ash.sleep();

        //question 5
        Monkey m1 = new Human();
//        m1.speak(); --> can not use speak because the reference is of monkey class which does not have speak class and object is of human
        m1.jump();
        BasicAnimal lovish = new Human();
//        lovish.speak();
        lovish.eat();
        lovish.sleep();
    }
}