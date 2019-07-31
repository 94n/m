import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

public class MyClass {

    private static final int SEED_START_DAY_OF_MONTH = 12;
    private static final int SEED_START_YEAR = 2014;
    private static final String SEED_DESCRIPTION_PREFIX = "Pi digit index: ";
    private static final String SEED_DESCRIPTION_SUFFIX = "\nSelect this number of digits, first not selected one is today index";

    public static void main(String[] args) {
        System.out.println(SEED_DESCRIPTION_PREFIX + Duration.between(LocalDateTime.of(SEED_START_YEAR, Month.APRIL, SEED_START_DAY_OF_MONTH, 0, 0), LocalDateTime.now()).toDays() + SEED_DESCRIPTION_SUFFIX);
    }

}
