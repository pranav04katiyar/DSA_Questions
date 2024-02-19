package II_Maths_for_DSA.Maths_Questions;

import java.util.Scanner;

//Given two numbers A & B. Return their product.
public class Multiply_the_Numbers {
    public int solve(int A, int B) {
        return A*B;      // multiply and return A and B
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // user inputs the value of A
        int B = sc.nextInt(); // user inputs the value of B
        Multiply_the_Numbers obj = new Multiply_the_Numbers(); // Object of the class is created
        System.out.println(obj.solve(A, B)); // Method sqrt is called using the object created
    }
}
