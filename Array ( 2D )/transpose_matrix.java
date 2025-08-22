package two_D_array;

import java.util.Scanner;
public class transpose_matrix {
    static void printArray(int [][]arr){
        for (int i=0; i< arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
//    static int[][] transpose(int [] [] arr, int r, int c) {
//        int[][] trance = new int[c][r];
//        for (int i = 0; i < c; i++) {
//            for (int j = 0; j < r; j++) {
//                trance[i][j] = arr[j][i];
//            }
//        }
//        return trance;
//    }

    //WITHOUT CREATING ANY ARRAY (IT'S ALSO USE IN SQURE(ROW==COLUMN same) MATRIX.
    static void transpose(int [] [] matrix, int r, int c) {
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                int temp=matrix[i][j];        //temp=a;  (a==matrix[i][j])
                matrix[i][j]=matrix[j][i];   //a=b;       (b==matrix[j][i])
                matrix[j][i]=temp;          //b=temp;
            }
        }
    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of raw : ");
        int r = sc.nextInt();
        System.out.print("Enter the number of Column : ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter the Raw & Column in the matrix : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Transpose matrix is : ");
        transpose(arr,r,c);
        printArray(arr);
    }
}
