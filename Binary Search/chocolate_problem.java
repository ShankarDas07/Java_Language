package binary_search;

public class chocolate_problem {
                                        // mid = maxChocolateAllowed
    static boolean isDivisionPossible(int maxChocolateAllowed, int [] arr, int stu){
        int NumOfstudent = 1;
        int choco = 0;  // No of choco current student have
        for (int i=0; i< arr.length; i++){
            if (arr[i] > maxChocolateAllowed ) return false;

            if (choco + arr[i] <= maxChocolateAllowed ){
                choco += arr[i];
            }else{
                NumOfstudent++;  // student increase
                choco = arr[i];  // new student choco assign , which is the current element of array.
            }
        }
        // return NumOfstudent <= stu;   //BOTH RETURN STATEMENT IS CORRECT

        if (NumOfstudent > stu) return false;
        return true;
    }

    static int distributeChocolates(int []arr, int stu){
        if (arr.length < stu) return -1;
        int ans=0;  int st=1;   int end=(int)1e9;
        while (st <= end){
            int mid= st+(end-st)/2;

            if (isDivisionPossible(mid, arr, stu)){
                ans= mid;
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }return ans;
    }

    public static void main(String[] args) {
        int [] arr= {5,3,1,4,2};
        int stu=3;
        System.out.println("The Minimum possible chocolate distribution is : "+distributeChocolates(arr,stu));
    }
}
