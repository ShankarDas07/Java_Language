package one_D_array;

public class array_element_same_count {
    public static void main(String[] args) {
        int [] arr={11,1,19,21,11,55,11};
        int x=11;
        int count=0;
        for(int i=0; i< arr.length;i++){
            if (x==arr[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}