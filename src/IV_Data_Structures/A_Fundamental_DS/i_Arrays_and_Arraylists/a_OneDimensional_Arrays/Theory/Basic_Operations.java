package IV_Data_Structures.A_Fundamental_DS.i_Arrays_and_Arraylists.a_OneDimensional_Arrays.Theory;

import java.util.Arrays;
import java.util.*;

public class Basic_Operations {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);                    //Scanner object is created
        int size = sc.nextInt();                                //user inputs the size of the array
        Array A1 = new Array(size);                             //Array object is created using the Class Array where the array is created

        //Traversing through Array
        for(int i=0; i<size; i++){
            System.out.println("Arr["+i+"] = "+A1.getArr()[i]);
        }

        //Inserting an element in an Array
        System.out.print("Enter the element to be added = ");
        int ele1 = sc.nextInt();
        System.out.print("Enter the position of insertion = ");
        int pos1 = sc.nextInt();

        for(int i=size-1; i>=pos1; i--){
            A1.getArr()[i] = A1.getArr()[i-1];     //Right shift happens till the position where the element is to be inserted
        }
        A1.getArr()[pos1-1]=ele1;     //Element is inserted
        System.out.println(Arrays.toString(A1.getArr()));

        //Deleting an element in an Array
        System.out.print("Enter the position of deletion = ");
        int pos2 = sc.nextInt();

        for (int i=pos2;i<size;i++){
            A1.getArr()[i-1] = A1.getArr()[i];                  //Left shift happens till the position where the element is to be deleted
        }
        System.out.println(Arrays.toString(A1.getArr()));

        //Update an element in an Array
        System.out.print("Enter the position of update = ");
        int pos3 = sc.nextInt();
        System.out.print("Enter the element to be added = ");
        int ele3 = sc.nextInt();

        A1.getArr()[pos3-1] = ele3;                             //Element is overwritten at the specified position
        System.out.println(Arrays.toString(A1.getArr()));
    }
}
