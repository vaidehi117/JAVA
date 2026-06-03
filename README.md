# JAVA

# Lesson 1
1. class (Blueprint)

A class is like a template or blueprint used to create objects.

It defines:
- Variables (data / properties)
- Methods (functions / behavior)

2. object (Instance of a Class)

An object is a real instance created from a class.

- It represents a real-world entity
- Each object can have different values

3. new (Object Creation Keyword)

The new keyword is used to create an object from a class.

- It allocates memory
- Calls the constructor

# Lesson 2 

## Introduction

In this lesson, we learned the fundamentals of Object-Oriented Programming (OOP) in Java, including:

* Classes
* Objects
* Constructors
* Constructor Overloading
* Methods
* Inheritance

These concepts help organize code and model real-world entities.

---

# Class

## What is a Class?

A class is a blueprint used to create objects.

It defines:

* Variables (attributes)
* Methods (behaviors)

A class itself does not store data until an object is created from it.

---

# Object

## What is an Object?

An object is an instance of a class.

Objects:

* Store actual data
* Access class methods
* Represent real-world entities

Multiple objects can be created from the same class, each with different values.

---

# Instance Variables

## What are Instance Variables?

Instance variables are variables declared inside a class but outside methods.

They:

* Store object-specific data
* Have separate values for each object

Examples:

* Name
* Age
* Salary
* Brand

---

# Constructors

## What is a Constructor?

A constructor is a special method that runs automatically when an object is created.

Features:

* Has the same name as the class
* Does not have a return type
* Used to initialize object data

---

## Default Constructor

A default constructor assigns predefined values to object variables.

Benefits:

* Initializes objects automatically
* Reduces repetitive code

---

## Parameterized Constructor

A parameterized constructor accepts values as arguments during object creation.

Benefits:

* Allows custom initialization
* Makes objects more flexible

---

# Constructor Overloading

## What is Constructor Overloading?

Constructor overloading occurs when a class contains multiple constructors with different parameter lists.

Benefits:

* Provides multiple ways to create objects
* Improves flexibility and usability

---

# Methods

## What are Methods?

Methods define actions that an object can perform.

Benefits:

* Improve code organization
* Enable code reuse
* Allow objects to perform specific tasks

---

# Multiple Objects

## Creating Multiple Objects

A class can create many objects.

Each object:

* Has its own data
* Uses the same class structure
* Operates independently

This demonstrates the reusability of classes.

---

# Method Naming Across Classes

Different classes can contain methods with the same name.

Each class defines its own implementation of the method, allowing different behaviors for different objects.

---

# Inheritance

## What is Inheritance?

Inheritance allows one class to acquire properties and methods from another class.

The class that inherits is called the child class.

The class being inherited from is called the parent class.

---

## Benefits of Inheritance

* Code reuse
* Reduced duplication
* Easier maintenance
* Better organization of related classes

---

# Key OOP Concepts Learned

### Class

Blueprint for creating objects.

### Object

Instance of a class containing actual data.

### Constructor

Special method used to initialize objects.

### Constructor Overloading

Using multiple constructors in the same class.

### Method

Defines behavior of an object.

### Inheritance

Allows one class to reuse features of another class.

---
# Lesson 7 

## Introduction

In this lesson, we learned about important collection classes in Java:

* LinkedList
* Queue
* Vector

These collections are part of the Java Collection Framework and help store and manage multiple elements dynamically.

---

# LinkedList

## What is a LinkedList?

A LinkedList is a dynamic data structure in Java used to store multiple elements.

Unlike arrays, elements are connected using links instead of continuous memory locations.

It is part of the `java.util` package.

---

## Features of LinkedList

* Dynamic size
* Maintains insertion order
* Allows duplicate values
* Fast insertion and deletion
* Stores elements in nodes

---

## How LinkedList Works

Each element in a LinkedList is called a node.

Every node contains:

* Data
* Reference to the next node

This creates a chain-like structure.

---

## Common Operations in LinkedList

### Adding Elements

Elements can be inserted into the list.

### Accessing Elements

Elements can be accessed using indexes.

### Finding Size

The total number of elements can be checked.

---

## Advantages of LinkedList

* Easy insertion and deletion
* Dynamic memory allocation
* No fixed size required

---

## Disadvantages of LinkedList

* Slower access compared to arrays
* Extra memory needed for links

---

## Real-Life Example of LinkedList

A train:

* Each coach is connected to the next coach
* Coaches can be added or removed easily

---

# Queue

## What is a Queue?

A Queue is a data structure that follows:

FIFO Principle
(First In, First Out)

The first element added is the first one removed.

---

## Features of Queue

* Maintains insertion order
* Processes elements sequentially
* Useful for scheduling and waiting systems

---

## Important Queue Operations

### Offer

Adds an element to the queue.

### Peek

Views the first element without removing it.

### Poll

Removes the first element from the queue.

---

## FIFO Principle Example

Imagine people standing in a line:

* The first person in line is served first.
* This is how Queue works.

---

## Real-Life Uses of Queue

* Ticket booking systems
* Printer jobs
* Customer service systems
* Task scheduling

---

# Vector

## What is a Vector?

A Vector is a dynamic array class in Java.

It automatically increases its size when elements are added.

---

## Features of Vector

* Dynamic resizing
* Maintains insertion order
* Allows duplicate values
* Synchronized and thread-safe

---

## Synchronization in Vector

Vector is synchronized, meaning:

* Multiple threads can access it safely
* Prevents data inconsistency

Because of synchronization, Vector is slower than ArrayList.

---

## Common Operations in Vector

### Adding Elements

Elements can be inserted dynamically.

### Accessing Elements

Elements are retrieved using indexes.

### Checking Size

Returns the number of stored elements.

### Inserting at Specific Position

Elements can be added at a chosen index.

---

## Advantages of Vector

* Thread-safe
* Dynamic size
* Easy element management

---

## Disadvantages of Vector

* Slower performance
* Higher overhead because of synchronization

---

## Real-Life Example of Vector

A dynamic contact list:

* Contacts can be added anytime
* Size grows automatically
* Multiple users can safely access data

---

# Difference Between LinkedList, Queue, and Vector

| LinkedList               | Queue                     | Vector                        |
| ------------------------ | ------------------------- | ----------------------------- |
| Stores elements in nodes | FIFO structure            | Dynamic array                 |
| Fast insertion/deletion  | First In First Out        | Thread-safe collection        |
| Can act as list or queue | Used for processing order | Synchronized collection       |
| Dynamic size             | Sequential processing     | Slower due to synchronization |

---

# Packages Used

These classes belong to the `java.util` package.

Examples:

* java.util.LinkedList
* java.util.Queue
* java.util.Vector

---

# Lesson 8 

## Introduction

In this lesson, we learned about two important classes from the Java Collection Framework:

* Vector
* Stack

Both classes are used to store multiple values dynamically, meaning their size can grow or shrink during program execution.

---

# Vector

## What is a Vector?

A Vector is a dynamic array in Java.

Unlike normal arrays, a Vector can automatically increase its size when new elements are added.

It is part of the `java.util` package.

---

## Features of Vector

* Stores multiple elements
* Maintains insertion order
* Allows duplicate values
* Can store objects and strings
* Size changes automatically
* Synchronized (thread-safe)

---

## Important Concepts

### Dynamic Storage

A Vector does not need a fixed size like arrays.

### Indexed Collection

Elements are stored using indexes starting from 0.

### Thread Safety

Vector methods are synchronized, making it safer in multi-threaded environments.

---

## Common Operations in Vector

### Adding Elements

Elements can be inserted into the Vector.

### Accessing Elements

Elements can be retrieved using their index position.

### Displaying Elements

The entire Vector can be printed.

---

## Real-Life Example of Vector

A playlist in a music app:

* Songs can be added anytime
* Songs remain in order
* The playlist size changes dynamically

---

# Stack

## What is a Stack?

A Stack is a collection class that follows the:

LIFO Principle
(Last In, First Out)

The last element added is removed first.

Stack is also part of the `java.util` package.

---

## Features of Stack

* Stores elements in order
* Follows LIFO structure
* Allows adding and removing elements
* Useful for temporary storage operations

---

## Important Stack Operations

### Push

Adds an element to the top of the stack.

### Peek

Views the top element without removing it.

### Pop

Removes the top element from the stack.

---

## LIFO Principle Example

Imagine a stack of plates:

* The last plate placed on top is the first one removed.
* This is exactly how Stack works in Java.

---

## Real-Life Uses of Stack

* Browser back button
* Undo operation in editors
* Function call management
* Expression evaluation

---

# Difference Between Vector and Stack

| Vector                            | Stack                              |
| --------------------------------- | ---------------------------------- |
| Dynamic array                     | LIFO data structure                |
| Access elements using index       | Access mainly from the top         |
| Used for general storage          | Used for temporary ordered storage |
| Elements can be accessed anywhere | Focuses on top element operations  |

---

# Packages Used

Both classes belong to:

* java.util.Vector
* java.util.Stack

These classes must be imported before use.

---
