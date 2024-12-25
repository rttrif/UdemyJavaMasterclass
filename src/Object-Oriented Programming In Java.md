
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




