package packages.example;

import packages.ExamplePublic;

public class ExampleRunner {
    public static void main(String[] args) {
        final ExamplePublic examplePublic = new ExamplePublic();

        System.out.println(examplePublic.publicName);
//        System.out.println(examplePublic.packageName);
//        System.out.println(examplePublic.protectedName);

        final ExtendedExamplePublic extendedExamplePublic = new ExtendedExamplePublic();
        System.out.println(extendedExamplePublic.publicName);
        System.out.println(extendedExamplePublic.getProtectedName());

    }
}
