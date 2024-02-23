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
- The array must be sorted before performing binary search, as binary search requires the array to be sorted.
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

*To sort an array:*
-
1. Library function -
```Java
Arrays.sort(A1.getArr());
System.out.println(Arrays.toString(A1.getArr()));
```
- Time Complexity: O(n log n) - Uses quicksort algorithm, which is the default sorting algorithm in Java for primitive types and the mergesort algorithm for objects and arrays of objects.
- Space Complexity: O(n) - Uses a temporary array to store the elements.

2. Other sorting algorithms -
> We will learn about the sorting algorithms in the sorting section of the algorithms. For now, just know there are multiple sorting algorithms like Selection Sort, Bubble Sort, Insertion Sort, Merge Sort, Quick Sort, etc.

>1. Selection Sort -
>- Time Complexity: O(n^2) - Uses double for loop
>- Space Complexity: O(1) - Uses only a temporary variable

>2. Bubble Sort -
>- Time Complexity: O(n^2) - Uses double for loop
>- Space Complexity: O(1) - Uses only a temporary variable

>3. Insertion Sort -
>- Time Complexity: O(n^2) - Uses double for loop
>- Space Complexity: O(1) - Uses only a temporary variable

>4. Merge Sort -
>- Time Complexity: O(n log n) - Uses divide and conquer algorithm
>- Space Complexity: O(n) - Uses temporary arrays to store the elements

>5. Quick Sort -
>- Time Complexity: O(n log n) - Uses divide and conquer algorithm
>- Space Complexity: O(log n) - Uses recursive calls
