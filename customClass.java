package com.company;

class employee{
    int id;
    int salary;
    String name;
    public  void  printDetails(){
        System.out.println("My id is: "+ id);
        System.out.println("and my name is: "+ name);
    }

    public int getSalary(){
        return salary;
    }
}

public class cwh_38_customClass {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        employee ash = new employee(); // instantiating a new employee object
        employee john = new employee(); // instantiating a new employee object

        // setting attributes for ash
        // setting attributes for ash
        ash.id = 12;
        ash.name = "ash";
        ash.salary = 100;


        john.id = 27;
        john.name = "john khandelwal";
        john.salary = 90;

        // printing the attributes
//        System.out.println(ash.id);
//        System.out.println(ash.name);

        ash.printDetails();
        john.printDetails();
        int salary = john.getSalary();
        System.out.println(salary);
    }
}
