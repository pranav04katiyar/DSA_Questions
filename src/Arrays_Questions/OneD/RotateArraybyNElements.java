package Arrays_Questions.OneD;

/*Given an integer array A of size N and an integer B, you have to print the same array after rotating it B times towards the right.*/

import java.lang.*;
import java.util.*;
public class RotateArraybyNElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();               //input the size
        int[] A1 = new int[N];              //array creation
        for(int i=0; i<N; i++){
            A1[i] = sc.nextInt();           //input elements
        }

        int B = sc.nextInt();               //input the no. of rotations
        int[] A2 = new int[N];              //create rotated arrays
        for(int i=0; i<N; i++){
            A2[(i+B)%N] = A1[i];            //input elements by rotating them
        }

        for(int i=0; i<N; i++){
            System.out.print(A2[i]+" ");    //output elements
        }
    }
}
