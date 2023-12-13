package Arrays_Theory.OneDimensional;

import java.util.Arrays;
import java.util.*;

public class SearchArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Array A2;
        A2 = new Array(size);


        //Searching an element in an Array
        //Linear search
        System.out.print("Enter the element to be found = ");
        int ele4 = sc.nextInt();
        for(int i=0;i<size;i++){
            if(A2.getArr()[i]==ele4){
                System.out.println(ele4+" is present at position "+(i+1));
            }
        }

        //Binary search
        System.out.print("Enter the element to be found = ");
        int ele5 = sc.nextInt();
        int low = 0;
        int high = size-1;
        int mid = (low+high)/2;
        while(low<=high){
            if(A2.getArr()[mid]<ele5){
                low = mid+1;
            }
            else if(A2.getArr()[mid]==ele5){
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
