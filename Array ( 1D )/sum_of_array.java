package one_D_array;

public class sum_of_array {
    public static void main(String[] args) {
        int [] arr={1,7,8,2,3};
        int sum=0;
        for(int i=0; i <  arr.length; i++){
            sum=sum+arr[i];
        }
        System.out.println("The Array sum is : "+sum);
    }
}
