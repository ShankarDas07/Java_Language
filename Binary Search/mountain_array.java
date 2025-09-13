package binary_search;

public class mountain_array {
    static int findPeak(int []arr){
        int st= 0;  int end= arr.length-1;
        int ans=-1;
        while (st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]<arr[mid+1]){
                ans=mid+1;
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] arr= {2,4,6,85,1,2,3,4};
        int x=findPeak(arr);
        System.out.println("The peak index is : "+x);
    }
}

