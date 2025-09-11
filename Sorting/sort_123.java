package shorting;

public class sort_123 {
    static void sort2Passes(int [] arr){
        int count_0=0; int count_1=0; int count_2=0;
        for (int i=0; i< arr.length; i++){ // 1st passes
            if (arr[i]==0){
                count_0++;
            } else if(arr[i]==1) {
                count_1++;
            }else
                count_2++;
        }
        int k=0;
        while (count_0>0){ // 2nd passes
            arr[k++]=0;
            count_0--;
        }
        while (count_1>0){
            arr[k++]=1;
            count_1--;
        }
        while (count_2>0){
            arr[k++]=2;
            count_2--;
        }
    }

    // only 1st passes OPTIMISE CODE
            //Swap
    static void swap(int []arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static void sort(int [] arr){
        int low=0; int mid=0; int high= arr.length-1;

        //Traverse the array
        while (mid<=high){
            if (arr[mid]==0){
                swap(arr,mid,low);
                mid++;
                low++;
            } else if(arr[mid]==1){
                mid++;
            }
            else if(arr[mid]==2){
                swap(arr,mid,high);
                high--;
            }
        }
    }



    public static void main(String[] args) {
        int [] arr={0, 2, 1, 2, 0, 2, 1, 0};
        //sort2Passes(arr);
        sort(arr);

        for (int val: arr){
            System.out.print(val+" ");
        }
    }
}
