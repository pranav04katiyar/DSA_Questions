package D_Data_Structures.A_Fundamental_DS.A_Arrays_and_Arraylists.A_Arrays.A_Arrays_Theory.OneDimensional;

/*
This class is used to create an array and perform basic operations like insertion, deletion and updation of elements in the array by calling from the main class.
The purpose is to get used to using constructors and getter and setter methods.
 */


import java.util.*;
public class Array {

    Scanner sc = new Scanner(System.in);        //Scanner object is created
    private int n;                        //Variable to store the size of the array
    private int[] arr;              //Array to store the elements

    public int[] getArr(){
        return arr;
    }           //Getter method to return the array
    public int getN(){
        return n;
    }           //Getter method to return the size of the array

    public void setArr(int[] arr){
        this.arr = arr;
    }       //Setter method to set the array

    public void setN(int n){
        this.n = n;
    }       //Setter method to set the size of the array

    public Array(int n){            //Constructor to initialize the size of the array
        this.n = n;                         //Size of the array is set
        arr = new int[n];                   //Array is created
        for(int i=0;i<n;i++){               //Input the elements of the array
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));       //Print the array
    }
}
