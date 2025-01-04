
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
___
#### `this` vs `super`
The keyword `super` is used to access or **call the parent class members** (both variables and methods).

The keyword `this` is used to **call the current class members** (both variables and methods).
this is required when we have a parameter with the same name as an instance variable or field.

> **NOTE**: We can use either of these two keywords anywhere in a class except for static ]elements such as a static method. Any attempt to do so will lead to compile time errors.

![[Pasted image 20250103141435.png]]
![[Pasted image 20250103141453.png]]
In Java, we've got the `this()` and `super()` calls.  Notice the parentheses. These are known as calls since they look like regular method calls although we're calling certain constructors. Use `this()` to call a constructor from another overloaded constructor in the same class. The call to `this()` can only be used in a constructor, and it must be the first statement in a constructor. It's used with constructor chaining, in other words, when one constructor calls another constructor, and it helps to reduce duplicated code. 

The only way to call a parent constructor is by calling `super()`, which calls the parent constructor. The Java compiler puts a default call to `super()` if we don't add it, and it's always a call to the no argument constructor, which is inserted by the compiler. The call to `super()` must be the first statement in each constructor. A constructor can have a call to `super()` or `this()`, but never both.
___
#### Method Overriding vs Overloading
> **Method overloading** means providing two or more separate methods in a class with the **same name** but **different parameters**. 

Method return type may or may not be different, and that allows us to reuse the same method name. **Overloading** is very handy, it reduces duplicated code, and we don't have to remember multiple method names. We can overload static or instance methods.

To the code calling an overloaded method, it looks like a single method can be called with different sets of arguments. In actuality, each call that's made with a different set of arguments is calling a separate method. Java developers often refer to method overloading, as compile-time polymorphism. This means the compiler is determining the right method to call, based on the method name and argument list.

**Usually overloading happens within a single class.** But methods can also be overloaded by subclasses. That's because a subclass inherits one version of the method from the parent class, and then the subclass can have another overloaded version of that method.

**Methods will be considered overloaded if both methods follow the following rules:**
- Methods must have the **same method name**.
- Methods must have **different parameters**.
If methods follow the rules above:
- They may or may not have different return types.
- They may or may not have different access modifiers.
- They may or may not throw different checked or unchecked exceptions. 

> **Method overriding**, means defining a method in a child class that already exists in the parent class, **with the same signature (the same name, same parameters)**.

By extending the parent class, the child class gets all the methods defined in the parent class. Those methods are also known as derived methods. **Method overriding** is also known as **Runtime Polymorphism** or **Dynamic Method Dispatch** because the method that is going to be called is decided at runtime by the Java virtual machine.

When we **override** a method, it's recommended to put `@Override` immediately above the method definition. The `@Override` statement is not required, but it's a way to get the compiler to flag an error if you don't actually properly override this method. We'll get an error if we don't follow the overriding rules correctly.

**We can't override static methods, only instance methods can be overridden.**

**A method will be considered overridden if we follow these rules.**
- It must have the same name and same arguments.
- The return type can be a subclass of the return type in the parent class.
- It can't have a lower access modifier. In other words, it can't have more restrictive access privileges. For example, if the parent's method is protected, then using private in the child's overridden method is not allowed.  However, using public for the child's method would be allowed, in this example.
- Only **inherited methods can be overridden**, in other words, methods can be overridden only in child classes.
- Constructors and private methods cannot be overridden.
- Methods that are `final` cannot be overridden.
- A subclass can use `super.methodName()` to call the superclass version of an overridden method.
![[Pasted image 20250103144445.png]]
![[Pasted image 20250103144513.png]]
___
## Composition
Inheritance defines an **IS A** relationship.    
Composition defines a **HAS A** relationship.

> **Composition is actually modeling parts, and those parts make up a greater whole.** Composition is a way to make the combination of classes act like a single coherent object.

As a general rule, when you're designing your programs in Java, you probably want to look at composition first. Most of the experts will tell you that as a rule, look at using composition before implementing inheritance.

The reasons composition is preferred over inheritance:
- Composition is more flexible. You can add parts in or remove them, and these changes are less likely to have a downstream effect.
- Composition provides functional reuse outside of the class hierarchy, meaning classes can share attributes & behavior, by having similar components, instead of inheriting functionality from a parent or base class.
- Java's inheritance breaks encapsulation because subclasses may need direct access to a parent's state or behavior.

Inheritance is less flexible. Adding a class to or removing a class from a class hierarchy may impact all subclasses from that point. In addition, a new subclass may not need all the functionality or attributes of its parent class.

