package edu.cpp.cs5800.proxy;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Util {
    public static void log(String message) {
        System.out.println(getCurrentDate() + " " + message);
    }

    private static String getCurrentDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        ZonedDateTime losAngelesTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        return losAngelesTime.format(dtf);
    }
}
