package certification.oca.assessment.test;

/**
 * What is the result of the following code?
 *
 * A. true is printed out exactly once.
 * B. true is printed out exactly twice.
 * C. true is printed out exactly three times.
 * D. true is printed out exactly four times.
 * E. The code does not compile.
 */
public class Test02 {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ja").append("va");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(sb1.toString() == s1);
        System.out.println(sb1.toString().equals(s1));
    }
}

/**
 * true
 * true
 * false
 * true
 */
