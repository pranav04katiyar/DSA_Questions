package B_Maths_for_DSA.B_Maths_Questions;

/*You are given a positive integer A denoting the radius of a sphere. You have to calculate the volume of the sphere.
Volume of a sphere having radius R is given by (4 * π * R3) / 3.
NOTE: Since, the answer can be a real number, you have to return the ceil value of the volume.
Ceil value of a real number X is the smallest integer that is greater than or equal to X.*/

import java.util.Scanner;
public class Volume_of_Sphere {
    public int solve(final int A) {
        double Vol = (4*3.1415926535* Math.pow(A,3))/3;
        int Vol_final = (int) Vol + 1;
        return Vol_final;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        Volume_of_Sphere obj = new Volume_of_Sphere();
        System.out.println(obj.solve(A));
    }
}
