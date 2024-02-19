package D_Data_Structures.A_Fundamental_DS.C_Strings.B_Strings_Questions;

/*Laxman is newbie in programming. He just learned how to generate fibonacci series, he told this to his elder brother, so his brother gave him an interesting problem.
The problem is, given an integer N, task is to check whether the given number exist in fibonacci sequence or not.*/

import java.util.Scanner;

public class IsFibonacci {
    static int Fibonacci(int N){        // Function to check if the number is fibonacci or not
        int a = 0;          // Initializing the first two numbers of the fibonacci series
        int b = 1;
        int c = 0;          // Initializing the third number of the fibonacci series

        if(N==0){           // If the number is 0 or 1 then it is fibonacci
            return 1;
        }
        else if(N==1){      // If the number is 0 or 1 then it is fibonacci
            return 1;
        }

        for(int i = 0;; i++){       // Loop to generate the fibonacci series
            c = a + b;          // Generating the fibonacci series
            if(c==N){       // If the number is fibonacci then return 1
                return 1;
            }
            if(c>N){        // If the number is not fibonacci then return 0
                return 0;
            }
            a = b;      // Updating the values of a
            b = c;      // Updating the values of b
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();       // T is the number of test cases
        int i = 0;
        while(i<T){         // Loop for the number of test cases
            int N = sc.nextInt();       // N is the number to be checked
            if(Fibonacci(N)==1){        // Calling the Fibonacci function
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            i++;
        }
    }
}
