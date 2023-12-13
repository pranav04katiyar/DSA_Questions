package Arrays_Theory.OneDimensional;

import java.util.Arrays;
import java.util.*;

public class SearchArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];

        //Creating an array
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr1));

        //Searching an element in an Array
        //Linear search
        System.out.print("Enter the element to be found = ");
        int ele4 = sc.nextInt();
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]==ele4){
                System.out.println(ele4+" is present at position "+(i+1));
            }
        }

        //Binary search
        System.out.print("Enter the element to be found = ");
        int ele5 = sc.nextInt();
        int low = 0;
        int high = arr1.length-1;
        int mid = (low+high)/2;
        while(low<=high){
            if(arr1[mid]<ele5){
                low = mid+1;
            }
            else if(arr1[mid]==ele5){
                System.out.println(ele5+" is present at position "+(mid+1));
                break;
            }
            else{
                high = mid-1;
            }
            mid = (low+high)/2;
        }
    }

}
