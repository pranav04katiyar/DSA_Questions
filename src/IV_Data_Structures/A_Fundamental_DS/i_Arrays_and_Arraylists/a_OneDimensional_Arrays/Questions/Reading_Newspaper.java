package IV_Data_Structures.A_Fundamental_DS.i_Arrays_and_Arraylists.a_OneDimensional_Arrays.Questions;

/* You have a newspaper which has A lines to read.
You decided to start reading the 1st line from Monday. You are given a schedule, B, where B[i] = number of lines you can read on that day.
You are very strict in reading the newspaper and you will read as much as you can every day.
Determine and return, which day of the week you will read the last line of the newspaper.*/


//Solution in Array format:
import java.util.Scanner;
public class Reading_Newspaper {
    public static class Solution {
        public int solve(int A, int[] B) {
            int sum = 0, i = 0;             //sum is the total number of lines read(meaning no lines are read till now) and i is the index of the day (0 for Monday and 6 for Sunday)
            while (true) {                  //loop to check the day on which the last line will be read, loop will end once the condition in the loop is met, means all the lines are read
                if (i > 6) {                //if i is greater than 6, then it will be reset to 0, means the week will start again
                    i = 0;
                }
                sum = sum + B[i];           //adding the number of lines read on ith day, meaning the total number of lines read
                if (sum >= A) {             //if sum is greater than or equal to A(means all the lines are read), hence the last line will be read on ith day
                    return i + 1;
                }
                i++;                        //Means the total no. of lines are not yet read, so incrementing i
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();               // Total number of lines in the newspaper
        int[] B = new int[7];               // Array to represent the schedule

        // Input number of lines for each day of the week
        for (int i = 0; i < 7; i++) {
            B[i] = sc.nextInt();
        }

        Solution obj = new Solution();      //object of class Solution
        System.out.println("The last line will be read on day: " + obj.solve(A, B));     //calling solve() method and printing the result
    }
}

/*
//Solution in ArrayList format:

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public int solve(int A, ArrayList<Integer> B) {
        int sum = 0, i = 0;         //sum is the total number of lines read(meaning no lines are read till now) and i is the index of the day (0 for Monday and 6 for Sunday)
        while (true) {              //loop to check the day on which the last line will be read, loop will end once the condition in the loop is met, means all the lines are read
            if (i > 6) {            //if i is greater than 6, then it will be reset to 0, means the week will start again
                i = 0;
            }
            sum = sum + B.get(i);       //adding the number of lines read on ith day, meaning the total number of lines read
            if (sum >= A) {             //if sum is greater than or equal to A(means all the lines are read), hence the last line will be read on ith day
                return i + 1;
            }
            i++;                    //Means the total no. of lines are not yet read, so incrementing i
    }
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt(); // Total number of lines in the newspaper
    ArrayList<Integer> B = new ArrayList<>();       // Array to represent the schedule

    // Input number of lines for each day of the week
    for (int i = 0; i < 7; i++) {
        B.add(sc.nextInt());
    }

    Solution obj = new Solution();          //object of class Solution
    System.out.println("The last line will be read on day: " + obj.solve(A, B));     //calling solve() method and printing the result
}
*/
