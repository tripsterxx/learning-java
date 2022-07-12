package com.company;

import java.util.*;

public class cwh_91_arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
        l2.add(15);
        l2.add(18);
        l2.add(19);

        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
//        l1.add(5);
        l1.add(0,5);
        l1.add(0,1);
        l1.addAll(0,l2);
//        l1.addAll(l2);
//        l1.clear();
        System.out.println(l1.contains(69));
        System.out.println(l1.contains(7));
        System.out.println(l1.indexOf(7));
        System.out.println(l1.lastIndexOf(5));
        l1.set(1,69);
        l1.remove(1);
        System.out.println(l1.isEmpty());
//        System.out.println(l1.indexOf(69)); //--> returns -1
        for (int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
//        l1.toArray();
//        for (int i=0; i<l1.size();i++){
//            System.out.print(l1.get(i));
//        }
    }
}
