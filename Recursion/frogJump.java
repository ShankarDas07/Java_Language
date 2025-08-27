package recursion;

public class frogJump {
    static int best(int [] arr,int n, int idx){
        if (idx==n-1) return 0;
        int op1 = Math.abs(arr[idx] - arr[idx+1]) + best(arr, n,  idx+1);
        if(idx == n-2) return op1;
        int op2 = Math.abs(arr[idx] - arr[idx+2]) + best(arr, n,  idx+2);
        return Math.min(op1,op2);
    }
    public static void main(String[] args) {
        int [] arr={10,30,40,20};
        System.out.println(best(arr, arr.length, 0));
    }
}
