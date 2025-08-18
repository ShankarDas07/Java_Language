package two_D_array;

import java.util.Scanner;
public class generate_spiral_matrix {
    static void printArray(int [][]arr){
        for (int i=0; i< arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
    static int [][] generateSpiral(int n){
        int [][] arr=new int[n][n];
        int toprow=0, downrow=n-1, leftcolumn=0, rightcolumn=n-1;
        int count=1;
        while (count <= n*n){
            //i=ROW ;   j=COLUMN ;
            //Top Row--> 1st column to Last column
            for (int j=leftcolumn; j<=rightcolumn && count <= n*n; j++){
                arr[toprow][j]= count++;
            }
            toprow++; //1st row 1ti dhap nicha chola alam 2 no row ta

            //Right Column--> 1st Row to Last Row
            for (int i=toprow; i<=downrow && count <= n*n; i++){
                arr[i][rightcolumn] =count++;
            }
            rightcolumn--; // lastcolumn thala 1 ti dhap vetor a chola alam

            //Down Row--> Last column to 1st column
            for (int j=rightcolumn; j>=leftcolumn && count <= n*n; j--){
                arr[downrow][j] = count++;
            }
            downrow--; //down row 1ti dhap upor row ta utlam

            //Left column--> Last row to 1st Row
            for (int i=downrow; i>=toprow && count <= n*n; i--){
                arr[i][leftcolumn] =count++;
            }
            leftcolumn++; //1st column thaka akti dhap vator dhuklam0
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no : ");
        int n= sc.nextInt();
        int [][] ans=generateSpiral(n);
        printArray(ans);
    }
}
