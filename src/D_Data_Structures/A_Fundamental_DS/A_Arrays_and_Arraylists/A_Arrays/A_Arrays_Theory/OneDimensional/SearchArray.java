package D_Data_Structures.A_Fundamental_DS.A_Arrays_and_Arraylists.A_Arrays.A_Arrays_Theory.OneDimensional;

import java.util.*;

public class SearchArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        //Scanner object is created
        int size = sc.nextInt();                    //user inputs the size of the array
        Array A2 = new Array(size);                 //Array object is created using the Class Array where the array is created


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
