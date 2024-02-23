*Definition:*
-
* Array is a collection of similar data items. It is a linear data structure, where the elements are stored in contiguous memory locations. 
* The elements are accessed using their index. The index of the first element is 0 and the index of the last element is n-1, where n is the size of the array.
* The size of the array is fixed and cannot be changed once it is created. The elements of the array can be of any data type, such as int, float, char, etc.

*Use Case*
-
* Arrays are used to store data of the same type, in situations where the number of elements is known and fixed, like storing marks of students, storing the temperature of a city for a week, etc.

**The basic operations that can be performed on an array are:**

*To create an array:*
-
1. User defined -
```Java
Scanner sc = new Scanner(System.in);        //Scanner object is created
int size = sc.nextInt();           //user inputs the size of the array
Array A1 = new Array(size);        //Array object is created using the Class Array where the array is created
```
2. Predefined -
```Java
int[] A2 = new int[5]; //Array is created with the size 5
```
*To traverse an array:*
-
1. User defined -
```Java
for(int i=0; i<size; i++){
    System.out.print(A1.getArr()[i]+" ");     //Elements of the array are printed
}
```
- > Here, A1 is an object of a class Array and getArr() is a getter method of the class Array which returns the array

2. Predefined -
```Java
for(int i=0; i<5; i++){
    System.out.print(A2[i]+" ");     //Elements of the array are printed
}
```

*To insert an element in an array:*
-
1. User defined -
```Java
System.out.print("Enter the element to be added = ");
int ele1 = sc.nextInt();
System.out.print("Enter the position of insertion = ");
int pos1 = sc.nextInt();

for(int i=size-1; i>=pos1; i--){
    A1.getArr()[i] = A1.getArr()[i-1];     //Right shift happens till the position where the element is to be inserted
}
A1.getArr()[pos1-1]=ele1;     //Element is inserted
System.out.println(Arrays.toString(A1.getArr()));
```

2. Predefined -
```Java
A2[0] = 10; //Element 10 is inserted at the 0th position
```

*To delete an element from an array:*
-
1. User defined -
```Java
System.out.print("Enter the position of deletion = ");
int pos2 = sc.nextInt();

for(int i=pos2-1; i<size-1; i++){
    A1.getArr()[i] = A1.getArr()[i+1];     //Left shift happens from the position where the element is to be deleted
}
A1.getArr()[size-1]=0;     //Last element is made 0
System.out.println(Arrays.toString(A1.getArr()));
```

2. Predefined -
```Java
A2[0] = 0; //Element at 0th position is deleted
```

*To modify an element in an array:*
-
1. User defined -
```Java
System.out.print("Enter the position of modification = ");
int pos3 = sc.nextInt();
System.out.print("Enter the new element = ");
int ele2 = sc.nextInt();

A1.getArr()[pos3-1]=ele2;     //Element is modified
System.out.println(Arrays.toString(A1.getArr()));
```

2. Predefined -
```Java
A2[0] = 20; //Element at 0th position is modified to 20
```

*To search an element in an array:*
-
1. Linear Search -
```Java
System.out.print("Enter the element to be found = ");
int ele4 = sc.nextInt();
for(int i=0;i<size;i++){
    if(A2.getArr()[i]==ele4){           //Checks if the element is present
        System.out.println(ele4+" is present at position "+(i+1));      //Position of the element is printed
    }
}
```
 - Time Complexity: O(n) - Uses single for loop iterating through the entire array
 - Space Complexity: O(1) - Uses only a temporary variable

2. Binary Search -
```Java
int low=0, high=size-1, mid;
int ele4 = 5;     //Element to be searched
int flag=0;

//sorting the array
for(int i=0; i<size-1; i++){
    for(int j=i+1; j<size; j++){
        if(A1.getArr()[i]>A1.getArr()[j]){
            int temp = A1.getArr()[i];
            A1.getArr()[i] = A1.getArr()[j];
            A1.getArr()[j] = temp;     //Elements are swapped
        }
    }
}

while(low<=high){
    mid = (low+high)/2;
    if(A1.getArr()[mid]==ele4){
        flag=1;     //Element is found
        break;
    }
    else if(A1.getArr()[mid]<ele4){
        low = mid+1;
    }
    else{
        high = mid-1;
    }
}

if(flag==1){
    System.out.println("Element found");
}
else{
    System.out.println("Element not found");
}
```
- Time Complexity: O(log n) - Uses binary search algorithm
- Space Complexity: O(1) - Uses only a temporary variable
- Here, the array is sorted using the selection sort algorithm before performing the binary search, as binary search requires the array to be sorted.

*To sort an array:*
-
1. Library function -
```Java
Arrays.sort(A1.getArr());
System.out.println(Arrays.toString(A1.getArr()));
```
- Time Complexity: O(n log n) - Uses quicksort algorithm, which is the default sorting algorithm in Java for primitive types and the mergesort algorithm for objects and arrays of objects.
- Space Complexity: O(n) - Uses a temporary array to store the elements.

2. Selection Sort -
```Java
for(int i=0; i<size-1; i++){
    int min = i;
    for(int j=i+1; j<size; j++){
        if(A1.getArr()[j]<A1.getArr()[min]){
            min = j;     //Minimum element is found
        }
    }
    int temp = A1.getArr()[i];
    A1.getArr()[i] = A1.getArr()[min];
    A1.getArr()[min] = temp;     //Elements are swapped
}
System.out.println(Arrays.toString(A1.getArr()));
```
- Time Complexity: O(n^2) - Uses double for loop
- Space Complexity: O(1) - Uses only a temporary variable

3. Bubble Sort -
```Java
for(int i=0; i<size-1; i++){
    for(int j=0; j<size-i-1; j++){
        if(A1.getArr()[j]>A1.getArr()[j+1]){
            int temp = A1.getArr()[j];
            A1.getArr()[j] = A1.getArr()[j+1];
            A1.getArr()[j+1] = temp;     //Elements are swapped
        }
    }
}
System.out.println(Arrays.toString(A1.getArr()));
```
- Time Complexity: O(n^2) - Uses double for loop
- Space Complexity: O(1) - Uses only a temporary variable

4. Insertion Sort -
```Java
for(int i=1; i<size; i++){
    int key = A1.getArr()[i];
    int j = i-1;
    while(j>=0 && A1.getArr()[j]>key){
        A1.getArr()[j+1] = A1.getArr()[j];     //Right shift happens
        j--;
    }
    A1.getArr()[j+1] = key;     //Element is inserted
}
System.out.println(Arrays.toString(A1.getArr()));
```
- Time Complexity: O(n^2) - Uses double for loop
- Space Complexity: O(1) - Uses only a temporary variable

5. Merge Sort -
```Java
public void mergeSort(int[] arr, int l, int r){
    if(l<r){
        int m = (l+r)/2;
        mergeSort(arr, l, m);
        mergeSort(arr, m+1, r);
        merge(arr, l, m, r);
    }
}

public void merge(int[] arr, int l, int m, int r){
    int n1 = m-l+1;
    int n2 = r-m;
    int[] L = new int[n1];
    int[] R = new int[n2];
    for(int i=0; i<n1; i++){
        L[i] = arr[l+i];
    }
    for(int j=0; j<n2; j++){
        R[j] = arr[m+1+j];
    }
    int i=0, j=0, k=l;
    while(i<n1 && j<n2){
        if(L[i]<=R[j]){
            arr[k] = L[i];
            i++;
        }
        else{
            arr[k] = R[j];
            j++;
        }
        k++;
    }
    while(i<n1){
        arr[k] = L[i];
        i++;
        k++;
    }
    while(j<n2){
        arr[k] = R[j];
        j++;
        k++;
    }
}
```
- Time Complexity: O(n log n) - Uses divide and conquer algorithm
- Space Complexity: O(n) - Uses temporary arrays to store the elements

6. Quick Sort -
```Java
public void quickSort(int[] arr, int low, int high){
    if(low<high){
        int pi = partition(arr, low, high);
        quickSort(arr, low, pi-1);
        quickSort(arr, pi+1, high);
    }
}

public int partition(int[] arr, int low, int high){
    int pivot = arr[high];
    int i = low-1;
    for(int j=low; j<high; j++){
        if(arr[j]<pivot){
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;     //Elements are swapped
        }
    }
    int temp = arr[i+1];
    arr[i+1] = arr[high];
    arr[high] = temp;     //Elements are swapped
    return i+1;
}
```
- Time Complexity: O(n log n) - Uses divide and conquer algorithm
- Space Complexity: O(log n) - Uses recursive calls
