package Arrays_Theory.OneDimensional;

import java.util.*;
public class Array {

    Scanner sc = new Scanner(System.in);
    private int n;
    private int[] arr;

    public int[] getArr(){
        return arr;
    }
    public int getN(){
        return n;
    }

    public void setArr(int[] arr){
        this.arr = arr;
    }

    public void setN(int n){
        this.n = n;
    }

    public Array(int n){
        this.n = n;
        arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
