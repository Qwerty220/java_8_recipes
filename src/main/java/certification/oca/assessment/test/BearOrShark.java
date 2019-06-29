package certification.oca.assessment.test;

/**
 * 13. What is the output of the following program?
 *
 * Bear
 * Shark
 * BearShark
 * The code will not compile because of line 4.
 * The code will not compile because of line 6.
 * The code compiles without issue but does not produce any output.
 */
public class BearOrShark {
    public static void main(String[] args) {
        int luck = 10;
        if ((luck > 10 ? luck++ : --luck) < 10) {
            System.out.print("Bear");
        }
        if (luck<10) System.out.print("Shark"); //BearShark
    }
}
