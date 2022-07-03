package com.company;

class EkClass{
    int a;

    public int getA() {
        return a;
    }

    EkClass(int a){
        this.a = a;
    }
    public int returnOne(){
        return 1;
    }
}

class DoClass extends EkClass{
    DoClass(int c){
        super(c);
        System.out.println("Mai ek constructor hu");
    }
}

public class cwh_47_thisSuper {
    public static void main(String[] args) {
        EkClass e = new EkClass(69);
        DoClass d = new DoClass(5);
        System.out.println(e.getA());
    }
}
