package functionpackage;

import org.junit.Test;

import java.time.LocalDate;
import java.util.function.Consumer;

public class ConsumerTest {

    @Test
    public void getNames() {
        Consumer<LocalDate> stringConsumer = LocalDate::toString;
        final Consumer<LocalDate> localDateConsumer = stringConsumer.andThen(localDate -> localDate.getDayOfMonth());

        System.out.println();
    }
}
