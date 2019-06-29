package certification.oca.assessment.test;

/**
 * What is the output of the following program?
 *
 * 10
 * 12
 * 13
 * 17
 * The code will not compile because of line 4.
 * The code will not compile because of line 6
 */
public class FeedingSchedule11 {
    public static void main(String[] args) {
        int x = 5, j = 0;
        OUTER: for(int i=0; i<3; )
            INNER: do {
                i++; x++;
                if(x > 10) break INNER;
                x += 4;
                j++;
        } while(j <= 2);
        System.out.println(x);
    }
}
// i 0 1    2   3
// x 5 6+4  11  12
// j 0 1    1
