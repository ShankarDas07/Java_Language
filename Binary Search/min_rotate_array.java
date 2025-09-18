package binary_search;

public class min_rotate_array {
    static int findMin(int []arr){
        int st=0;
        int end= arr.length-1;
        int min=-1;
        while (st<=end){
            int mid=st+(end-st)/2;

            if (arr[mid]<arr[end]){
                min=mid;
                end=mid-1;
            }
            else{
                st=mid+1;
                min=mid;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int [] arr={ 5, 6, 7, 8, 9, 10, 11, 12, 13,14, 15, 1};
        int x=findMin(arr);
        System.out.println(x);
    }
}
