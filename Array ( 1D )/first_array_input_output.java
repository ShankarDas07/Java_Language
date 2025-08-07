package one_D_array;

class array{
    int [] age={22,21,21,};
    String [] name={"Shankar","suman","Gour"};
    int [] DOB={2002,2003,2003};

}
public class first_array_input_output {
    public static void main(String[] args) {
        array obj=new array();
        System.out.println("Name : "+obj.name[0]);
        System.out.println("Age : "+obj.age[0]);
        System.out.println("DOB : "+obj.DOB[0]);
    }
}