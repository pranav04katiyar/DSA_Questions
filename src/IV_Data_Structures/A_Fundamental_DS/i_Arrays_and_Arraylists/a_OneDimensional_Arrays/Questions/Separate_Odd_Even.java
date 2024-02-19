package IV_Data_Structures.A_Fundamental_DS.i_Arrays_and_Arraylists.a_OneDimensional_Arrays.Questions;

/*You are given an integer T denoting the number of test cases. For each test case, you are given an integer array A.
You have to print the odd and even elements of array A in 2 separate lines.
NOTE: Array elements should have the same relative order as in A.*/

import java.util.Scanner;
public class Separate_Odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();       //number of test cases
        while(t-- > 0){             //loop for test cases
            int n = sc.nextInt();   //size of array
            int[] arr = new int[n];       //array declaration
            for(int i = 0; i < n; i++){   //taking input in array
                arr[i] = sc.nextInt();
            }

            for(int i = 0; i < n; i++){     //printing odd elements in the array
                if(arr[i] % 2 != 0){
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();   //moving cursor to next line

            for(int i = 0; i < n; i++){   //printing even elements in the array
                if(arr[i] % 2 == 0){
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();  //moving cursor to next line
        }
    }
}
