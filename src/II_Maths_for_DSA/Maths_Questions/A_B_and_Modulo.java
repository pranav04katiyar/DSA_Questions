package II_Maths_for_DSA.Maths_Questions;

/*Given two integers A and B, find the greatest possible positive integer M, such that A % M = B % M.*/

import java.util.Scanner;

public class A_B_and_Modulo {
    public int solve(int A, int B) {
        return Math.max(A,B)-Math.min(A,B);     // M = max(A,B)-min(A,B)
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       // Scanner object to take input from user
        int A = scanner.nextInt(), B = scanner.nextInt();       // Taking input from user
        A_B_and_Modulo obj = new A_B_and_Modulo();      // Creating object of class A_B_and_Modulo
        System.out.println(obj.solve(A,B));         // Calling solve method of class A_B_and_Modulo and printing the result
    }
}
