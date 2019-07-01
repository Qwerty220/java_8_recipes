package generics.genericclass;

public class Runner {

    public static void main(String[] arg) {

        final GenericHolder<String> stringHolder = new GenericHolder<>();
        stringHolder.setObj("Hello");
        System.out.println(stringHolder.getObj());

        final GenericHolder<Integer> integerHolder = new GenericHolder<>();
        integerHolder.setObj(5);
        System.out.println(integerHolder.getObj() * integerHolder.getObj());
    }
}
