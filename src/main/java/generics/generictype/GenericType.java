package generics.generictype;

public class GenericType {

    public static <T> T getInstance(Class<T> theClass) throws IllegalAccessException, InstantiationException {
        return theClass.newInstance();
    }

    public static void main(String[] arg) throws InstantiationException, IllegalAccessException {
        final String str = getInstance(String.class);
        final Long number = getInstance(Long.class);
        final byte[] mas = getInstance(byte[].class);
    }
}
