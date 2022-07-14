package com.company;

@FunctionalInterface
interface MyFunctionalInterface{
    void thisMethod();
}

class NewPhone extends Phone{
    @Override
    public void showTime(){
        System.out.println("time is 8pm");
    }
    @Deprecated
    public int sum(int a, int b){
        return a+b;
    }
}

public class cwh_108_annotations {
    @SuppressWarnings("deprication")
    public static void main(String[] args) {
        NewPhone phone = new NewPhone();
        phone.showTime();
        int sum = phone.sum(5,6);
        System.out.println(sum);
    }
}
