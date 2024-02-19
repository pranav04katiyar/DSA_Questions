package B_Maths_for_DSA.B_Maths_Questions;

//Write a function that takes to positive integers A and B and returns their LCM.

import java.lang.*;
import java.util.*;

public class LCM {
    static int GCD(int A, int B){           // Function to find GCD of two numbers
        if (A==0){              // If A is 0 then GCD is B
            int gcd = B;        // gcd variable to store the GCD
            return gcd;
        }
        return(GCD(B%A, A));        // If A is not 0 then GCD is GCD(B%A, A)
    }                           // GCD(B%A, A) is same as GCD(B,A) because B%A is same as B-A*(B/A)
    static int LCM(int A, int B){       // Function to find LCM of two numbers
        int lcm = 0;
        if(A != 0 && B!=0){         // If A and B are not 0 then LCM is A*B/GCD(A,B)
            lcm = A*B/GCD(A,B);
        }
        return lcm;     // If A or B is 0 then LCM is 0
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);        // Scanner object to take input from user
        int A = sc.nextInt();           // Taking input from user
        int B = sc.nextInt();           // Taking input from user
        System.out.println(LCM(A,B));       // Calling LCM function and printing the result
    }
}
