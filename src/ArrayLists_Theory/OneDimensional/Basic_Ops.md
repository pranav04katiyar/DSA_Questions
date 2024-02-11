**ARRAYLIST:**
-
> It is an implementation of List interface. It is a resizable array, which can be found in the java.util package.
> It is similar to the array, but it can change its size. It is a part of Java's collection framework.
> It uses a dynamic array for storing the elements. It is a generic class.

**How ArrayList works:**
> - It uses a dynamic array for storing the elements.
> - When an array is full, it creates a new array with a larger size at a different memory location and copies the elements of the old array to the new array with a larger capacity.
> - Since the new array is created at a different memory location, the reference of the old array is changed to the new array.
> - As the new array is created by copying the old array at a different memory location, it is CPU intensive and time-consuming, resulting in slower performance.
> - The old array is garbage collected.
> - The capacity of the array is increased by 50% of the old capacity using the ensureCapacity() method.
> - The default capacity of the array is 10.


**Advantages:**
> - It is better than the array because it can grow and shrink dynamically.
> - It is easy to use because it provides many inbuilt methods.
> - It is a better choice than the array because it can store the elements of different types.

**Disadvantages:**
> - It is slower than the array because it is a part of the collection framework.
> - It is not type-safe. It can store any type of elements.
> - It is not synchronized. It is not thread-safe and not suitable for multi-threaded environments.
> - It is not suitable for large amounts of data or for searching and sorting.
> - It is not suitable for memory management & performance.

**ArrayList Declaration:**

```java
import java.util.ArrayList;

ArrayList<Integer> list = new ArrayList<Integer>();  // ArrayList doesn't work with primitive types, so we use wrapper classes.
ArrayList<String> list = new ArrayList<String>();  // ArrayList of String type.
ArrayList list = new ArrayList();  // ArrayList of Object type.
```

**ArrayList Methods:**
> - add(): It is used to add an element to the ArrayList.
> - add(index, element): It is used to add an element at a specified position in the ArrayList.
> - addAll(): It is used to add all the elements of a specified collection to the ArrayList.
> - addAll(index, collection): It is used to add all the elements of a specified collection to the ArrayList at a specified position.
> - remove(): It is used to remove the element at a specified position in the ArrayList.
> - remove(object): It is used to remove the first occurrence of a specified element from the ArrayList.
> - removeAll(): It is used to remove all the elements of a specified collection from the ArrayList.
> - removeIf(): It is used to remove all the elements of the ArrayList that satisfy the specified predicate.
> - retainAll(): It is used to retain all the elements of the ArrayList that are present in the specified collection.
> - removeRange(): It is used to remove all the elements of the ArrayList within the specified range.
> - get(): It is used to get the element of a specified position in the ArrayList.
> - set(): It is used to replace an element at a specified position in the ArrayList.
> - clear(): It is used to remove all the elements from the ArrayList.
> - size(): It is used to get the number of elements in the ArrayList.
> - contains(): It is used to check whether an element is present in the ArrayList or not.
> - isEmpty(): It is used to check whether the ArrayList is empty or not.

Example:
```java
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arrlist = new ArrayList<Integer>();      // Creating an ArrayList of Integer type.
        arrlist.add(14);                            // Adding elements to the ArrayList.
        arrlist.add(7);                         // Adding elements to the ArrayList.
        System.out.println(arrlist);                // Printing the ArrayList.
        
        arrlist.add(0, 39);                     // Adding an element at a specified position in the ArrayList.
        System.out.println(arrlist);            // Printing the ArrayList.
        
        arrlist.add(1, 40);
        System.out.println(arrlist);
        
        arrlist.add(2, 41);
        System.out.println(arrlist);
        
        System.out.println(arrlist.size());     // Printing the number of elements in the ArrayList.
        
        System.out.println(arrlist.ensureCapacity(20));             // Increasing the capacity of the ArrayList.
        
        arrlist.addAll(3, arrlist);             // Adding all the elements of the ArrayList to the ArrayList at a specified position.
        System.out.println(arrlist);
        
        arrlist.remove(3);              // Removing the element at a specified position in the ArrayList.
        System.out.println(arrlist);
        
        System.out.println(arrlist.trimToSize());       // Trimming the capacity of the ArrayList to the number of elements it contains.
        
        arrlist.remove(new Integer(14));            // Removing the first occurrence of a specified element from the ArrayList.
        System.out.println(arrlist);

        System.out.println(arrlist.removeAll(arrlist));             // Removing all the elements of the ArrayList from the ArrayList.
        
        System.out.println(arrlist.isEmpty());          // Checking whether the ArrayList is empty or not.
    }
}
```
Output
```
[14, 7]
[39, 14, 7]
[39, 40, 14, 7]
[39, 40, 41, 14, 7]
5                                           // Number of elements in the ArrayList.
true                                     // Increasing the capacity of the ArrayList.
[39, 40, 41, 39, 40, 41, 14, 7]         // Adding all the elements of the ArrayList to the ArrayList at a specified position.
[39, 40, 41, 40, 41, 14, 7]               // Removing the element at a specified position in the ArrayList.
null                            // Trimming the capacity of the ArrayList to the number of elements it contains.
[40, 41, 40, 41, 14, 7]             // Removing the first occurrence of a specified element from the ArrayList.
true                    // Removing all the elements of the ArrayList from the ArrayList.
true                    // Checking whether the ArrayList is empty or not.
```


> - clear(): It is used to remove all the elements from the ArrayList.
> - size(): It is used to get the number of elements in the ArrayList.
> - contains(): It is used to check whether an element is present in the ArrayList or not.
> - isEmpty(): It is used to check whether the ArrayList is empty or not.
> - clone(): It is used to create a shallow copy of the ArrayList.
> - toArray(): It is used to convert the ArrayList to an array.
> - trimToSize(): It is used to trim the capacity of the ArrayList to the number of elements it contains.
> - ensureCapacity(): It is used to increase the capacity of the ArrayList.
> - indexOf(): It is used to get the index of the first occurrence of an element in the ArrayList.
> - lastIndexOf(): It is used to get the index of the last occurrence of an element in the ArrayList.
> - subList(): It is used to get a portion of the ArrayList.
> - sort(): It is used to sort the elements of the ArrayList.


