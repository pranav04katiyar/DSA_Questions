package Arrays_Questions;

/*You are given an integer array A. You have to find the second largest element/value in the array or report that no such element exists.*/

import java.util.Scanner;
import java.util.Arrays;

public class Second_Largest_Element {
    public int solve(int[] A) {
        Arrays.sort(A);
        int n = A.length;
        if(n == 1){ //edge case: if there is only one element
            return -1;
        }

        int large = A[n-1]; //largest element in sorted array
        int secLarge = A[n-2]; //assuming that this is the second largest


        for(int  i = n-3; i >= 0; i--){ //starting from n-3 to update element if the second large element is equal to large
            if(secLarge == large){
                secLarge = A[i];
            }
        }
        if(secLarge == large){ //edge case: if all elements are same in the array
            return -1;
        }

        return secLarge;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       //size of array
        int[] arr = new int[n];       //array declaration
        for(int i = 0; i < n; i++){   //taking input in array
            arr[i] = sc.nextInt();
        }

        Second_Largest_Element obj = new Second_Largest_Element();    //object of class Second_Largest_Element
        System.out.println(obj.solve(arr));              //calling solve() method
    }
}
