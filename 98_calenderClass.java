package com.company;

import java.util.Calendar;
import java.util.TimeZone;

public class cwh_98_calenderClass {
    public static void main(String[] args) {
//        Calendar c = Calendar.getInstance();
//        System.out.println(c.getCalendarType());
//        System.out.println(c.getTimeZone());

//        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());


    }
}
