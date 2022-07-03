package com.company;

class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

class cellPhone{
    public void ringing(){
        System.out.println("ringing...");
    }
    public void vibrating(){
        System.out.println("vibrating...");
    }
    public void callFriend(){
        System.out.println("calling your friend...");
    }

}

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimter(){
        return side*4;
    }
}

class Tommy{
    public void hit(){
        System.out.println("hitting the enemy");
    }

    public void run(){
        System.out.println("running from the enemy");
    }

    public void fire(){
        System.out.println("firing on the enemy");
    }
}

public class cwh_39_ch8_ps {
    public static void main(String[] args) {

        //problem 1
        Employee aakash = new Employee();
        aakash.setName("ash");
        aakash.salary = 200;
        System.out.println(aakash.getName());
        System.out.println(aakash.getSalary());

        //problem 2
        cellPhone mobile = new cellPhone();
        mobile.callFriend();
        mobile.vibrating();
        mobile.ringing();

        //problem 3
        Square sq = new Square();
        sq.side = 4;
        System.out.println(sq.area());
        System.out.println(sq.perimter());

        //problem 5
        Tommy player1 = new Tommy();
        player1.fire();
        player1.run();
        player1.hit();
    }
}
