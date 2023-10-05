package com.bonitasoft.presales.dateutils;

import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class DateUtilsTest {
    @Test
    void should_format_date(){
        //given
        Date date = Date.from(getInstant());

        //when
        final String format = DateUtils.format(date);

        //then
        assertEquals(format,"06 janvier 1970");
    }

    @Test
    void should_format_offsetDateTime(){
        //given
        ZoneId zoneId = ZoneId.of("Europe/Paris");
        OffsetDateTime offsetDateTime = OffsetDateTime.ofInstant(getInstant(), zoneId);

        //when
        final String format = DateUtils.format(offsetDateTime);

        //then
        assertEquals("06 janvier 1970 01:00:00",format);
    }

    private static Instant getInstant() {
        return Instant.EPOCH.plus(5, ChronoUnit.DAYS);
    }
}
