import java.time.LocalTime;

import static java.time.temporal.ChronoUnit.HOURS;
import static java.time.temporal.ChronoUnit.MINUTES;

public final class Time {

    private static final LocalTime START = LocalTime.parse("14:10");

    public static void main(final String[] args) {
        System.out.println(("Time after " + LocalTime.parse("04:33:04") + "\n") + START.plus(LocalTime.parse("04:33:04").getHour(), HOURS).plus(LocalTime.parse("04:33:04").getMinute(), MINUTES));
    }

}
