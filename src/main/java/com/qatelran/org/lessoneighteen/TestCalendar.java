package com.qatelran.org.lessoneighteen;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        GregorianCalendar gregorianCalendar = new GregorianCalendar(2024,
                Calendar.APRIL, 17);
        System.out.println(gregorianCalendar);
        int month = gregorianCalendar.get(Calendar.MONTH);
        System.out.println("Month in calendar is " + month);

        int dayOfMonth = gregorianCalendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("Day of month is " + dayOfMonth);

        gregorianCalendar.set(Calendar.MONTH, 5);
        System.out.println("Month in calendar is " + gregorianCalendar.get(Calendar.MONTH));

        gregorianCalendar.set(1975, Calendar.DECEMBER, 31);
        System.out.println("Month in calendar is " + gregorianCalendar.get(Calendar.MONTH));
        System.out.println(gregorianCalendar);

        gregorianCalendar.add(Calendar.YEAR, 5);
        System.out.println(gregorianCalendar);

        gregorianCalendar.add(Calendar.MONTH, -3);
        System.out.println(gregorianCalendar);

        Date fullDate = gregorianCalendar.getTime();
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        System.out.println(fullDate);
        System.out.println(timeInMillis);

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateAsString = formatter.format(fullDate);
        System.out.println(dateAsString);

        // 19-12-22; - day,month,year
        // 19, 353, 12:46 - day , number of year, time
        Date currentDate = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yy ; d, D, H:mm");
        System.out.println(simpleDateFormat.format(currentDate));
    }
}
