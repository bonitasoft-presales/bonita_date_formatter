package com.bonitasoft.presales.dateutils;

import java.text.SimpleDateFormat;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class DateUtils {
  static String format(Date date) {
    return getSimpleDateFormat().format(date);
  }

  static String format(OffsetDateTime offsetDateTime) {
    return offsetDateTime.format(getDateTimeFormatter());
  }

  private static DateTimeFormatter getDateTimeFormatter() {
    return DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm:ss", Locale.FRANCE);
  }

  private static SimpleDateFormat getSimpleDateFormat() {
    return new SimpleDateFormat("dd MMMM yyyy", Locale.FRANCE);
  }
}
