package IV_Data_Structures.A_Fundamental_DS.i_Arrays_and_Arraylists.a_OneDimensional_Arrays.Questions;

/*
Problem Title: Good Pair (URL: https://www.interviewbit.com/problems/good-pair/)

Problem Statement:
Given an array A and an integer B.
A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B). Check if any good pair exist or not.

Problem Constraints:
1 <= A.size() <= 104
1 <= A[i] <= 109
1 <= B <= 109

Input Format: First argument is an integer array A. Second argument is an integer B.

Output Format: Return 1 if good pair exist otherwise return 0.

Example Input:
Input 1: A = [1,2,3,4], B = 7
Input 2: A = [1,2,4], B = 4
Input 3: A = [1,2,2], B = 4

Example Output:
Output 1: 1
Output 2: 0
Output 3: 1

Example Explanation:
Explanation 1: (i,j) = (3,4)
Explanation 2: No pair has sum equal to 4.
Explanation 3: (i,j) = (2,3)
*/

/*
Logic:
Brute Force:
Traverse the array with 2 loops, nested, one to find the first element and second to find if the sum with the other element equal to B.
If yes, then return 1, else return 0.
Time complexity: O(n^2), Space complexity: O(1)

Optimized: Two Pointer Approach
Sort the array.
Traverse using two pointers, one from start and one from end. Check if the sum is equal to B.
If yes, return 1. The pair is found.
If the sum is less than B, then increment the left pointer.
If the sum is greater than B, then decrement the right pointer.
Time complexity: O(nlogn), Space complexity: O(1)
*/

import java.util.Arrays;
import java.util.Scanner;
public class EasyLevel_Good_Pair {
    public int solve(int[] A, int B) {
      /*
        //This is the brute force approach, Time complexity is O(n^2), Space complexity is O(1)
        for(int i = 0; i<A.length; i++){                    //Iterating through the array from the start
            for(int j = A.length-1; j>i; j--){              //Iterating through the array from the end
                if(A[i]+A[j]==B){                 //Check if the sum of the elements at the start and end pointer is equal to B
                    return 1;                       //return 1, because the check condition is true and the pair is found
                }
            }
        }
        return 0;                        //return 0, because the pair is not found after all the iterations
  */
        //This is the optimized approach, Time complexity is O(n), Space complexity is O(1)
        Arrays.sort(A);                         //Sort the array
        int i = 0;                              //This is Left pointer
        int j = A.length-1;                     //This is Right pointer
        while(i<j){
            if(A[i]+A[j]==B){                 //If the sum of the elements at the left and right pointer is equal to B, then the pair is found
                return 1;                     //return 1, because the check condition is true and the pair is found
            }
            else if(A[i]+A[j]<B){             //If the sum of the elements at the left and right pointer is less than B, then the left pointer is incremented
                i++;
            }
            else{                             //If the sum of the elements at the left and right pointer is greater than B, then the right pointer is decremented
                j--;
            }
        }
        return 0;                 //return 0, because the pair is not found after all the iterations
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();            //user inputs the size of the array
        int B = sc.nextInt();           //user inputs the value of B
        int[] A = new int[size];            //Array object is created using the Class Array where the array is created
        for(int i = 0; i<size; i++){        //Elements of the array are taken as input
            A[i] = sc.nextInt();
        }
        EasyLevel_Good_Pair obj = new EasyLevel_Good_Pair();            //Object of the class is created
        System.out.println(obj.solve(A,B));         //Method solve is called using the object created
    }
}
