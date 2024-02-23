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
for(int i=0; i<size-1; i++){
    for(int j=i+1; j<size; j++){
        if(A1.getArr()[i]>A1.getArr()[j]){
            int temp = A1.getArr()[i];
            A1.getArr()[i] = A1.getArr()[j];
            A1.getArr()[j] = temp;     //Elements are swapped
        }
    }
}
System.out.println(Arrays.toString(A1.getArr()));
```
Time Complexity: O(n^2) - Uses double for loop
Space Complexity: O(1) - Uses only a temporary variable

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