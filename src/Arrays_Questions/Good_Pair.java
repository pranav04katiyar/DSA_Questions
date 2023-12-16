package Arrays_Questions;

/*Given an array A and an integer B.
A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B). Check if any good pair exist or not.*/

import java.util.Scanner;
public class Good_Pair {
    public int solve(int[] A, int B) {
      /*
        //This is the brute force approach, Time complexity is O(n^2), Space complexity is O(1)
        int ans=0;
        for(int i = 0; i<A.length; i++){                    //Iterating through the array from the start
            for(int j = A.length-1; j>i; j--){              //Iterating through the array from the end
                if(A[i]+A[j]==B){                 //If the sum of the elements at the start and end pointer is equal to B, then the pair is found
                    ans = 1;
                    break;
                }
            }
        }
        return ans;                        //If the pair is found, then ans = 1, else ans = 0
  */
        //This is the optimized approach, Time complexity is O(n), Space complexity is O(1)
        int ans = 0;
        int i = 0;                              //This is Left pointer
        int j = A.length-1;                     //This is Right pointer
        while(i<j){
            if(A[i]+A[j]==B){                 //If the sum of the elements at the left and right pointer is equal to B, then the pair is found
                ans = 1;
                break;
            }
            else if(A[i]+A[j]<B){             //If the sum of the elements at the left and right pointer is less than B, then the left pointer is incremented
                i++;
            }
            else{                             //If the sum of the elements at the left and right pointer is greater than B, then the right pointer is decremented
                j--;
            }
        }
        return ans;                 //If the pair is found, then ans = 1, else ans = 0
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();            //user inputs the size of the array
        int B = sc.nextInt();           //user inputs the value of B
        int[] A = new int[size];            //Array object is created using the Class Array where the array is created
        for(int i = 0; i<size; i++){        //Elements of the array are taken as input
            A[i] = sc.nextInt();
        }
        Good_Pair obj = new Good_Pair();            //Object of the class is created
        System.out.println(obj.solve(A,B));         //Method solve is called using the object created
    }
}
