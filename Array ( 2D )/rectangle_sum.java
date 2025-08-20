package two_D_array;

import java.util.Scanner;
public class rectangle_sum {
        // Type 2 :- It is not optimal code
    static int prefixSum(int [][]matrix,int r1, int r2, int c1, int c2){
        int sum=0;
        for (int i=r1; i<=r2; i++){
            for(int j=c1; j<=c2; j++){
                sum=sum+matrix[i][j];
            }
        }
        return sum;
    }
              //Type 3 :-optimal code
//    static void findPrefixSum(int[][] matrix) {
//        int r = matrix.length;
//        int c = matrix[0].length;
//        for (int i = 0; i < r; i++) {
//            for (int j = 1; j < c; j++) {
//                matrix[i][j] += matrix[i][j - 1];
//            }
//        }
//    }
//    static int findPrefixSumMatrix(int[][] matrix, int r1, int r2, int c1, int c2) {
//        int sum = 0;
//        findPrefixSum(matrix);
//        for (int i = r1; i <= r2; i++) {
//            // c1 to c2 for row i iteration
//            if (c1 >= 1)
//                sum += matrix[i][c2] - matrix[i][c1 - 1];
//            else
//                sum += matrix[i][c2];
//        }
//        return sum;
//    }
    //Type 1 :-very optimal code
//        static void findPrefixSum(int[][] matrix) {
//        int r = matrix.length;
//        int c = matrix[0].length;
//            //traverse horizontally to calculate row-wise prefix sum
//        for (int i = 0; i < r; i++) {
//            for (int j = 1; j < c; j++) {
//                matrix[i][j] += matrix[i][j - 1];
//            }
//        }
//            //traverse vertically to calculate column-wise prefix
//        for (int j=0; j<c; j++){    // (row wise + column wise ) prefix sum
//            for (int i=1; i<r; i++) {
//                matrix[i][j]+=matrix[i-1][j];
//            }
//        }
//    }
//    static int findPrefixSumMatrix(int[][] matrix, int r1, int r2, int c1, int c2) {
//        int ans=0, sum=0, up=0, left=0, leftUp=0;
//        findPrefixSum(matrix);
//        sum = matrix[r2][c2];
//        if(c1 >= 1)     //indentation car_use like python
//            left = matrix[r2][c1 - 1];
//        if(r1 >= 1)
//            up = matrix[r1 - 1][c2];
//        if(r1 >=1 && c1 >= 1)
//            leftUp = matrix[r1-1][c1-1];
//        ans = sum - up - left + leftUp;
//        return ans;
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row : ");
        int r = sc.nextInt();
        System.out.print("Enter the column : ");
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println("Enter " + r * c + " Values : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Rectangle boundaries ");
        System.out.print("row1 : ");
        int r1 = sc.nextInt();
        System.out.print("row2 : ");
        int r2 = sc.nextInt();
        System.out.print("column1 : ");
        int c1 = sc.nextInt();
        System.out.print("column2 : ");
        int c2 = sc.nextInt();

                    //Type:-1
//        int z=findPrefixSumMatrix(matrix, r1, r2, c1, c2);
//        System.out.print("The rectangle sum is : "+z);
//    }
//}
                    // Type 2:-
      int x= prefixSum(matrix, r1,  r2,  c1,  c2);
      System.out.println("The rectangle sum is : "+x);
    }
}
                    //Type 3:-
//        int y = findPrefixSumMatrix(matrix, r1, r2, c1, c2);
//        System.out.print("The rectangle sum is : "+y);
//    }
//}




