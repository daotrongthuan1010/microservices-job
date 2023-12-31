package job.future.com.jobservice.utils;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


public class DateTimeUtils {

  public static LocalDateTime convertToUTC(LocalDateTime localDateTime, String timeZone) {
    ZoneId zoneId = ZoneId.of(timeZone);
    ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
    ZonedDateTime utcDateTime = zonedDateTime.withZoneSameInstant(ZoneId.of("UTC"));
    return utcDateTime.toLocalDateTime();
  }

  public static LocalDateTime convertToLocalDateTime(String dateTimeString, String format) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
    return LocalDateTime.parse(dateTimeString, formatter);
  }
}
