package II_Maths_for_DSA.Maths_Questions;

/*You are given a positive integer A denoting the radius of a circle. You have to calculate the area of the circle.
Note :
The formula for the area of a circle is Area = πr², where r is the radius of the circle.
You can use the value of PI as 3.1416
Round up the final answer up to 2 decimal places.
You can use round(area, 2) it for rounding area to 2 decimal places*/

import java.util.Scanner;
public class Area_of_Circle {
    public int solve(int A) {
        double area = 3.1415926535*A*A;
        int areafinal = (int) area + 1;
        return areafinal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // user inputs the value of A
        Area_of_Circle obj = new Area_of_Circle(); // Object of the class is created
        System.out.println(obj.solve(A)); // Method sqrt is called using the object created
    }
}
