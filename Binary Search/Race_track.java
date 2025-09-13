package binary_search;

public class Race_track {

    static boolean isPossible(int [] arr, int kid, int distance){ // mid == distance of two kids
        int kidPlaces=1;
        int lastKid = arr[0];
        for (int i=1; i< arr.length; i++){  // i start is 1 because we are set 1st kid in arr[0] position
           if (arr[i] - lastKid >= distance ) {  // this for loop Time Complex :- n
               kidPlaces++;
               lastKid = arr[i];
           }
        }
        return kidPlaces >= kid ;
    }

    static int raceTrack(int [] arr, int kid){
        if (kid > arr.length) return -1;
        int st=0;   int end= arr.length-1;  int ans=0;

        while (st <= end){        // Time Complex :- logN    TOTAL TIME = n * logN
            int mid=st+(end-st)/2;
            if (isPossible(arr, kid, mid)){
                ans = mid;
                st = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] arr= {1,2,4,8,9};
        int kid=3;
        System.out.println("The Minimum possible chocolate distribution is : "+raceTrack(arr,kid));
    }
}
