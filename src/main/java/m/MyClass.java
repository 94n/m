package m;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

/**
 * Main method class.
 */
public final class MyClass {

    /**
     * seed start day of month.
     */
    private static final int SEED_START_DAY_OF_MONTH = 12;
    /**
     * Seed start year.
     */
    private static final int SEED_START_YEAR = 2014;
    /**
     * Seed calculation output user tip, first part.
     */
    private static final String SEED_DESCRIPTION_PREFIX = "Pi digit index: ";
    /**
     * Seed calculation output user tip, second part.
     */
    private static final String SEED_DESCRIPTION_SUFFIX =
            "\nSelect this number of digits, "
                    + "first not selected one is today index";

    /**
     * Utility class.
     */
    private MyClass() {
    }

    /**
     * Start point.
     *
     * @param args command line arguments
     */
    public static void main(final String[] args) {
        System.out.println(SEED_DESCRIPTION_PREFIX + Duration
                .between(LocalDateTime
                        .of(SEED_START_YEAR, Month.APRIL,
                                SEED_START_DAY_OF_MONTH, 0, 0), LocalDateTime
                        .now()).toDays() + SEED_DESCRIPTION_SUFFIX);
    }

}
