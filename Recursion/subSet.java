package recursion;

public class subSet {
    static void set(int []arr, int l, int idx, int sum){
        if (idx>= arr.length){
            System.out.println(sum);
            return;
        }
        set(arr,l,idx+1, sum+arr[idx]);
        set(arr,l,idx+1, sum);
    }
    public static void main(String[] args) {
        int [] arr={2,4,5};
        set(arr, arr.length, 0, 0);
    }
}
