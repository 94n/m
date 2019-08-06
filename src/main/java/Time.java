import java.time.LocalTime;

import static java.time.temporal.ChronoUnit.HOURS;
import static java.time.temporal.ChronoUnit.MINUTES;

public final class Time {

    private static final String DURATION = "04:33:04";

    private static final String START = "09:37";

    public static void main(final String[] args) {
        LocalTime localTimeAfterDuration = LocalTime.parse(START).plus(LocalTime.parse(DURATION).getHour(), HOURS).plus(LocalTime.parse(DURATION).getMinute(), MINUTES);
        System.out.println(Messages.PREFIX.text + LocalTime.parse(DURATION) + "\n" + localTimeAfterDuration);
    }

    private enum Messages {

        PREFIX("Time after ");

        private String text;

        Messages(String text) {
            this.text = text;
        }

    }

}
