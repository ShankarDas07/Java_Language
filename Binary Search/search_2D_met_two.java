package binary_search;

public class search_2D_met_two {
    static boolean searchMetrix(int [][]arr, int ter){
        //Raw denote        //column denote
     int n= arr.length;    int m=arr[0].length;
     int i=0; int j=m-1;
     while (i < n && j >= 0){
         if (arr[i][j] == ter) return true;
         if (arr[i][j] > ter) j--;
         else {
             i++;
         }
     } return false;
    }

    public static void main(String[] args) {
        int [][] arr={ {2,4,6,8},  {5,6,7,20},  {7,11,13,25},  {12,14,17,30} };
        int ter=1;
        boolean x=searchMetrix(arr,ter);
        System.out.println("The "+ter+" no is present : "+x);
    }
}
