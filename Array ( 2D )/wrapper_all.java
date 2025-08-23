package two_D_array;

import java.util.ArrayList;

public class wrapper_all {
    public static void main(String[] args) {
             //wrapper Class
        Integer a=Integer.valueOf(4);
        System.out.println(a);  //print 4
        Float b=Float.valueOf(3);
        System.out.println(b);

                //Array List create
        ArrayList <Integer> sha =new ArrayList<>();

                //Add new elements
        sha.add(6);    //add is a method
        sha.add(10);
        sha.add(12);
        sha.add(20);
        sha.add(25);

                //Get an element at index i
        System.out.print(sha.get(0)+" "); //print 6
        System.out.println(sha.get(2));  //print 12

                //Print with for loop
        for (int i=0;i<sha.size(); i++){    //size is the method this is () is applying.
            System.out.print(sha.get(i)+" "); //print :- 6 10 12 20 25
        }

            //Print the array list Directly
        System.out.println(); //print extra line
        System.out.println(sha); //print :- [ 6 10 12 20 25 ]

            //Adding element of any indexing
        sha.add(2,105);
        System.out.println(sha); //print:- [6, 10, 105, 12, 20, 25]

            //Modify element at any index
        sha.set(3,500);  //12 has been changed by 500
        System.out.println(sha);

            //Removing element at any index
        sha.remove(1); //remove 1 indexed valur
        System.out.println(sha);  // print:- [6, 105, 500, 12, 20, 25]

            //Removing any element
        sha.remove(Integer.valueOf(20)); //20 value is delete
        System.out.println(sha);  // print:- [6, 105, 500, 25]

            //Method print
        System.out.println(sha.remove(Integer.valueOf(500)));  //output:- True or False
        System.out.println(sha);// print:- [6, 105, 25]

        //Checking if a element exists or not
        boolean ans=sha.contains(Integer.valueOf(105));
        System.out.println(ans); //105 is exists in the list then output became True

        //if you don't specify any class, you can put anything inside
        ArrayList das=new ArrayList();
        das.add("Shankar");
        das.add(1500);
        das.add("a");
        das.add(true);
        das.add(30.8554);
        System.out.println("das ArrayList print :- "+das);
    }
}
