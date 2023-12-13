package Arrays_Theory.OneDimensional;

import java.util.Arrays;
import java.util.*;

public class Basic_Operations {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];        //Initializing an array

        //Creating an array
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        //Traversing through Array
        for(int i=0; i<arr.length; i++){
            System.out.println("Arr["+i+"] = "+arr[i]);
        }

        //Inserting an element in an Array
        System.out.print("Enter the element to be added = ");
        int ele1 = sc.nextInt();
        System.out.print("Enter the position of insertion = ");
        int pos1 = sc.nextInt();

        for(int i=arr.length-1; i>=pos1; i--){
            arr[i] = arr[i-1];
        }
        arr[pos1-1]=ele1;
        System.out.println(Arrays.toString(arr));

        //Deleting an element in an Array
        System.out.print("Enter the position of deletion = ");
        int pos2 = sc.nextInt();

        for (int i=pos2;i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        System.out.println(Arrays.toString(arr));

        //Update an element in an Array
        System.out.print("Enter the position of update = ");
        int pos3 = sc.nextInt();
        System.out.print("Enter the element to be added = ");
        int ele3 = sc.nextInt();

        arr[pos3-1] = ele3;
        System.out.println(Arrays.toString(arr));
    }
}
