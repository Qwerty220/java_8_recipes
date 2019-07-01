package packages;

public class ExampleRunner {
    public static void main(String[] args) {
        final ExamplePublic examplePublic = new ExamplePublic();

        System.out.println(examplePublic.publicName);
        System.out.println(examplePublic.packageName);
        System.out.println(examplePublic.protectedName);
    }
}
