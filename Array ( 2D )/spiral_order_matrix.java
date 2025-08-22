package two_D_array;

import java.util.Scanner;
public class spiral_order_matrix {
    static void printArray(int [][]arr){
        for (int i=0; i< arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
    static void spiralMatrix(int [][] arr, int r,int c){
        int toprow=0, downrow=r-1, leftcolumn=0, rightcolumn=c-1;
        int totalElement=0;
        while (totalElement<r*c){
                      //i=ROW ;   j=COLUMN ;
            //Top Row--> 1st column to Last column
            for (int j=leftcolumn; j<=rightcolumn && totalElement<r*c; j++){
                System.out.print(arr[toprow][j] + " ");
                totalElement++;
            }
            toprow++; //1st row 1ti dhap nicha chola alam 2 no row ta

            //Right Column--> 1st Row to Last Row
            for (int i=toprow; i<=downrow && totalElement<r*c; i++){
                System.out.print(arr[i][rightcolumn] + " ");
                totalElement++;
            }
            rightcolumn--; // lastcolumn thala 1 ti dhap vetor a chola alam

            //Down Row--> Last column to 1st column
            for (int j=rightcolumn; j>=leftcolumn && totalElement<r*c; j--){
                System.out.print(arr[downrow][j] + " ");
                totalElement++;
            }
            downrow--; //down row 1ti dhap upor row ta utlam

            //Left column--> Last row to 1st Row
            for (int i=downrow; i>=toprow && totalElement<r*c; i--){
                System.out.print(arr[i][leftcolumn] + " ");
                totalElement++;
            }
            leftcolumn++; //1st column thaka akti dhap vator dhuklam0
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of raw : ");
        int r= sc.nextInt();
        System.out.print("Enter the number of Column : ");
        int c= sc.nextInt();
        int [][] arr=new int[r][c];
        System.out.println("Enter the Raw & Column in the matrix 1 : ");
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                arr [i] [j]= sc.nextInt();
            }
        }
        System.out.print("the Spiral number is : ");
        spiralMatrix(arr,r,c);
    }
}
