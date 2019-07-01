package generics.genericsmethod;

public class GenericMethod {

    public <T> String convertToString(T t) {
        return t.toString();
    }

    public <T> T inspectType(T t) {
        System.out.println(t);
        System.out.println(t.getClass().getName());
        return t;
    }

    public static void main(String[] arg) {
        GenericMethod gm = new GenericMethod();

        System.out.println(gm.convertToString("Hello"));
        System.out.println(gm.convertToString(new Object()));

        gm.inspectType(2L);
        gm.inspectType(2);
        gm.inspectType(2.0);
    }
}
