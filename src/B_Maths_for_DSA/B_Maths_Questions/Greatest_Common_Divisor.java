package B_Maths_for_DSA.B_Maths_Questions;

/*Given 2 non-negative integers A and B, find gcd(A, B)
GCD of 2 integers A and B is defined as the greatest integer 'g' such that 'g' is a divisor of both A and B. Both A and B fit in a 32 bit signed integer.
Note: DO NOT USE LIBRARY FUNCTIONS.*/

import java.util.Scanner;

public class Greatest_Common_Divisor {
    public int gcd(int A, int B) {      // A and B are the input
        if(A == 0){         // if A is 0 then return B
            return(B);    // because 0 is divisible by every number
        }
        else{           // else return gcd(B%A,A)
            return(gcd(B%A,A));     //Eg: A=5, B=10, then 10%5=0, so 5 is the gcd
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // user inputs the value of A
        int B = sc.nextInt(); // user inputs the value of B
        Greatest_Common_Divisor obj = new Greatest_Common_Divisor(); // Object of the class is created
        System.out.println(obj.gcd(A, B)); // Method sqrt is called using the object created
    }
}
