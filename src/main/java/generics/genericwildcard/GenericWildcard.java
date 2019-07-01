package generics.genericwildcard;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GenericWildcard {

    public static void main(String[] arg) {
        GenericWildcard cw3 = new GenericWildcard();
        RuntimeException runtimeException = new RuntimeException();
        Throwable throwable = new Throwable();

        System.out.println("Object are not RuntimeException and Throwable");
//        cw3.processObjects(Arrays.asList(runtimeException,throwable)); //not compile

        System.out.println("? are RuntimeException and Throwable");
        cw3.processAny(Arrays.asList(runtimeException,throwable));

        System.out.println("class Exception extends Throwable");
        cw3.processSuperClass(Collections.singletonList(throwable));

        System.out.println("class RuntimeException extends Exception");
        cw3.processExtendsClass(Collections.singletonList(runtimeException));


    }

    void processObjects(List<Object> list) {
        System.out.println("Ожидаем объекты");
    }

    void processAny(List<?> list) {
        System.out.println("? все что угодно");
    }

    void processSuperClass(List<? super Throwable> list) {

        if ((list.isEmpty())) {
            return;
        }

        final Object object = list.get(0);

        if (object instanceof Throwable) {
            System.out.println("Throwable");
        } else {
            System.out.println("? super Throwable");
        }

    }

    void processExtendsClass(List<? extends Exception> list) {


        if ((list.isEmpty())) {
            return;
        }

        final Exception exception = list.get(0);
        if (exception instanceof RuntimeException) {
            System.out.println("RuntimeException");
        } else {
            System.out.println("? extends Exception");
        }

    }
}

