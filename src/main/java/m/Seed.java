package m;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

/**
 * Main method class.
 */
public final class Seed {

    /**
     * start day of month.
     */
    private static final int DAY = 12;
    /**
     * start year.
     */
    private static final int YEAR = 2014;
    /**
     * Seed start month.
     */
    private static final Month MONTH = Month.APRIL;
    /**
     * Seed start time.
     */
    private static final LocalDateTime START_TIME = LocalDateTime
            .of(YEAR, MONTH,
                    DAY, 0, 0);
    /**
     * Seed calculation output user tip, first part.
     */
    private static final String DESCRIPTION_PREFIX = "Pi digit index: ";
    /**
     * Seed calculation output user tip, second part.
     */
    private static final String DESCRIPTION_SUFFIX =
            "\nSelect this number of digits, "
                    + "first not selected one is today index";

    /**
     * Seed Utility class.
     */
    private Seed() {
    }

    /**
     * Start point.
     *
     * @param args command line arguments
     */
    public static void main(final String[] args) {
        long daysSinceStart = Duration
                .between(START_TIME, LocalDateTime
                        .now()).toDays();
        System.out.println(
                DESCRIPTION_PREFIX + daysSinceStart + DESCRIPTION_SUFFIX);
    }

}
