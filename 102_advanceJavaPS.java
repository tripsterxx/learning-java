package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class cwh_102_advanceJavaPS {
    public static void main(String[] args) {
        //ps problem 1
        ArrayList ar = new ArrayList<>();
        ar.add("student 1");
        ar.add("student 2");
        ar.add("student 3");
        ar.add("student 4");
        ar.add("student 5");
        ar.add("student 6");
        ar.add("student 7");
        ar.add("student 8");
        ar.add("student 9");
        ar.add("student 10");
        for (Object o: ar){
            System.out.println(o);
        }

        //ps problem 2
        Date d = new Date();
        System.out.println("using date");
        System.out.println(d.getHours() + ":" + d.getMinutes() + ":"+ d.getSeconds());

        //ps problem 3
        Calendar c = Calendar.getInstance();
        System.out.println("using Calender");
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":"+ c.get(Calendar.SECOND));

        // ps problem 4
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s");
        String myDate = dt.format(df);
        System.out.println("using local date time formatter");
        System.out.println(myDate);

        //ps problem 5
        HashSet<Integer> s = new HashSet<>();
        s.add(5);
        s.add(6);
        s.add(46);
        s.add(60);
        s.add(9);
        s.add(6);
        System.out.println(s);
    }
}
