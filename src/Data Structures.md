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

**What is an array, really?**
> An array is a special class in Java. The array, like all other classes, ultimately inherits from `java.lang.Object`.

**Array initialization and default element values**
- When you don't use an array initializer statement, all array elements get initialized to the default value for that type.
- For **primitive types**, this is **zero** for any kind of numeric primitive, like int, double, or short.
- For **booleans**, the default value will be **false**.
- For **any class type**, the elements will be initialized to **null**.
___
#### Algorithms for searching and matching elements in arrays.
**Searching Sequentially**
I think you can probably imagine that if you were going to start writing code to do this, you might start looping from the first to the last element of an array, checking each element to see if it matches a value that you're looking for.

If you find a match, you'd stop looping and return that a match was found, either with the position you found the element at or just a boolean value: true if it was found, and false if not.

This is called **a linear** or **sequential search** because you're stepping through the elements one after another.

If your elements are sorted, using this type of linear search is unnecessarily inefficient.

**Using intervals to Search**
You split each section up, testing the values at the boundaries, and based on that, split again into smaller sections, narrowing the number of elements to test each time.

This type of searching in software is called **interval searching**.

Within these two categories, sequential and interval, there are numerous existing algorithms.

One of the most common interval searches is the **binary search**, which is why Java provides this search on so many of its collection classes.

In this search, **intervals** are continually **split into two**, hence the word binary.

**`Arrays.binarySearch`**
The static method, `binarySearch`, is in the Arrays class.

We can use this method to test if a value is already in our array, but there are some **important** things to remember.
- First, the array has to be **sorted**.
- Second, if there are duplicate values in the array, there's no guarantee which one it'll match on.
- Finally, elements must be comparable. Trying to compare instances of different types will lead to errors and invalid results.

**This method returns:**
- **The position of a match**, if found.
- It returns a **-1** when no match was found.
- It's important to remember that a positive number **may not be the position of the first match.**
- If your array has duplicate values and you need to find the first element, other methods should be used.
___
#### Reference Types vs. Value Types
When you assign an object to a variable, the variable becomes a reference to that object. This is true of arrays, but the array has yet another level of indirection if it's an array of objects. **This means every array element is also a reference.**

