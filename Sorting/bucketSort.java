package shorting;

import java.util.ArrayList;
import java.util.List;

public class bucketSort {

    // Insertion sort function to sort individual buckets
    static void insertionSort(List<Float> bucket) {
        for (int i = 1; i < bucket.size(); i++) {
            float key = bucket.get(i);
            int j = i - 1;
            while (j >= 0 && bucket.get(j) > key) {
                bucket.set(j + 1, bucket.get(j));
                j--;
            }
            bucket.set(j + 1, key);
        }
    }

    static void bucketsort(float []arr){
        int n= arr.length;
        ArrayList<Float>[] buckets=new ArrayList[n];
        //create empty Buckets
        for (int i = 0; i <n ; i++) {
            buckets[i]=new ArrayList<Float>();
        }
        //Add element into our bucket
        for (int i=0; i<n; i++){
            int bucketIndex=(int) arr[i] * n; //all element are float then we can transfer all element in int using (int)
            buckets[bucketIndex].add(arr[i]);
        }
        //Sort each Buckets individually
        for (int i=0; i<buckets.length; i++){
            //Collections.sort(buckets[i]); // inbuilt function car_use
            insertionSort(buckets[i]);      // without inbuilt function car_use
        }

        //Marge all buckets to get the final Sorted array
        int index=0;
        for (int i=0; i<buckets.length; i++){
            ArrayList<Float> currentBucket=buckets[i];
            for (int j=0; j<currentBucket.size(); j ++){
                arr[index++]=currentBucket.get(j);
            }
        }

    }

    public static void main(String[] args) {
        float [] arr={0.5f, 0.4f, 0.3f, 0.2f, 0.1f, 0.11f};
        bucketsort(arr);
        for (float val:arr){
            System.out.print(val+" ");
        }
    }
}

        //GFG CODE
//import java.util.ArrayList;
//import java.util.List;
//
//public class bucketSort {
//    // Insertion sort function to sort individual buckets
//    public static void insertionSort(List<Float> bucket) {
//        for (int i = 1; i < bucket.size(); ++i) {
//            float key = bucket.get(i);
//            int j = i - 1;
//            while (j >= 0 && bucket.get(j) > key) {
//                bucket.set(j + 1, bucket.get(j));
//                j--;
//            }
//            bucket.set(j + 1, key);
//        }
//    }
//
//    // Function to sort arr[] of size n using bucket sort
//    public static void bucketSort(float[] arr) {
//        int n = arr.length;
//
//        // Create n empty buckets
//        List<Float>[] buckets = new ArrayList[n];
//        for (int i = 0; i < n; i++) {
//            buckets[i] = new ArrayList<>();
//        }
//
//        // Put array elements in different buckets
//        for (int i = 0; i < n; i++) {
//            int bi = (int) (n * arr[i]);
//            buckets[bi].add(arr[i]);
//        }
//
//        // Sort individual buckets using insertion sort
//        for (int i = 0; i < n; i++) {
//            insertionSort(buckets[i]);
//        }
//
//        // Concatenate all buckets into arr[]
//        int index = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < buckets[i].size(); j++) {
//                arr[index++] = buckets[i].get(j);
//            }
//        }
//    }
//
//    // Driver program to test above function
//    public static void main(String[] args) {
//        float[] arr = {0.897f, 0.565f, 0.656f, 0.1234f, 0.665f, 0.3434f};
//        bucketSort(arr);
//
//        System.out.println("Sorted array is:");
//        for (float num : arr) {
//            System.out.print(num + " ");
//        }
//    }
//}