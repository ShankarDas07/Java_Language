package two_D_array;

import java.util.ArrayList;
import java.util.Collections;

public class reverse_ArrayList {
    static void reverse(ArrayList<Integer> das){
        int i=0, j= das.size() -1;
        while (i<j){
            /*  int temp = a;
                a = b;
                b = temp;   */
            Integer temp = Integer.valueOf(das.get(i));
            das.set(i, das.get(j)); // accessing anything by get method
            das.set(j, temp); // put anything by set method
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> das=new ArrayList<>();
        das.add(115);
        das.add(105);
        das.add(15);
        das.add(1);
        das.add(2);
        das.add(2510);
        System.out.println("Original List :- "+das);

        Collections.reverse(das); //in build method
        System.out.println("using in build method :- "+das);

        reverse(das);
        System.out.println("Reverse of Reverse List (Original) :- "+das);

        Collections.sort(das);
        System.out.println("Ascending order shorted :- "+das);

        Collections.sort(das, Collections.reverseOrder());
        System.out.println("Descending order :- "+das);

    }
}
