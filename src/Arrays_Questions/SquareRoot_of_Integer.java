package Arrays_Questions;

/* Given an integer A. Compute and return the square root of A.
If A is not a perfect square, return floor(sqrt(A)).

NOTE:
   The value of A*A can cross the range of Integer.
   Do not use the sqrt function from the standard library.
   Users are expected to solve this in O(log(A)) time. */

import java.util.Scanner;
public class SquareRoot_of_Integer {
    public int sqrt(int A) {
        // the given constraint are 0 <= A <= 10^9 so we should initialize the vriable as long
        long ans = 0; // Initialize te ans variable to 0. Because input also b a 0
        long l = 1, r = A;
        while(l <= r) {     // Binary Search
            long m = (r+l)/2;
            if(m * m <= A) {
                ans = m;
                l = m+1;
            }
            else {
                r = m-1;
            }
        }

        return (int)ans; // type cast the ans variable into int
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // user inputs the value of A
        SquareRoot_of_Integer obj = new SquareRoot_of_Integer(); // Object of the class is created
        System.out.println(obj.sqrt(A)); // Method sqrt is called using the object created
    }
}
