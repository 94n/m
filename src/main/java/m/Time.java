package m;

import java.time.LocalTime;

import static java.time.temporal.ChronoUnit.HOURS;
import static java.time.temporal.ChronoUnit.MINUTES;

/**
 * Main method class.
 */
public final class Time {

    /**
     * Start time.
     */
    private static final LocalTime START_TIME = LocalTime.parse("13:25");//now()

    /**
     * Period.
     */
    private static final LocalTime TIME_TO_ADD = LocalTime.parse("04:33:04");

    /**
     * Seed calculation output user tip, first part.
     */
    private static final String TIME_DESCRIPTION_PREFIX =
            "Time after " + TIME_TO_ADD + "\n";

    /**
     * Utility class.
     */
    private Time() {
    }

    /**
     * Start point.
     *
     * @param args command line arguments
     */
    public static void main(final String[] args) {
        System.out.println(
                TIME_DESCRIPTION_PREFIX + START_TIME.plus(
                        TIME_TO_ADD.getHour(),
                        HOURS).plus(TIME_TO_ADD.getMinute(),
                        MINUTES));
    }

}
