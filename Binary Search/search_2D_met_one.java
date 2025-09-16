package binary_search;

public class search_2D_met_one {
    static boolean searchMetrix(int [][]arr, int ter){
        //raw denote        //column denote
       int n=arr.length;    int m=arr[0].length;
       int st=0; int end=n*m-1;
       while (st<=end){
           int mid=st+(end-st)/2;
           int midEle=arr[mid/m][mid%m];
           if(ter==midEle) return true;
           if(ter < midEle){
               end=mid-1;
           }else{
               st=mid+1;
           }
       }return false;
    }
    public static void main(String[] args) {
        int [][] arr={ {2,4,6,8},  {5,6,7,20},  {7,11,13,25},  {12,14,17,30} };
        int ter=1;
        boolean x=searchMetrix(arr,ter);
        System.out.println("The "+ter+" no is present : "+x);
    }
}
