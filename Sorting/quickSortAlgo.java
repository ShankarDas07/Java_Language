package shorting;

public class quickSortAlgo {
    static void display(int [] arr){
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void swap (int [] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static int partition(int []arr,int start,int end){
        int pivot=arr[start];
        int count=0;
        for (int i=start+1;i<=end;i++){
            if (arr[i]<=pivot) count++;
        }
       int pivotIndex=start+count;
        swap(arr,start,pivotIndex);

        int i=start,j=end;
        while (i<pivotIndex && j>pivotIndex){
            while (arr[i]<=pivot) i++;
            while (arr[j]>=pivot) j--;
            if (i<pivotIndex && j>pivotIndex) {
                swap(arr,i, j);
                i++; j--;
            }
        }
        return pivotIndex;
    }

    static void quickShot(int []arr ,int start,int end){
        if(start>=end) return;
        int pi=partition(arr,start,end);
        quickShot(arr,start,pi-1);
        quickShot(arr,pi+1,end);
    }

    public static void main(String[] args) {
        int [] arr={7,13,8,5,10,2,4};
        System.out.print("Before Shorting : ");
        display(arr);

        quickShot(arr,0, arr.length-1);
        System.out.print("After Shorting : ");
        display(arr );


    }
}
