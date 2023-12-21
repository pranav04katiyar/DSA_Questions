package Maths_Questions;

/*You are given an integer A, you need to find and return the sum of all the even numbers between 1 and A.
Even numbers are those numbers that are divisible by 2.*/

import java.util.Scanner;

public class Sum_Of_Evens {
    public int solve(int A) {       // A is the input
        int sum = 0;

        for(int i = 1; i<=A; i++){      // loop from 1 to A
            if(i%2==0){         // if i is divisible by 2 then add it to sum
                sum = sum+i;
            }
        }

        return(sum);        // return the sum
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // user inputs the value of A
        Sum_Of_Evens obj = new Sum_Of_Evens(); // Object of the class is created
        System.out.println(obj.solve(A)); // Method sqrt is called using the object created
    }
}
