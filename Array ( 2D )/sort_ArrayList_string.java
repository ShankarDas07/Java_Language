package two_D_array;

import java.util.ArrayList;
import java.util.Collections;

public class sort_ArrayList_string {
    public static void main(String[] args) {
            ArrayList<String> das=new ArrayList<>();
            das.add("shankar");
            das.add("abhik");
            das.add("suman");
            das.add("gour");
            das.add("Gour"); //Ascending order 1st because 1st letter is capital
            das.add("saptaporni");
            das.add("surajit");
            System.out.println("Original List :- "+das);

            Collections.sort(das);
            System.out.println("Ascending order shorted :- "+das);

            Collections.sort(das, Collections.reverseOrder());
            System.out.println("Descending order :- "+das);
    }
}
