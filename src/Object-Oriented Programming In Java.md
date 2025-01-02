
___
## Inheritance

___

**Object-Oriented Programming** is a way to model real-world objects as software objects which contain both data and code.
 
 **Class-based programming** starts with classes which become the blueprints for objects.
 
Real-world objects have two major components:
- state.
- behavior.

State, in terms of a **computer object**, might be:
- The amount of RAM it has.
- The operating system it's running.
- The hard drive size.
- The size of the monitor.

These are characteristics about the item that can describe it.

- Behavior, for a computer, might be things like:
- Booting up.
- Shutting down.
- Beeping or outputting some form of sound.
- Drawing something on the screen, and so on.

All of these could be described as behaviors for a computer.

Modelling real-world objects as software objects is a fundamental part of Object-Oriented Programming. A software object stores its state in fields, which can also be called variables or attributes. Objects expose their behavior with methods.

___
#### The class as the blueprint

The class describes the **data (fields)**, and the **behavior (methods)**, that are relevant to the real-world object we want to describe. These are called class members. A class member can be a field or a method, or some other type of dependent element.

> - **If a field is static**, there is only one copy in memory, and this value is associated with the class or template itself. 
> - If a field is not static, it's called **an instance field**, and each object may have a different value stored for this field.
>  - **A static method can't be dependent on any one object's state**, so it can't reference any instance members. In other words, *any method that operates on instance fields needs to be non-static*.
![[Pasted image 20241223181559.png]]

___

Classes can be organized into logical groupings which are called **packages**.  You declare a package name in the class using the package statement. If you don't declare a package, the class implicitly belongs to the default package.

___
#### Access modifiers for the class

A class is said to be a top-level class if it is defined in the source code file and not enclosed in the code block of another class, type, or method.

> A top-level class has only two valid access modifier options: `public` or `none`.
>  `public` - means any other class in any package can access this class.
>  `none`  - when the modifier is omitted, this has special meaning, **called package access**, meaning the class is accessible only to classes in the same package.

___

#### Access modifiers for class members

An access modifier at the member level allows granular control over class members.
The valid access modifiers are shown in this table from the least restrictive to the most restrictive.

- `public` means any other class in any package can access this class.
- `protected` allows classes in the same package, and any subclasses in other packages, to have access to the member.
- When the modifier is omitted, this has special meaning, called package access, meaning the member is accessible only to classes in the same package
- `private` means that no other class can access this member

___

**Encapsulation** in Object-Oriented Programming usually has two meanings. One is the bundling of behavior and attributes on a single object. The other is the practice of hiding fields and some methods from public access.

___

`null` is a special keyword in Java, meaning, **the variable or attribute has a type but no reference to an object.** This means that no instance or object is assigned to the variable or field. Fields with primitive data types are never `null`.

Fields on classes are assigned default values automatically by Java, if you don't assign values yourself.

___
#### What are getters and setters?
- **A getter** is a method on a class that retrieves the value of a private field and returns it.  
- **A setter** is a method on a class that sets the value of a private field.   
- **The purpose of these methods is to control and protect access to private fields.**
___
#### this 
`this` is a special reference name for the object or instance, which it can use to describe itself. And we can use this to access fields on the class.
___
#### Constructor
A **constructor** is used in the creation of an object. It is a special type of code block that has a specific name and parameters, much like a method. It has the same name as the class itself, and it doesn't return any values.  You never include a return type from a constructor, not even void. You can, and should, specify an appropriate access modifier to control who should be able to create new instances of the class, using this constructor.

```java
public class Account { // This is the class declaration

	public Account() { // This is  the constractor declaration
		// Constructor code is code tobe execute as the object is created.
	}
}
```

**The default constructor**
If a class contains no constructor declarations, then a default constructor is implicitly declared. This constructor has no parameters and is often called the no-args (no arguments) constructor. If a class contains any other constructor declarations, then a default constructor is NOT implicitly declared.

**Constructor overloading**
Constructor overloading is declaring multiple constructors with different parameters. The number of parameters can be different between constructors. Or if the number of parameters is the same between two constructors, their types, or order of the types must differ.

**Constructor chaining with `this()`**
Constructor chaining is when one constructor explicitly calls another overloaded constructor. You can only use constructor chaining, within constructors. You must use the special statement `this()` to execute another constructor, passing it arguments if required.
And `this()` must be the first executable statement if it's used from another constructor.
___
#### Object vs Instance vs Class
![[Pasted image 20241228200109.png]]
___
#### Static vs Instance Variables

**Static Variables**
- Declared by using the keyword `static`.
- Static variables are also known as static member variables.
- Every instance of the class shares the same static variable.
- If changes are made to that variable, all other instances of that class will see the effect of that change.

**Instance Variables**
- They **don't use** the `static` keyword.
- They're also known as fields or member variables.
- Instance variables belong to a specific instance of a class.
- Each instance has its own copy of an instance variable.
- Every instance can have a different value.
- Instance variables represent the state of a specific instance of a class.

*Instance Variables == fields == member variables*
___
#### Static vs. Instance Methods

**Static Methods**
- Static methods are declared using a static modifier.
- Static methods can't access instance methods and instant variables directly.
- They're usually used for operations that don't require any data from an instance of the class (from `this`).
- Inside a static method, we can't use the `this` keyword.

#### Instance Methods
- Instance methods belong to an instance of a class.
- To use an instance method, we have to instantiate the class first, usually by using the new keyword.
- Instance methods can access instance methods and instance variables directly.
- Instance methods can also access static methods and static variables directly.
![[Pasted image 20241228201805.png]]
___
#### Plain Old Java Object
**A plain old Java object** (whose acronym is **POJO**) is a class that generally only has instance fields. It's used to house data and pass data between functional classes. It usually has no other, or very few methods, other than getters and setters for the instance fields.

A POJO also might be called a bean or a **JavaBean**.  A JavaBean is just a POJO with some extra rules applied to it. 

A POJO is sometimes called an **Entity** because it mirrors database entities.  

Another acronym is **DTO for Data Transfer Object**. It's a description of an object that can be modeled as just data.
___
#### Annotation
Annotations are a type of metadata. Metadata is a way to formally describe additional information about our code. Annotations are more structured and have more meaning than comments. This is because they can be used by the compiler or other types of pre-processing functions, to get information about the code. Metadata doesn't affect how the code runs so this code will still run with or without the annotation.
___
#### The Record type
The record is a special class that contains data that's not meant to be altered. In other words, it seeks to achieve immutability for the data in its members. It contains only the most fundamental methods, such as constructors and accessors.

```java
public record LPAStudent(String id, String name, String date, String classList){}
```

The record header consists of record components, a comma-delimited list of components.
For each component in the header, Java generates:
- A field with the same name and declared type as the record component.
- The field is declared private and final.
-  The field is sometimes referred to as a component field.

Java generates a toString method that prints out each attribute in a formatted String. In addition to creating a private final field for each component, Java generates a public accessor method for each component. This method has the same name and type of the component, but it doesn't have any kind of special prefix like get or is, for example.

**Why is the record built to be immutable?**
There are more use cases for immutable data transfer objects and keeping them well encapsulated. You want to protect the data from unintended mutations.
___
### Inheritance
___
***Inheritance*** - It's a way to **organize classes into a parent-child hierarchy**, which lets the child inherit (reuse), fields and methods from its parent.
![[Pasted image 20241231125405.png]]
![[Pasted image 20241231125503.png]]
![[Pasted image 20241231125535.png]]

**`extends`**
Using extends specifies the superclass (or the parent class) of the class we're declaring. A class can specify one and only one class in its extends clause. 

**`super()`**
`super()` is a lot like `this()`. It's a way to call a constructor on the super class directly from the sub class's constructor. Like `this()`, it has to be the first statement of the constructor. Because of that rule, `this()` and `super()` can never be called from the same constructor.

If you don't make a call to `super()`, then Java makes it for you using super's default constructor.  If your super class doesn't have a default constructor, then you must explicitly call `super()` in all of your constructors, passing the right arguments to that constructor.

All subclasses can execute methods even though the code is declared on the parent class. The code doesn't have to be duplicated in each subclass. We can use code from the parent. Or we can change that code for the subclass.

**Overriding** a method is when you create a method on a subclass, which has the same signature as a method on a super class. You override a parent class method when you want the child class to show different behavior for that method.

**The overridden method can do one of three things:** 
- It can implement completely different behavior, overriding the behavior of the parent.
- It can simply call the parent class's method, which is somewhat redundant to do.
- Or the method can call the parent class's method and include other code to run so it can extend the functionality for the Dog, for that behavior.

**Polymorphism** simply means "many forms".
And as you've seen, some advantages of Polymorphism are:
- It makes code simpler.
- It encourages code extensibility.
___
#### java.lang.Object
This is because every class you create in Java actually extends a special Java class.   That class is named Object, and it's in the `java.lang` package.
![[Pasted image 20250102172406.png]]
