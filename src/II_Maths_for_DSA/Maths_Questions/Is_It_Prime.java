package II_Maths_for_DSA.Maths_Questions;

/*Take an integer A as input, you have to tell whether it is a prime number or not.

A prime number is a natural number greater than 1 which is divisible only by 1 and itself.*/

import java.util.Scanner;
import java.lang.*;

public class Is_It_Prime {
    static void Prime(int A){       // Function to check whether the number is prime or not
        for(int i=2; i<A; i++){     // Loop from 2 to A-1
            if(A%i==0){         // If A is divisible by any number between 2 to A-1 then it is not a prime number
                System.out.println("NO");
                break;
            }
        }
        System.out.println("YES");      // If A is not divisible by any number between 2 to A-1 then it is a prime number
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        // Scanner object to take input from user
        int A = sc.nextInt();       // Taking input from user
        Prime(A);           // Calling Prime function
    }
}
