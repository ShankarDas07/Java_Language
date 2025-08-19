package two_D_array;

import java.util.Scanner;
public class Matrix_sum {

    static void printArray(int [][] matrix){
        for (int i=0; i< matrix.length; i++){    //row count korba
            for (int j=0; j<matrix[i].length; j++){  //column count korba
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void sum(int [][] arr1, int r1, int c1, int [][] arr2, int r2, int c2){
        if (r1 !=r2 || c1 !=c2){
            System.out.print("Wrong input ");
            return;
        }
        int [][] add=new int[r1][c1];
        for (int i=0; i<r1; i++){    //row traverse
            for (int j=0; j<c1; j++){  //column traverse
                add[i][j]= arr1[i][j] + arr2[i][j];
            }
        }
        printArray(add);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Row : ");
        int r1= sc.nextInt();
        System.out.print("Enter the Column : ");
        int c1= sc.nextInt();
        int [][]arr1=new int[r1][c1];
        System.out.println("Enter the Row & Column in the matrix1 : ");
        for (int i=0; i<r1; i++){    //row count korba
            for (int j=0; j<c1; j++){  //column count korba
                arr1[i][j]= sc.nextInt();
            }
        }
        System.out.print("Enter the Row : ");
        int r2= sc.nextInt();
        System.out.print("Enter the Column : ");
        int c2= sc.nextInt();
        int [][]arr2=new int[r2][c2];
        System.out.println("Enter the Row & Column in the matrix2 : ");
        for (int i=0; i<r2; i++){    //row count korba
            for (int j=0; j<c2; j++){  //column count korba
                arr2[i][j]= sc.nextInt();
            }
        }
        System.out.println("Matrix 1");
        printArray(arr1);
        System.out.println("Matrix 2");
        printArray(arr2);

        System.out.println("Sum of two Matrix is : ");
        sum(arr1, r1, c1, arr2, r2, c2);
    }
}
