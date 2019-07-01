package packages.example;

import packages.ExamplePublic;

public class ExtendedExamplePublic extends ExamplePublic {

    private String privateName = "private";


    public String getProtectedName() {
        return super.protectedName;
    }
}
