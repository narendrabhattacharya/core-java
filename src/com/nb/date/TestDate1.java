package com.nb.date;

import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.time.LocalDate;

public class TestDate1 {

    public static void main(String[] args) {

    String localDate= LocalDate.now().format(DateTimeFormatter.BASIC_ISO_DATE);
    String ld = LocalDate.parse(localDate, DateTimeFormatter.BASIC_ISO_DATE).minusDays(1).format(DateTimeFormatter.BASIC_ISO_DATE);
    System.out.println(localDate.toString());
        System.out.println(ld.toString());
    }

}
