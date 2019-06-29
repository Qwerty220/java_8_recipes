package certification.oca.assessment.test;

/**
 * What is the output of the following code snippet?
 */
public class Test05 {
    public static void main(String[] args) {
        System.out.print("a");
        try {
            System.out.print("b");
            throw new IllegalArgumentException(); //class IllegalArgumentException extends RuntimeException {
        } catch (RuntimeException e) {
            System.out.print("c");
        } finally {
            System.out.print("d");
        }
    System.out.print("e");
    }
}
//    A. abe
//    B. abce
//    C. abde
//  *  D. abcde
//    E. F.
//    The code does not compile.
//    An uncaught exception is thrown
