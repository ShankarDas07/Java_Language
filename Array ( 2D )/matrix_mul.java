package two_D_array;

import java.util.Scanner;
public class matrix_mul {
    static void printArray(int [][]arr){
        for (int i=0; i< arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
    static void mulMatrix(int [][] arr1, int r1, int c1, int [][] arr2, int r2, int c2){
        if (c1!=r2){
            System.out.println("Wrong input : Multiplication not possible ");
        }
        int [][] mul=new int[r1][c2];
        for (int i=0; i<r1; i++){      // it is also row traverse
            for (int j=0; j<c2; j++){   // it is also column traverse
                // multiplecation
                for (int k=0; k<c1; k++){  //How many time are multiple in this case 4 time because
                                           //there are 1st matrix no of row=4 & 2nd matrix column=4
                                           //we put 1st matrix row or 2nd matrix column (both are same )
                        /*
                        i=1; j=0;
                        mul[i] [j]= i row of arr1, j column of arr2
                        */
                    mul[i][j]+= (arr1[i][k] * arr2[k][j]);
                }
            }
        }
        System.out.println("Multiplication of 2 matrices :");
        printArray(mul);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number of raw : ");
        int r1= sc.nextInt();
        System.out.print("Enter the number of Column : ");
        int c1= sc.nextInt();
        int [][] arr1=new int[r1][c1];
        System.out.println("Enter the Raw & Column in the matrix 1 : ");

        for (int i=0; i<r1; i++){
            for (int j=0; j<c1; j++){
                arr1 [i] [j]= sc.nextInt();
            }
        }
        System.out.print("Enter the number of raw : ");
        int r2= sc.nextInt();
        System.out.print("Enter the number of Column : ");
        int c2= sc.nextInt();
        int [][] arr2=new int[r2][c2];
        System.out.println("Enter the Raw & Column in the matrix 2 : ");

        for (int i=0; i<r2; i++){
            for (int j=0; j<c2; j++){
                arr2 [i][j]= sc.nextInt();
            }
        }
        mulMatrix(arr1, r1, c1, arr2, r2, c2);
    }
}