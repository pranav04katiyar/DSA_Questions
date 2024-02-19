***Strings***

> Collection of characters. Strings are immutable. Once created, they cannot be changed/modified. 
```java
String str = "Hello";
```
> Java provides a `String` class to create and manipulate strings. The `String` class is a part of the `java.lang` package.
>
> Unicode is used to represent characters in the `String` class in Java.

> String objects are stored in the String pool. If a string is created using the `new` keyword, it is stored in the heap memory.
>
- > If there are multiple references to the same string, only one object is created in the String pool, and all the references point to the same object.
- > If a string is created using the `new` keyword, a new object is created in the heap memory, and a reference is created in the String pool.
- > If there's a change in the string, a new object is created in the heap memory, and a reference is created in the String pool.
- > When there's no reference to a string, it is garbage collected. Applicable to strings in the heap memory and the String pool.

> Character array is mutable but String is immutable.
> 
> The `String` class provides many methods to perform operations on strings such as `length()`, `concat()`, `equals()`, `compareTo()`, `indexOf()`, `substring()`, `toLowerCase()`, `toUpperCase()`, `trim()`, `replace()`, `split()`, `valueOf()`, `format()`, `intern()`, etc.

> **String Declaration:**
```java
String str = "Hello";  // String literal
String str = new String("Hello");  // Using the new keyword
```

> **String Methods:**
- `length()`: It is used to get the length of the string.
- `concat()`: It is used to concatenate two strings.
- `equals()`: It is used to compare two strings.
- `compareTo()`: It is used to compare two strings lexicographically.
- `indexOf()`: It is used to get the index of a specified character or substring.
- `substring()`: It is used to get a substring of the string.
- `toLowerCase()`: It is used to convert the string to lowercase.
- `toUpperCase()`: It is used to convert the string to uppercase.
- `trim()`: It is used to remove the leading and trailing spaces.
- `replace()`: It is used to replace a specified character or substring with another character or substring.
- `split()`: It is used to split the string into an array of strings.
- `valueOf()`: It is used to convert different types of values to strings.
- `format()`: It is used to format the string.
- `intern()`: It is used to return the string from the string pool, if it is present, otherwise it adds the string to the string pool and returns the reference.
- `charAt()`: It is used to get the character at a specified index.
- `codePointAt()`: It is used to get the Unicode value of the character at a specified index.
- `codePointBefore()`: It is used to get the Unicode value of the character before a specified index.
- `codePointCount()`: It is used to get the number of Unicode values between two specified indexes.
- `compareToIgnoreCase()`: It is used to compare two strings lexicographically, ignoring the case.
- `contentEquals()`: It is used to compare the content of a specified string buffer or string builder with the string.
- `endsWith()`: It is used to check whether the string ends with a specified suffix.
- `equalsIgnoreCase()`: It is used to compare two strings, ignoring the case.
- `isEmpty()`: It is used to check whether the string is empty or not.
- `matches()`: It is used to check whether the string matches a specified regular expression.

**Difference between == and equals() method:**
- `==` is used to compare the reference of the objects: Whether the references of the objects are pointing to the same address or not.
- `equals()` is used to compare the content of the objects: Whether the content of the objects is the same or not.

Example:
```java
String str1 = "Hello";
String str2 = "Hello";
String str3 = new String("Hello");
String str4 = new String("Hello");

System.out.println(str1 == str2);  // true: Both the references are pointing to the same object in the String pool.
System.out.println(str1.equals(str2));  // true: Both the strings have the same content.
System.out.println(str1 == str3);  // false: Both the references are pointing to different objects in the String pool and the heap memory.
System.out.println(str1.equals(str3));  // true: Both the strings have the same content.
System.out.println(str3 == str4);  // false: Both the references are pointing to different objects in the heap memory.
System.out.println(str3.equals(str4));  // true: Both the strings have the same content.
```