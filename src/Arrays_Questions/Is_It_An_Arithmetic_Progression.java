package Arrays_Questions;

/* Given an integer array A of size N. Return 1 if the array can be arranged to form an arithmetic progression, otherwise return 0.
A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.*/

import java.util.Arrays;
import java.util.Scanner;

public class Is_It_An_Arithmetic_Progression {
    public int solve(int[] A) {
        int ans = 1;                    //Assuming that the array is an AP
        Arrays.sort(A);                //Sorting the array
        for(int i=2;i<A.length;i++){        //Checking if the difference between the elements is same
            if(A[i]-A[i-1]!=A[i-1]-A[i-2]){     //If not, then the array is not an AP
                ans = 0;            //Hence, ans = 0
            }
        }
        return ans;            //Returning the answer
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();         //User inputs the size of the array
        int[] A = new int[size];         //Array object is created
        for(int i=0;i<size;i++){         //User inputs the elements of the array
            A[i]=sc.nextInt();
        }
        Is_It_An_Arithmetic_Progression obj = new Is_It_An_Arithmetic_Progression();   //Object of the class is created
        System.out.println(obj.solve(A));       //Calling the function and printing the result
    }
}
