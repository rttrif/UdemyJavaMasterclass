
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
___
## Encapsulation

> In Java, encapsulation means hiding things by making them private or inaccessible.

Why would we want to hide things in Java?
- To make the interface simpler, we may want to hide unnecessary details.
- To protect the integrity of data on an object, we may hide or restrict access to some of the data and operations.
- To decouple the published interface from the internal details of the class, we may hide actual names and types of class members.

**Benefits of Encapsulation**
That's really one of the huge benefits of encapsulation. Changes made do not affect any other code. It's like a black box in many ways.

**Encapsulation Principles**
- Create constructors for object initialization, which enforces that only objects with valid data will get created.
- Use the private access modifier for your fields.
- Use setter methods sparingly and only as needed.
- Use access modifiers that aren't private, only for the methods that the calling code needs to use.
___
## Polymorphism

> Simply stated, polymorphism means many forms.

Polymorphism in Java allows us to write code that can call a method, but the actual method that gets executed can be different for different objects at runtime. **This means that the behavior that occurs during program execution depends on the runtime type of the object, which might differ from its declared type in the code**. 
For polymorphism to work, the declared type must have a relationship with the runtime type. Inheritance is one way to establish this relationship, where a subclass can override a method from its superclass, enabling polymorphic behavior.
Polymorphism enables you to write generic code based on the base class or a parent class. And this code in the main method is extendable, meaning, it doesn't have to change as new subclasses become available.
___
#### Variable Type Inference
`var` is a special contextual keyword in Java that lets our code take advantage of Local Variable Type Inference. By using var as the type, we're telling Java to figure out the compile-time type for us.

**Local Variable Type Inference (LVTI)**
One of the benefits is to help with readability of code. Another is to reduce boilerplate code.
It's called Local Variable Type Inference for a reason, because:
- It can't be used in field declarations on a class.
- It can't be used in method signatures, either as a parameter type or a return type.
- It can't be used without an assignment because the type can't be inferred in that case.
- It can't be assigned a null literal, again, because a type can't be inferred in that case.

**Run Time vs. Compile Time Typing**
You can think of the compile time type as the declared type. This type is declared as a variable reference, a method return type, or a method parameter, for example.
In the case of Local Variable Type Inference (LVTI), we don’t explicitly declare a type for the compiled reference type. Instead, it gets inferred by the compiler, but the byte code generated is the same as if we had declared the type.
In many cases, the compile time type is the declared type to the left of the assignment operator.
What is returned on the right side of the assignment operator from whatever expression or method is executed, sometimes can only be determined at runtime, when the code is executing conditionally through the statements in the code.
You can assign a runtime instance to a different compile time type, only if certain rules are followed.
We can assign an instance to a variable of the same type, or a parent type, or a parent's parent type, including java.lang.Object, the ultimate base class.

The `instanceof` operator lets you test the type of an object or instance. The reference variable you are testing is the left operand. The type you are testing for is the right operand. If the JVM can identify that an object matches the type, it can extract data from the object without casting.
___
#### Organizing Java Classes
**A package is a namespace that organizes a set of related types.** In general, a package corresponds to a folder or directory on the operating system, but this isn't a requirement. The package structure is hierarchical, meaning you group types in a tree-like fashion.
You can use any legal Java identifier for your package names, but common practice has **package names in all lowercase**.

> - Packages let us reuse common class names across different libraries or applications and provide a way to identify the correct class either with an import statement or a qualifying name.
> - Packages let us organize our classes by functionality or relationships.
> - Packages also let us encapsulate our classes from classes in other packages.
___
## Abstraction

**Generalization**
When you start modeling objects for your application, you start by identifying what features and behavior your objects have in common. We generalize when we create a class hierarchy.
A base class is the most general class, the most basic building block, which everything can be said to have in common.

**Abstraction**
Part of generalizing is using abstraction. You can generalize a set of characteristics and behavior into an abstract type. Abstraction simplifies the view of a set of items' traits and behavior, so we can talk about them as a group, as well as generalize their functionality.

**Java supports abstraction in several different ways.**
- Java allows us to create a class hierarchy, where the top of the hierarchy, the base class, is usually an abstract concept, whether it's an abstract class or not.
- Java lets us create abstract classes. 
- Java gives us a way to create interfaces.

**Abstract method**

> **An abstract method** **has a method signature, and a return type**, but doesn't have a method body. Because of this, we say an abstract method is **unimplemented**. Its purpose is to describe behavior, which any object of that type will always have. **You can think of an abstract method as a contract.** This contract promises that all subtypes will provide the promised functionality, with the agreed upon name and arguments.

**Concrete method**
A concrete method has a method body, usually with at least one statement. This means it has operational code, that gets executed, under the right conditions. A concrete method is said to **implement** an abstract method, if it overrides one. Abstract classes and interfaces can have a mix of abstract and concrete methods.

![[Pasted image 20250108224610.png]]

#### The abstract class
The abstract class is declared with the `abstract` modifier. **An abstract class is a class that's incomplete.** You can't create an instance of an abstract class. An abstract class can still have a constructor, which will be called by its subclasses during their construction.

```java
abstract class Animal {}
```
> **An abstract class's purpose is to define the behavior its subclasses are required to have, so it always participates in inheritance.** Classes extend abstract classes and can be concrete.

A class that extends an abstract class can also be abstract itself. And finally an abstract class can extend a concrete class.

#### The abstract method
An abstract method is declared with the modifier abstract.
```java
abstract class Animal {
	public abstract void move();
}
```
**Abstract methods can only be declared on an abstract class or interface.**

**Subclasses have choices when they extend a concrete class with concrete methods.**
- They can inherit the same behavior from their parent.  This means they don't have to even declare the methods in their class bodies.
- They can override the behavior from their parent.  This means they have a method with the same signature, but with their own code in there, ignoring the parent's code altogether.
- They can also override the behavior but leverage the parent's method code, by calling the parent's method, using super in their overridden code.

**An abstract class that extends another abstract class has some flexibility.**
- It can implement all of the parent's abstract methods.
- It can implement some of them.
- Or it can implement none of them.
- It can also include additional abstract methods, which will force subclasses to implement both Animal's abstract methods, as well as Mammal's.

**Why use an abstract class?**
In truth, you may never need to use an abstract class in your design, but there are some good arguments for using them.

An abstract class in your hierarchy forces the designers of subclasses to think about, and create unique and targeted implementations, for the abstracted methods.

It may not always make sense to provide a default, or inherited implementation of a particular method.

An abstract class can't be instantiated, so if you're using abstract classes to design a framework for implementation, this is definitely an advantage.
___
## Interfaces

**Interface vs. Abstract Class**

**An interface is similar to an abstract class, although it isn't a class at all.** It's a **special type**, that's more **like a contract between the class and client code**, that the compiler enforces. By declaring it's using an interface, your class must implement all the abstract methods on the interface. A class agrees to this because it wants to be **known by that type**, by the outside world or client code. **An interface lets classes that might have little else in common be recognized as a special reference type.**

**Declaring an interface**
```java
public interface FlightEnabled {}
```
An interface is usually named according to the set of behaviors it describes. Many interfaces will end in 'able', like Comparable, and Iterable. Meaning something is capable or can perform a given set of behaviors.

A class is associated to an interface by using the implements clause in the class declaration.
```java
public class Bird implements FlightEnabled {}

// Because of this declaration, we can use FlightEnabled as the reference type and assign it an instance of bird.

FlightEnabled flier = new Bird();
```

**A class can only extend a single class**, which is why Java supports only single inheritance.

However, **a class can implement many interfaces**, providing flexibility and modularity. This allows for the combination of different sets of behaviors, making interfaces a powerful feature. **A class can both extend another class and implement one or more interfaces.**

```java
public class Birds extends Animal implements FlightEnabled, Trackble {}
```

> [!note ] **The abstract modifier is implied on an interface**

![[Pasted image 20250113224254.png]]
>[!note] All members on an interface are implicitly public

- If you omit an access modifier on a **class member**, it's **implicitly package private**.
- If you omit an access modifier on an **interface member**, it's **implicitly public**.

**This is an important difference, and one you need to remember.**

Changing the access modifier of a method to **protected** on an interface, is **a compiler error**, whether the method is concrete or abstract. Only a concrete method can have private access.

**Interfaces let us take objects that may have almost nothing in common, and write reusable code so we can process them all in a similar manner.** **Interfaces allow us to type our objects differently, by behavior only.**
___
#### The `final` modifier in Java
**When we use the `final` modifier, we prevent any further modifications to that component.**
- a final method means it can't be overridden by a subclass.
- a final field means an object's field can't be reassigned or given a different value after its initialization.
- a final static field is a class field that can't be reassigned or given a different value after the class's initialization process.
- a final class can't be overridden, meaning no class can use it in the extends clause.
- a final variable in a block of code, means that once it's assigned a value any remaining code in the block can't change it.
- a final method parameter means we can't assign a different value to that parameter in the method code block.

> [!tip] The final static field, is what you're really creating, when you declare a field on an interface.

____
#### Constants in Java
**A constant in Java is a variable that can't be changed.**  A constant variable is a final variable of primitive type, or type String, that is initialized with a constant expression.
Constants in Java are usually named with all uppercase letters and with underscores between words. A static constant means we access it via the type name.

> [!tip] A field declared on an Interface is always public, static and final

___
#### Coding to an Interface
**Interfaces can be extended, similar to classes using the extends keyword.**

Both interfaces and abstract classes are **abstracted reference types**. Reference types can be used in code, as variable types, method parameters, return types, list types, and so on.
When you use an abstracted reference type, this is referred to as coding to an interface. This means your code doesn't use specific types, but rather, more generalized ones, usually an interface type.

This technique is preferred, because it allows many runtime instances of various classes to be processed uniformly by the same code. It also allows for substitutions of some other class or object that still implements the same interface, without forcing a major refactor of your code.

**Using interface types as the reference type is considered a best practice.** Coding to an interface scales well, to support new subtypes, and it helps when refactoring code.

___
#### The Interface Extension Method - the default method
An extension method is identified by the modifier default, so it's more commonly known as the default method.
This method is a **concrete** method, meaning it has a code block and we can add statements to it.  In fact, it has to have a method body, even if the body is just an empty set of curly braces. It's a lot like a method on a superclass because we can override it.  Adding a default method doesn't break any classes currently implementing the interface.

Just like overriding a method on a class, you have three choices when you override a default method on an interface.
- You can choose not to override it at all.
- You can override the method and write code for it, so that the interface method isn't executed.
- Or you can write your own code, and invoke the method on the interface, as part of your implementation.
___
#### public static methods on an interface
Static methods don't need to specify a public access modifier, because it's implied.

When you call a public static method on an interface, you must use the interface name as a qualifier.

JDK 9 gave us private methods, both static and not static. This enhancement primarily addresses the problem of re-use of code within concrete methods on an interface. A private static method can be accessed by either a public static method, a default method, or a private non-static method. A private non-static method is used to support default methods and other private methods.
___
#### Interface  vs Abstract Class

**Abstract Class**
- Abstract classes are very similar to interfaces.  You can't instantiate either of them.  Both types may contain a mix of methods declared with or without a method block.
- With abstract classes, you can declare fields that aren't static and final. Instance fields in other words.
- Also with abstract classes, you can use any of the four access modifiers for its concrete methods.
- You can also use all but the private access modifier for its abstract methods.
- An abstract class can extend only one parent class, but it can implement multiple interfaces.
- When an abstract class is subclassed, the subclass usually provides implementations for all of the abstract methods in its parent class.
- However, if it doesn't, then the subclass must also be declared abstract.

**Use an Abstract class when...**
- You want to share code among several closely related classes (Animal for example, with fields, name, age...).
- You expect classes that extend your abstract class to have many common methods or fields or require access modifiers other than public.
- You want to declare non-static or non-final fields (for example, name, age). This enables you to define methods that can access and modify the state of an object (getName, setName).
- You have a requirement for your base class to provide a default implementation of certain methods, but other methods should be open to being overridden by child classes.

> [!note] Summary: 
> An abstract class provides a common definition, as a base class, that multiple derived classes can share.

**Interface**
- An interface is just the declaration of methods, which you want some classes to have, it's not the implementation.
- In an interface, we define what kind of operation an object can perform.  These operations are defined by the classes that implement the interface.
- Interfaces form a contract between the class and the outside world, and this contract is enforced at build time by the Java compiler.
- You can't instantiate interfaces, but they may contain a mix of methods declared with or without an implementation. 
- All methods on interfaces declared without a method body, are automatically public and abstract.
- An interface can extend another interface.
- Interfaces are more flexible and can deal with a lot more stress on the design of your program, because they aren't part of the class hierarchy.
- A best practice way of coding, is commonly called Coding to an Interface.
- By introducing interfaces into your program, you're really introducing points of variation, at which you can plug in different implementations for that interface.
- Since Java 8, interfaces can now contain default methods. i.e. methods with implementation.  The keyword default is used mostly for backwards compatibility.  Public static methods were also introduced in Java 8.
- Since Java 9, an interface can also contain private methods, commonly used when default methods share common code.

> [!note] Summary: 
> The interface decouples the "what" from the "how", and is used to make different types behave in similar ways.

**Use an Interface when...**
- You expect that unrelated classes will implement your interface.  For example, two of Java's own interfaces, Comparable and Cloneable, can be implemented by many unrelated classes.
- You want to specify the behavior of a particular data type, but you're not concerned about who implements its behavior.
- You want to separate different behavior.
![[Pasted image 20250116211637.png]]
___
## Generics
Java supports generic types, such as classes, records and interfaces.  It also supports generic methods.

```java
// Regular class declaration 
class ITellYou {
	private String field;
}

// Generic class decalaration 
class YouTellYou<T> {
	private T field;
}
```
The thing to notice with the generic class, is that the class declaration has angle brackets with a T in them, directly after the class name. T is the placeholder for a type that will be specified later. This is called a type identifier, and it can be any letter or word, but T which is short for Type is most commonly used. *Using T is just a convention.*
**For the generic class, the field's type is that placeholder, just T, and this means it can be any type at all. The T in the angle brackets means it's the same type as the T, specified as the type of the field.**

**Using a generic class as a reference type**
![[Pasted image 20250117215229.png]]
In the declaration of a reference type that uses generics, the type parameter is declared in angle brackets. The reference type is `ArrayList`, the type parameter (or parameterized type) is `String`, which is declared in angle brackets, and `listOfString` is the variable name.

You can have more than one type parameter.
```java
class Team<T, S, U> {
	private String field;
}
```
A few letters are reserved for special use cases.
**The most commonly used type parameter identifiers are:**
- E for Element (used extensively by the Java Collections Framework).
- K for Key (used for mapped types).
- N for Number.
- T for Type.
- V for Value.
- S, U, V etc. for 2nd, 3rd, 4th types.

When you use generic classes, either referencing them or instantiating them, it's definitely recommended that you include a type parameter.

But you can still use them without specifying one.  This is called the Raw Use of the reference type.

The raw use of these classes is still available for backwards compatibility, but it's discouraged for several reasons.
- Generics allow the compiler to do compile-time type checking when adding and processing elements in the list.
- Generics simplify code, because we don't have to do our own type checking and casting, as we would if the type of our elements was Object
___
#### The Comparable Interface
For an array, we can simply call `Arrays.sort` and pass it an array, but as I've previously mentioned, the elements in the array need to implement Comparable.

Types like String or primitive wrapper classes like Integer or Character are sortable, and this is because they do actually implement this interface.
```java
public interface Comparable<T> {
	int compareTo(T o);
}
```
It's a generic type, meaning it's parameterized. Any class that implements this interface, needs to implement the `compareTo` method.
This method takes one object as an argument, as the letter o, and compares it to the current instance, shown as this.
The table on this slide shows what the results of the `compareTo` method should produce, when implemented.
![[Pasted image 20250124223200.png]]
___
#### The  Comparator Interface
The Comparator interface is similar to the Comparable interface, and the two can often be confused with each other.
Its declaration and primary abstract method are shown here, in comparison to Comparable.
Notice that the method names are different, compare vs. compareTo.

```java 
public interface Comparable<T> {
	int compareTo(T o);
}

public interface Comparabtor<T> {
	int compare (T o1, T o2);
}
```
The compare method takes two arguments vs. one for compareTo, meaning that it will compare the two arguments to one another and not one object to the instance itself.
![[Pasted image 20250125224327.png]]