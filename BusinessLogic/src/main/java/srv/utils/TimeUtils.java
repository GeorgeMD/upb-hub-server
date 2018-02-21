package srv.utils;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

/**
 * @author GeorgeMD
 */
public class TimeUtils {

    private TimeUtils() { }
    public static int getWeekParity(String firstWeekStr) {
        LocalDate now = LocalDate.now();
        LocalDate firstWeek = LocalDate.parse(firstWeekStr);
        return (DAYS.between(firstWeek, now) % 14) < 7 ? 1 : 2;
    }
}
