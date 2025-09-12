package binary_search;

public class find_peak_ele {
    static int findPeak(int []arr){
        int st=0;   int end= arr.length-1;
        while (st<=end){
            int mid=st+(end-st)/2;

            //arr[mid] is the peak element
            if ((mid==0 || arr[mid] > arr[mid-1]) && (mid== arr.length-1 || arr[mid] >arr[mid+1])){
                return arr[mid];
            }
            if (arr[mid] < arr[mid+1]){  //ascending slope
                st=mid+1;
            }
            else{   //Descending slope
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr= {2,4,6,85,89,2,1,4};
        int x=findPeak(arr);
        System.out.println("The peak index is : "+x);
    }
}
