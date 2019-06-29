package certification.oca.assessment.test;

import java.util.ArrayList;
import java.util.List;

class Chicken {}

interface HenHouse {
    public java.util.List<Chicken> getChickens();
}

/**
 * 14. Assuming we have a valid, non-null HenHouse object whose value is initialized by the blank line shown here,
 * which of the following are possible outputs of this application?
 * (Choose all that apply)
 *
 * A. The code will not compile because of line 6.
 * B. The code will not compile because of lines 7–8.
 * C. The application will compile but not produce any output.
 * D. The application will output Cluck exactly once.
 * E. The application will output Cluck more than once.
 * F. The application will compile but produce an exception at runtime.
 */
public class ChickenSong {
    public static void main(String[] args) {
        HenHouse house = new HenHouse() {
            @Override
            public List<Chicken> getChickens() {
                final ArrayList<Chicken> list = new ArrayList<>();
                list.add(new Chicken());
                list.add(new Chicken());
                list.add(new Chicken());
                return list;
            }
        };
        Chicken chicken = house.getChickens().get(0);
        for(int i=0; i<house.getChickens().size(); chicken = house.getChickens().get(i++)) {
                System.out.println("Cluck");
        }
//        Cluck
//        Cluck
//        Cluck
    }
}
