package IV_Data_Structures.A_Fundamental_DS.ii_Matrix.a_TwoDimensional_Arrays.Questions;

/*You are given a n x n 2D matrix A representing an image. Rotate the image by 90 degrees (clockwise).
You need to do this in place.
Note: If you end up using an additional array, you will only receive partial score.*/

import java.util.Scanner;

public class Rotate_Matrix {
    public void solve(int[][] A) {
        int row = A.length;
        for(int i=0; i<row; i++){       //Transpose of matrix, iterates over each element in the upper triangle of the matrix
            for(int j=i;j<row;j++){     //Swapping elements across the main diagonal, swaps the element at (i, j) with the element at (j, i).
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
        for(int i=0; i<row; i++){       //Reverse the matrix, reverses each row of the transposed matrix
            for(int j=0; j<row/2;j++){  //Swap the elements from the beginning to the middle with the elements from the end to the middle.
                int temp = A[i][j];
                A[i][j] = A[i][row-1-j];
                A[i][row-1-j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();         //row and column of the matrix
        int[][] A = new int[row][row];
        for(int i=0; i<row; i++){    //input matrix
            for(int j=0; j<row; j++){
                A[i][j] = sc.nextInt();
            }
        }
        Rotate_Matrix obj = new Rotate_Matrix();        //object of class Rotate_Matrix
        obj.solve(A);                            //calling solve method
        for(int i=0; i<row; i++){       //printing the matrix
            for(int j=0; j<row; j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
}
