package com.company;

import java.awt.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class cwh_99_gregorian {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTimeZone());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println( "time: "+ c.getTime());
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+ ":"+ c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(Calendar.YEAR));
    }
}
