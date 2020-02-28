package com.ykb.java.train.datetime;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTimeTry {
    public static void main(final String[] args) {
        Date date = new Date();
        Calendar calendar = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");

        DateTimeFormatter df1 = DateTimeFormatter.BASIC_ISO_DATE;
        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = LocalDate.parse("2000-10-20");
        LocalDate localDate4 = LocalDate.parse("20001020",
                                               df1);
        LocalDate localDate3 = LocalDate.of(2000,
                                            10,
                                            20);
        String string = localDate4.plusDays(1)
                                  .plus(2,
                                        ChronoUnit.DAYS)
                                  .minusMonths(1)
                                  .toString();
        System.out.println(string);

        LocalTime localTime = LocalTime.now();
        LocalTime localTime1 = LocalTime.parse("16:00");
        LocalTime localTime2 = LocalTime.of(15,
                                            15);
        localTime2.plusHours(2)
                  .minusMinutes(15)
                  .toString();

        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime ofDT = LocalDateTime.of(localDate1,
                                              localTime);
        ZoneId ofZoneId = ZoneId.of("Europe/London");
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ofZoneId);

    }
}
