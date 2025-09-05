package shorting;

import java.util.Scanner;
public class margeSorting {
    static void display(int [] arr){
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void marge(int []arr, int l, int mid, int r){
        int n1 = mid-l + 1;
        int n2 = r - mid;

        // Create temporary arrays
        int [] left =new int [n1];
        int [] right=new int[n2];

        // Copy data to temporary arrays

        for (int i=0; i < n1; i++) left [i] = arr[l + i];
        for (int j=0; j < n2; j++) right[j] = arr[mid + 1 + j];

        // Merge the temporary arrays
        int i=0, j=0, k=l;
        while (i < n1 && j < n2){
            if (left[i] <= right[j]){
                arr[k++] = left[i++];   //
                //i++;
            }else{
                arr[k++] = right[j++];
                //j++; 
            }
            //k++;
        }


        while (i < n1){
          arr[k] = left[i];
          i++;
          k++;
        }
        while (j < n2){
            arr[k] = right[j];
            j++;
            k++;
        }
    }


    static void margeSort(int []arr,int l, int r){
        if (l>=r) return;

        int mid=(l+r)/2;
        margeSort(arr, l, mid);
        margeSort(arr, mid+1, r);
        marge(arr, l, mid, r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("how many element in the arrar : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array element : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //int no= arr.length;
        margeSort(arr,0, arr.length-1);
        System.out.print("The marge sort is : ");
        display(arr);
    }
}
