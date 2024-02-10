**ARRAYLIST:**
-
> It is an implementation of List interface. It is a resizable array, which can be found in the java.util package.
It is similar to the array, but it can change its size. It is a part of Java's collection framework.
It uses a dynamic array for storing the elements. It is a generic class.

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
ArrayList<String> list = new ArrayList<String>();
```
