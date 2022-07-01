package com.company;

class MyEmployee{
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

public class cwh_40_ch9 {
    public static void main(String[] args) {
        MyEmployee ash = new MyEmployee();
//        ash.id = 45;
//        ash.name= "ash"; //-->> throws an error due to private access modifier.

        ash.setName("tripster");
        System.out.println(ash.getName());
    }
}
