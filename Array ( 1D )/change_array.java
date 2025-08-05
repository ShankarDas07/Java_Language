package one_D_array;

public class change_array {
    static void changeArray(int [] arr){
        for (int i=0; i<arr.length; i++){
            arr[i]=0;
    }
}
    public static void main(String[] args) {
       int [] arr=new int[5];
      arr[0]=5 ;
      arr[1]= 10;
      arr[2]= 15;
      arr[3]= 20;
      arr[4]=25 ;
      System.out.println(arr[4]);
      changeArray(arr);
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(arr[4]);
    }
}
