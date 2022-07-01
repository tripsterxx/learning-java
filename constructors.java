package com.company;

class MyMainEmployee{
    private int id;
    private String name;

    // setter for name
    public void setName(String n){
        name = n;
    }
    //getter for name
    public String getName(){
        return name;
    }

    //setter for id
    public void setId(int i){
        id = i;
    }
    //getter for id
    public int getId(){
        return id;
    }
}

public class cwh_42_constructors {
    public static void main(String[] args) {
        MyMainEmployee ash = new MyMainEmployee();
        ash.setName("tripster");
        System.out.println(ash.getName());
    }
}
