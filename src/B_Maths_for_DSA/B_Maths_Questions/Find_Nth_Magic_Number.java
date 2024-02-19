package B_Maths_for_DSA.B_Maths_Questions;

/*Given an integer A, find and return the Ath magic number.
A magic number is defined as a number that can be expressed as a power of 5 or a sum of unique powers of 5.
First few magic numbers are 5, 25, 30(5 + 25), 125, 130(125 + 5), ….*/


import java.util.Scanner;

public class Find_Nth_Magic_Number {
    public int solve(int A) {       // A is the input
        int sum = 0;
        int pow = 5;

        while(A>0){
            int rem = A%2;
            sum = sum + rem*pow;
            pow = pow*5;
            A = A/2;
        }
        return sum;     // return the sum
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // user inputs the value of A
        Find_Nth_Magic_Number obj = new Find_Nth_Magic_Number(); // Object of the class is created
        System.out.println(obj.solve(A)); // Method sqrt is called using the object created
    }
}
