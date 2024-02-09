package Arrays_Questions.OneD;

/*You are given a constant array A.
You are required to return another array which is the reversed form of the input array.*/

import java.util.Scanner;
public class Reverse_Array {
    public int[] solve(final int[] A) {
        int n = A.length;                   //Get the length of the array
        int[] B = new int[n];           //Create a new array of same size as A

        for(int i=0; i<n; i++){         //Reverse the array
            B[i] = A[n-1-i];
        }

        return B;            //Return the reversed array
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();           //Set the size of the array
        int[] A = new int[n];           //Create an array of size n
        for (int i=0; i<n; i++){        //Input the array elements
            A[i] = sc.nextInt();
        }
        Reverse_Array obj = new Reverse_Array();    // Create an object of Reverse_Array class

        int[] result = obj.solve(A);            // Call the solve method to reverse the array

        for (int i = 0; i < n; i++) {           //Print the result
            System.out.print(result[i] + " ");
        }
    }
}
