package certification.oca.assessment.test;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;

/**
 * 18. Which of the following print out a date representing April 1, 2015? (Choose all that apply)
 */
public class Test18 {
    public static void main(String[] args) {
        //final static int APRIL = 3;
        System.out.println(LocalDate.of(2015, Calendar.APRIL, 1)); //2015-03-01

        //The singleton instance for the month of April with 30 days.
        // This has the numeric value of {@code 4}.
        System.out.println(LocalDate.of(2015, Month.APRIL, 1)); //2015-04-01

        System.out.println(LocalDate.of(2015, 3, 1)); //2015-03-01
        System.out.println(LocalDate.of(2015, 4, 1)); //2015-04-01

//        Error:(16, 28) java: LocalDate(int,int,int) has private access in java.time.LocalDate
//        System.out.println(new LocalDate(2015, 3, 1));

//        Error:(16, 28) java: LocalDate(int,int,int) has private access in java.time.LocalDate
//        System.out.println(new LocalDate(2015, 4, 1));
    }
}
