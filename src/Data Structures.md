____
## Arrays 

>[!note] An array is a data structure that allows you to store a sequence of values, all of the same type.

Elements in an array are indexed, starting at 0.
![[Pasted image 20250128093938.png]]
**Declaring an Array:**
- When you declare an array, you first specify the type of the elements you want in the array.
- Then you include square brackets in the declaration, which is the key for Java to identify the variable as an array.
- The square brackets can follow the type as shown in the first two examples.  
- You can also put the square brackets after the variable name as shown in the last example.
- The first approach is much more common.
- **Note that you don't specify a size in the array declaration itself.**
- 
  ```java
  int[] integerArray;
  String[] nameList;
  String courseList[];
	```
**Instantiating an Array**
One way to instantiate the array is with the new keyword, similar to what we've seen when creating instances of classes.
```java
int[] integerArray = new int[];
```
An array instantiation doesn't have a set of parentheses, meaning we can't pass data to a constructor for an array. Using parentheses with an array instantiation gives you a compiler error.
```java
// Invalid Array Creation – Compile Error because of ()
int[] integerArray = new int[]();
```

>[!tip] **An Array is NOT Resizable.**
>The size of an array, once created, is fixed. You can't change the size of an array after the array is instantiated. You can't add or delete elements. You can only assign values to one of the ten elements in this array.





