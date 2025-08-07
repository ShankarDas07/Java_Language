package one_D_array;

public class find_position_array {
    public static void main(String[] args) {
        int [] arr={20,21,25,2,54,56};
        int x=56;
        int ans=-1;
        for(int i=0; i< arr.length;i++){
            if (x==arr[i]){
                ans=i;
                break; //if any element is multiple time present in the array then 1st will be the count & then break keyword is work
            }
        }
        if(ans==-1){
            System.out.println("the No is not present in the array ");
        }else{
            System.out.println("The No is : "+x+" the position of the array : "+ans);
        }

    }
}
