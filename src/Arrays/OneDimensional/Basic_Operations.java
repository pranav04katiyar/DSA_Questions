package Arrays.OneDimensional;

import java.io.*;
import java.util.*;

public class Basic_Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                            // Input Scanner
        int n = sc.nextInt();                                           // Input Size of Array
        int[] arr1 = new int[n];                                        // Input Array 1

        for(int i=0; i<n; i++) {
            arr1[i] = sc.nextInt();                                     // Input Array 1 Elements
        }

        System.out.print("Array 1: " + Arrays.toString(arr1));          // Print Array 1
    }
}
