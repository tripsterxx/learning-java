package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class cwh_101_date_time_formatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();  // this is the date
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy || dd/MM/yyyy --> E, (a) H:m"); // this is the format
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;

        String myDate = dt.format(df);  // creating date string using date and formatter.
        String myDate2 = dt.format(df2);
        System.out.println(myDate2);
        System.out.println(myDate);
    }
}
