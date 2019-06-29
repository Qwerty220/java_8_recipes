package certification.oca.assessment.test;

import java.util.function.Predicate;

/**
 * Which of the following lines can be inserted at line 11 to print true? (Choose all that apply)
 * <p>
 * System.out.println(test(i -> i == 5));
 * System.out.println(test(i -> {i == 5;}));
 * System.out.println(test((i) -> i == 5));
 * System.out.println(test((int i) -> i == 5);
 * System.out.println(test((int i) -> {return i == 5;}));
 * System.out.println(test((i) -> {return i == 5;}));
 */
public class Test17 {
    public static void main(String[] args) {
        System.out.println(test(i -> i == 5)); //true

//        Error:(19, 15) java: not a statement
//        System.out.println(test(i -> {
//            i == 5;
//        }));

        System.out.println(test((i) -> i == 5)); //true

//        Error:(22, 51) java: ')' expected
//        System.out.println(test((int i) -> i == 5);

//        Error:(29, 33) java: incompatible types: incompatible parameter types in lambda expression
//        System.out.println(test((int i) -> {
//            return i == 5;
//        }));

        System.out.println(test((i) -> {
            return i == 5;
        })); //true
    }

    private static boolean test(Predicate<Integer> p) {
        return p.test(5);
    }
}
