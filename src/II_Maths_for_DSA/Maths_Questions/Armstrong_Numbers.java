package II_Maths_for_DSA.Maths_Questions;

/*You are given an integer N you need to print all the Armstrong Numbers between 1 to N. (N inclusive).
If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.
For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 ).
Note: All the test cases in this problem are limited to 3 digit numbers.*/

import java.lang.*;
import java.util.*;

public class Armstrong_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        // Taking input using class Scanner
        int N = sc.nextInt();            // Taking input of number of testcases

        for(int i=1;i<=N;i++){      // Running a for loop for N testcases
            int sum = 0;        // Initializing sum variable to 0
            int temp =i;        // Initializing temp variable to i
            while(temp>0){      // Running a while loop till temp is greater than 0
                int rem = temp%10;      // Storing the remainder of temp divided by 10 in rem variable
                sum += rem*rem*rem;     // Adding the cube of the remainder to the sum variable
                temp = temp/10;         // Updating the value of temp by dividing it by 10
            }
            if(sum==i){     // Checking if sum is equal to i
                System.out.println(i);      // Printing i
            }
        }
    }
}
