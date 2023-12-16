package Arrays_Questions;

import java.util.Scanner;

public class Little_PonyAndMaximum_Element {
    public int solve(int[] A, int B) {
        boolean x=false;                    //Assuming that B is not present in array A
        for(int i=0;i<A.length;i++){        //loop to check if B is present in array A
            if(A[i]==B){                //if B is present in array A
                x = true;
            }
        }
        int count = 0;                  //To count the number of elements greater than B
        if(x==true){                    //if B is present in array A
            for(int j=0; j<A.length;j++){       //loop to count the number of elements greater than B
                if(A[j]>B){             //if element is greater than B
                    count++;
                }
            }
            return count;
        }
        else{                   //if B is not present in array A
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       //size of array
        int[] arr = new int[n];       //array declaration
        for(int i = 0; i < n; i++){   //taking input in array
            arr[i] = sc.nextInt();
        }
        int B = sc.nextInt();       //element to be searched in array
        Little_PonyAndMaximum_Element obj = new Little_PonyAndMaximum_Element();        //object of class Little_PonyAndMaximum_Element
        System.out.println(obj.solve(arr, B));        //calling solve() method
    }
}
