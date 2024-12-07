# First Steps

- Use `jshell`
- `System.out.print("Hello World!")`
- STATEMENT - It's a complete command to be executed. It can include one or more expressions.
-

## Variables

- **A keyword** is any one of a number of reserved words, that have a predefined meaning in the Java language.
- **Variables** are a way to store information in our computer. Variables that we define in a program, can be accessed by a name we give them, and the computer does the hard work, of figuring out where they get stored, in the computer's random access memory, or RAM.
- **A declaration statement** is used to define a variable by indicating the data type, and the name, then optionally to set the variable to a specific value.
- By declaring a variable again, we are effectively re-declaring a variable, and in normal Java programming, that would not be allowed, and would throw an error.
- **An expression** is a coding construct, that evaluates to a single value.
- Java **operators**, or just operators, perform an operation (hence the term) on a variable or value.

## Primitive Types

- In Java, primitive types are the most basic data type
  - **byte**:  with = 8  bits
  - **short**: with = 16 bits
  - **int**:   with = 32 bits
  - **long**:  with = 64 bits
  - float
  - double
  - char
  - boolean
- These types as the building blocks of data manipulation
- Primitive data types are simply placeholders in memory for a value

The plus sign, +,  when used in System.out.print will print different data types together as a single line of text. Whatever follows the plus sign in `System.out.print` here, is converted to a String by Java, and concatenated to the String before it.

`System.out.println("myFirstNumber value = " + myFirstNumber);`

- A class is a building block for object-oriented programming, and allows us to build custom data types.
- Java uses the concept of a wrapper class, for all of its eight primitive data types. A **wrapper class provides simple operations**, as well as some basic information about the primitive data type, which cannot be stored on the primitive itself.

> In Java, **overflow** and **underflow** refer to situations where a numerical computation exceeds the range of values that a data type can represent.

- **Size, or Width**, is the amount of space that determines (or limits) the range of values
- Java allows certain numeric literals to have a suffix appended to the value, to force it to be a different data type from the default type. The long is one of these types and it's suffix is an `'L'`.

#### Rules for declaring multiple variables in one statement

- You cannot declare variables with different data types in a single statement.
- If you declare multiple variables of the same data type in a single statement, you must specify the data type only once before any variable names.


**Casting means** to treat or convert a number, from one type to another. We put the type we want the number to be, in parentheses

```ja
(byte) (myMinByteValue / 2);
```
