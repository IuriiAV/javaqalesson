package com.qatelran.org.lessoneighteen;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Set;

public class TestZoneDateTime {

    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        ZoneId zone = now.getZone();
        ZoneOffset offset = now.getOffset();
        System.out.println(zone + " " + offset);

        System.out.println(ZoneId.systemDefault());

        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        for (String currZone : availableZoneIds) {
            System.out.println(" Zone " + currZone);
        }
    }
}
