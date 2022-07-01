package com.company;

class Rectangle{
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}



class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea(){
        return 2*3.14*radius*radius + 2*3.14*radius*height;
    }
    public double volume(){
        return 3.14*radius*radius*height;
    }

}

public class cwh_44_ps9 {
    public static void main(String[] args) {
        //problem 1

        Cylinder myCylinder = new Cylinder(9,12);

        myCylinder.setHeight(12);
        int h = myCylinder.getHeight();
        System.out.println(h);
        myCylinder.setRadius(9);
        System.out.println(myCylinder.getRadius());


        //problem 2
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());

        //problem 3
        int h = myCylinder.getHeight();
        System.out.println(h);
        System.out.println(myCylinder.getRadius());

        //problem 4
        Rectangle r = new Rectangle(12,56);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());
    }
}
