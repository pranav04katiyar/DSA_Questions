package Arrays_Questions;

/* Little pony is going to buy some mobile phones for his friends.
As there are many models available in the market at different prices, he is confused and wants to know the maximum distinct models of a mobile phone he can buy for his friends,
given that he has a total X amount of money.
You are given an array A of size N. denoting the prices of different models. The array is sorted based on prices in increasing order.
You are given another array B of size Q denoting the queries.
In i'th query, you need to tell the maximum distinct models of mobile phones he can buy with B[i] money. */

import java.util.Scanner;

public class LittlePony_and_MobilePhones {
    public int[] solve(int[] A, int[] B) {
        // Initialize arrays to store prefix sum and final answers
        int[] prefixSum = new int[A.length];
        int[] ans = new int[B.length];

        // Calculate the prefix sum for array A
        prefixSum[0] = A[0];
        for(int i = 0; i < A.length - 1; i++) {
            prefixSum[i + 1] = prefixSum[i] + A[i + 1];
        }

        // Process each query in array B
        for(int i = 0; i < B.length; i++) {
            // Set initial values for binary search
            int l = 0;
            int r = A.length - 1;
            int count = 0;

            // Perform binary search on prefixSum array
            while (l <= r) {
                int m = (l + r) / 2;

                // If prefix sum at m equals the query budget, update count and break
                if (prefixSum[m] == B[i]) {
                    count = m + 1;
                    break;
                }
                // If prefix sum at m is greater than the query budget, adjust the right bound
                else if (prefixSum[m] > B[i]) {
                    r = m - 1;
                }
                // If prefix sum at m is less than the query budget, adjust the left bound and update count
                else {
                    l = m + 1;
                    count = m + 1;
                }
            }

            // Store the count for the current query in the ans array
            ans[i] = count;
        }

        // Return the final array containing counts for each query
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Size of array A
        int q = sc.nextInt(); // Size of array B
        int[] A = new int[n]; // Array A
        int[] B = new int[q]; // Array B
        for (int i = 0; i < n; i++) {  // Input array A
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < q; i++) {  // Input array B
            B[i] = sc.nextInt();
        }
        LittlePony_and_MobilePhones obj = new LittlePony_and_MobilePhones();  // Create an object of the class LittlePony_and_MobilePhones
        int[] ans = obj.solve(A, B);                                    // Call the solve method
        for (int i = 0; i < q; i++) {                        // Print the final array
            System.out.println(ans[i]);
        }
    }
}
