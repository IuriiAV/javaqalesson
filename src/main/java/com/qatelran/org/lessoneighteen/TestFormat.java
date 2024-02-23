package com.qatelran.org.lessoneighteen;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TestFormat {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:mm:ss a",
                Locale.TRADITIONAL_CHINESE);
        String format = now.format(formatter);
        System.out.println(format);

        System.out.println(now.format(DateTimeFormatter.ISO_LOCAL_TIME));
    }
}
