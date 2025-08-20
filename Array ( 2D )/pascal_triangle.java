package two_D_array;

import java.util.Scanner;
public class pascal_triangle {

    static void printArray(int [][]arr){
        for (int i=0; i< arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }

    static int [][] pascalTriangle(int n) {
        int [][] ans=new int[n][];
        for (int i = 0; i < n; i++) {
            ans[i]=new int[i+1];  //i th row has i+1 columns
            /* ans[0] = new int[1] [ 0th row column size (0+1= 1) ]
            ans[1] = new int [2]   [ 1 th row column size (1+1= 2) ]  */
            ans[i][0]=ans[i][i] = 1;   //in every 1st row & last column=1
            for (int j=1; j<i; j++){
                ans[i][j]=ans[i-1][j] + ans[i-1] [j-1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no : ");
        int n= sc.nextInt();
        int [][] ans=pascalTriangle(n);
        System.out.println("Pascal Triangle is : ");
        printArray(ans);

    }
}
