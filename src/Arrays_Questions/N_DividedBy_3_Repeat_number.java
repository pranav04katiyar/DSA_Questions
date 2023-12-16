package Arrays_Questions;

import java.util.Scanner;

/*You're given a read-only array of N integers.
Find out if any integer occurs more than N/3 times in the array in linear time and constant additional space.
If so, return the integer. If not, return -1.
If there are multiple solutions, return any one.
Note: Read-only array means that the input array should not be modified in the process of solving the problem.*/

/*This code aims to find the majority element(s) in an array.
The majority element is defined as an element that appears more than ⌊n/3⌋ times in the array, where n is the size of the array.*/

public class N_DividedBy_3_Repeat_number {
    public int repeatedNumber(int[] A) {
        int N = A.length;   //size of the array
        if(N==2 || N==1){   //if the size of the array is 2 or 1, then the element is repeated (1/3 and 2/3 is 0 meaning no occurence is allowed)
            return A[0];    //return the first element
        }
        int max = N/3;      //max occurence of an element in an array of size N is N/3
        int element1 = -1,element2=-1;  //initialise the elements to -1
        int freq1 = 0, freq2 = 0;    //initialise the frequencies to 0

        // traverse through the array
        for(int i=0; i<N; i++){
            if(element1 == A[i]){  //if the element1 is already present, increment its frequency
                freq1++;
            }
            else if (element2 == A[i]){  //if the element2 is already present, increment its frequency
                freq2++;
            }
            else if(freq1 == 0){        //if the frequency of element1 is 0, then assign the element to element1 and increment its frequency
                element1 = A[i];
                freq1 = 1;
            }
            else if(freq2 == 0){        //if the frequency of element2 is 0, then assign the element to element2 and increment its frequency
                element2 = A[i];
                freq2 = 1;
            }
            else{            //if none of the above conditions are satisfied, then decrement the frequencies of both the elements
                freq1--;
                freq2--;
            }
        }

        //initialise the count of both the elements to 0
        int count1=0,count2=0;
        for(int i=0; i<A.length; i++){          //traverse through the array
            if(A[i] == element1){        //if the element is equal to element1, increment its count
                count1++;
            }
            else if(A[i] == element2){      //if the element is equal to element2, increment its count
                count2++;
            }
        }
        if(count1 > max){           //if the count of element1 is greater than max, then return element1
            return element1;
        }
        if(count2 > max){           //if the count of element2 is greater than max, then return element2
            return element2;
        }
        return -1;          //else return -1
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //scanner class
        int size = sc.nextInt();           //user inputs the size of the array
        int[] A = new int[size];            //array of size N
        for(int i=0; i<size; i++){          //user inputs the array
            A[i] = sc.nextInt();
        }
        N_DividedBy_3_Repeat_number obj = new N_DividedBy_3_Repeat_number();        //object of the class
        System.out.println(obj.repeatedNumber(A));      //calling the method
    }
}
