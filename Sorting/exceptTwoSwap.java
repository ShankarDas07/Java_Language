package shorting;

public class exceptTwoSwap {
    static void twoSwap(int []arr){
        int x=-1;
        int y=-1;

        //handling corner cases when the array is 1 no swap happen
        if (arr.length<=1){
            return;
        }
        for (int i=1; i< arr.length; i++){
            if(arr[i]<arr[i-1]){
                if (x==-1){
                    x=i-1;
                    y=i;       //arr = [1, 3, 2, 4, 5]
                               //At i = 2, arr[1] = 3 > arr[2] = 2, so x = 1, but y is never updated because there is no second inversion.
                               //If we attempt a swap with y = -1, we get an index error or incorrect behavior
                }
                else
                    y=i;
            }
        }
        //Swap X & Y
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public static void main(String[] args) {
        int [] arr={3, 8, 6, 7, 5, 9, 10 };
        twoSwap(arr);
        for (int val: arr){
            System.out.print(val+" ");
        }
    }
}
