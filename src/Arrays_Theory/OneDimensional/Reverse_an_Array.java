package Arrays_Theory.OneDimensional;

import java.util.Scanner;
public class Reverse_an_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();           //Set the size of the array
        int[] A = new int[n];           //Create an int array of size n
        for (int i=0; i<n; i++){        //Input the array elements
            A[i] = sc.nextInt();
        }

        int[] B = new int[n];           //Create a new array of same size as A
        for(int i=0; i<n; i++){         //Reverse the array
            B[i] = A[n-1-i];
        }

        for (int i = 0; i < n; i++) {           //Print the result
            System.out.print(B[i] + " ");
        }
    }
}
