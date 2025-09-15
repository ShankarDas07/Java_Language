package binary_search;

public class rotate_array_find_target_include_duplicate {
    static int fndTarget(int [] arr,int tar){
        int st=0; int end=arr.length-1;

        while (st <= end){
            int mid= st+(end-st)/2;

            if (arr[mid]==tar) return mid;

            else if (arr[st]==arr[mid] && arr[mid]==arr[end]) {
                st++;
                end--;
            }
            else if (arr[mid] <= arr[end]){ //MID to END is sorted
                if (tar > arr[mid] && tar <= arr[end]){
                    st = mid+1;
                }else {
                    end = mid - 1;
                }
            }

            else{ //START to MID sorted
                if (arr[st] < tar && arr[mid] >= tar){
                    end=mid-1;
                }else{
                    st=mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1, 1, 1, 2, 2, 3, 3, 4, 5, 6, 7};  //out of 2 element is 3 (2s 1st index)
        int tar=2;
        int x=fndTarget(arr,tar);
        if (x!=-1){
            System.out.print("The element " + tar + " is present at index : " + x);
        }else
            System.out.println("The element " + tar + " is not present in the array ");
    }
}
