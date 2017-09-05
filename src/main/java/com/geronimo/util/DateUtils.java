package com.geronimo.util;


import org.apache.commons.lang3.Validate;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateUtils {

    private static final ZoneId DEFAULT_ZONE = ZoneId.systemDefault();

    public static long getLocalDateTimeMillis(LocalDateTime localDateTime) {
        return getLocalDateTimeMillis(localDateTime, DEFAULT_ZONE);
    }

    public static long getLocalDateTimeMillis(LocalDateTime localDateTime, ZoneId zoneId) {
        Validate.notNull(localDateTime, "LocalDateTime instance is required to extract milliseconds");

        ZonedDateTime zonedDateTime = localDateTime.atZone(zoneId);
        return zonedDateTime.toInstant().toEpochMilli();
    }
}
