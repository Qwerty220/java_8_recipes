package functionpackage;

import org.junit.Test;

import java.util.Optional;
import java.util.function.Supplier;


public class SupplierTest {
    @Test
    public void getNames() {

        final Supplier<String> stringSupplier = () -> "Hello";
        final String s = stringSupplier.get();
        System.out.println(s);

        System.out.println(Optional.ofNullable("Hi").orElseGet(stringSupplier));
    }
}
