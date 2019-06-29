package certification.oca.assessment.test;

/**
 * 1. What is the result of the following class? (Choose all that apply)
 *
 * Compiler error on line 1.
 * Compiler error on line 2.
 * Compiler error on line 4.
 * Compiler error on line 5.
 * Compiler error on line 6.
 * 0null
 * nullnull
 *
 * E. Option E is correct because local variables require assignment before referencing them.
 * Option D is incorrect because class and instance variables have default values and allow referencing.
 * a_b defaults to a null value.
 * Options A, B, and C are incorrect because identifiers may begin with a letter, underscore, or dollar sign.
 * Options F and G are incorrect because the code does not compile.
 * If a_b was an instance variable, the code would compile and output 0null.
 * For more information, see Chapter 1.
 *
 * */
public class _C {
    private static int $;
    public static void main(String[] main) {
        String a_b;
        System.out.print($);
//        System.out.print(a_b); //Error:(20, 26) java: variable a_b might not have been initialized
    }
}
