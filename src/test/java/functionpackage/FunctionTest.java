package functionpackage;

import com.sun.org.apache.xpath.internal.functions.FuncCount;
import org.junit.Test;

import java.util.function.Function;

public class FunctionTest {

    @Test
    public void getNames() {
        Function<Integer, Integer> integerFunction = integer -> integer * integer;
        Function<Integer, Integer> sumFunction = integer -> integer + integer;
        final Integer apply = integerFunction.andThen(sumFunction).apply(5);
        System.out.println(apply);

        System.out.println(integerFunction.compose(sumFunction).apply(5));


    }
}
