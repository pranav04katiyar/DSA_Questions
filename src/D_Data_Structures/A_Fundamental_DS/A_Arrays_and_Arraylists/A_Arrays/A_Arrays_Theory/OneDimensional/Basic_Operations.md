*To create an array:*
-
>1. User defined -
```Java
Scanner sc = new Scanner(System.in);        //Scanner object is created
int size = sc.nextInt();           //user inputs the size of the array
Array A1 = new Array(size);        //Array object is created using the Class Array where the array is created
```
>2. Predefined -
```Java
int[] A2 = new int[5]; //Array is created with the size 5
```
*To traverse an array:*
-
>1. User defined -
```Java
for(int i=0; i<size; i++){
    System.out.print(A1.getArr()[i]+" ");     //Elements of the array are printed
}
```
- > Here, A1 is an object of a class Array and getArr() is a getter method of the class Array which returns the array

>2. Predefined -
```Java
for(int i=0; i<5; i++){
    System.out.print(A2[i]+" ");     //Elements of the array are printed
}
```

*To insert an element in an array:*
-
>1. User defined -
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

>2. Predefined -
```Java
A2[0] = 10; //Element 10 is inserted at the 0th position
```

