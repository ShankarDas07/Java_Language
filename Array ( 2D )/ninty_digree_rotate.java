package two_D_array;

import java.util.Scanner;
public class ninty_digree_rotate {
        static void printArray(int [][]arr){
            for (int i=0; i< arr.length; i++){
                for (int j=0; j<arr[i].length; j++){
                    System.out.print(arr[i][j]+"  ");
                }
                System.out.println();
            }
        }
        //WITHOUT CREATING ANY ARRAY (IT'S ALSO USE IN SQURE MATRIX(ROW==COLUMN same).
        static void transpose(int [] [] matrix, int r, int c) {
            if(r!=c){
                System.out.println("Invalid Matrix");
            }
            for (int i = 0; i < c; i++) {
                for (int j = i; j < r; j++) {
                    int temp=matrix[i][j];        //temp=a;  (a==matrix[i][j])
                    matrix[i][j]=matrix[j][i];   //a=b;       (b==matrix[j][i])
                    matrix[j][i]=temp;          //b=temp;
                }
            }
        }
    static void rotate(int [] arr){
        int i=0; int j= arr.length-1;
        while (i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++; --j;
        }
    }
        static void realAns(int [][] arr,int n){
            transpose(arr,n,n);     //transpose matrix
            // reverse each row of transposed matrix
            /*  1, 2, 3
                4, 5, 6
                7, 8, 9
                i = 0
            reverseArray ( {1,2,3} )     */
            for (int i=0; i<n; i++){
                rotate(arr[i]);
            }
        }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter only Square matrix");
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
            System.out.println("90 degree rotate matrix is : ");
            realAns(arr,r);
            printArray(arr);
        }
}
