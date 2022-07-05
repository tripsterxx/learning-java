// package ashcode;
import ashcode.gym.AakashGym;

class Using extends AakashGym{
     void meth2(){
     System.out.println(x);
     System.out.println(y);
     // System.out.println(z);
     // System.out.println(a);
     }
}

public class UsingPackage {
     public static void main(String[] args){
          System.out.println("I am using the packages");
          Using c = new Using();
          c.meth2();
     }
}