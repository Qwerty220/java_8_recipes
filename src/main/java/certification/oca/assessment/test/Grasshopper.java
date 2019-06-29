package certification.oca.assessment.test;

/**
 * Which are true of the following code? (Choose all that apply)
 *
 * Immediately after line 9, no grasshopper objects are eligible for garbage collection.
 * Immediately after line 10, no grasshopper objects are eligible for garbage collection.
 * Immediately after line 9, only one grasshopper object is eligible for garbage collection.
 * Immediately after line 10, only one grasshopper object is eligible for garbage collection.
 * Immediately after line 11, only one grasshopper object is eligible for garbage collection.
 * The code compiles.
 * The code does not compile.
 */
public class Grasshopper {
    public Grasshopper(String n) {
        name = n;
    }
    public static void main(String[] args) {
        Grasshopper one = new Grasshopper("g1");
        Grasshopper two = new Grasshopper("g2");
        one = two;
        one = new Grasshopper("g1");
        two = new Grasshopper("g2"); //The code compiles.
    }
    private String name;
}
