import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

public final class Seed {

    public static void main(final String[] args) {
        System.out.println(Messages.PREFIX.text + Duration.between(LocalDateTime.of(2014, Month.APRIL, 12, 0, 0), LocalDateTime.now()).toDays() + Messages.SUFFIX.text);
    }

    private enum Messages {

        PREFIX("Pi digit index: "), SUFFIX("\nSelect this number of digits, first not selected one is today index");

        private String text;

        Messages(String text) {
            this.text = text;
        }

    }

}
