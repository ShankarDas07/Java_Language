package one_D_array;

public class max_value_array {
    public static void main(String[] args) {
        int [] arr={2,55,25,22,98,101};
        int max=0;
        for (int i=0; i< arr.length ; i++)
            if(arr[i] > max){
                max=arr[i];
            }

        System.out.println(max);
    }
}
