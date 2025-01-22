
# Object-Oriented Programming in Java

Java is a powerful programming language that is based on the principles of **Object-Oriented Programming (OOP)**. OOP is a paradigm that provides a way of structuring programs using objects and classes, making them modular, scalable, and reusable. The four foundational pillars of OOP in Java are:

## **1. Encapsulation**
Encapsulation is the mechanism of wrapping data (variables) and methods (functions) together into a single unit, typically a **class**. It restricts direct access to an object's data and provides controlled access through getters and setters.

### **Key Features of Encapsulation**
- Protects the integrity of the data by making fields private.
- Exposes public methods to read/write the data (getters and setters).
- Improves modularity and maintainability.

### **Example**
```java
public class Employee {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }
}
```
---

## **2. Inheritance**
Inheritance is a mechanism where one class (child or subclass) can acquire the properties and methods of another class (parent or superclass). It enables code reuse and establishes a hierarchical relationship between classes.

### **Key Features of Inheritance**
- Promotes code reuse.
- Supports polymorphism through method overriding.
- Establishes an "is-a" relationship.

### **Example**
```java
public class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

public class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting...");
    }
}
```
---

## **3. Polymorphism**
Polymorphism means "many forms." It allows a single method or interface to operate differently based on the context. It can be achieved through:

- **Method Overloading**: Same method name, different parameters.
- **Method Overriding**: Same method name, same parameters, different implementations in subclasses.

### **Key Features of Polymorphism**
- Improves flexibility and maintainability.
- Promotes dynamic method dispatch.

### **Example**
```java
// Method Overloading
public class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
}

// Method Overriding
public class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

public class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
```
---

## **4. Abstraction**
Abstraction is the process of hiding implementation details and exposing only the functionality to the user. It can be achieved through **abstract classes** and **interfaces**.

### **Key Features of Abstraction**
- Reduces complexity by focusing on essential details.
- Improves code scalability and maintainability.

### **Example**
```java
// Abstract Class
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Interface
interface Animal {
    void eat();
}

class Cat implements Animal {
    public void eat() {
        System.out.println("Cat is eating");
    }
}
```
---
## **5. Lambda Expressions**
A **lambda expression** is a concise way to represent a method using an anonymous function. It is primarily used with functional interfaces (interfaces with a single abstract method).

### **Key Features of Lambda Expressions**
- Simplifies code for functional interfaces.
- Improves readability and reduces boilerplate code.

### **Example**
```java
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

public class LambdaExample {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator multiply = (a, b) -> a * b;

        System.out.println("Sum: " + add.calculate(5, 10)); // Output: Sum: 15
        System.out.println("Product: " + multiply.calculate(5, 10)); // Output: Product: 50
    }
}
```

## **6. Inner Classes**
An **inner class** is a class defined within another class. It is used to logically group classes and access private members of the outer class.

### **Types of Inner Classes**
1. **Non-static Inner Class**: Associated with an instance of the outer class.
2. **Static Inner Class**: Can be accessed without an outer class instance.
3. **Anonymous Class**: A class without a name, used for one-time implementations.

### **Example**
```java
public class OuterClass {
    private String message = "Hello, Inner Class!";

    // Non-static Inner Class
    class Inner {
        void displayMessage() {
            System.out.println(message);
        }
    }

    // Static Inner Class
    static class StaticInner {
        void greet() {
            System.out.println("Hello from Static Inner Class!");
        }
    }

    public static void main(String[] args) {
        // Using Non-static Inner Class
        OuterClass outer = new OuterClass();
        Inner inner = outer.new Inner();
        inner.displayMessage();

        // Using Static Inner Class
        StaticInner staticInner = new StaticInner();
        staticInner.greet();
    }
}
```


## **Java Keywords Explained**
Java has 50+ reserved keywords that are predefined in the language. Here are some commonly used ones:

| **Keyword**  | **Description** |
|--------------|------------------|
| `class`      | Defines a class. |
| `extends`    | Indicates that a class inherits from another class. |
| `implements` | Indicates that a class implements an interface. |
| `abstract`   | Defines an abstract class or method. |
| `interface`  | Declares an interface. |
| `this`       | Refers to the current object instance. |
| `super`      | Refers to the parent class instance. |
| `public`     | Specifies that a method or variable is accessible from anywhere. |
| `private`    | Restricts access to within the class. |
| `protected`  | Restricts access to within the package and subclasses. |
| `static`     | Indicates that a field or method belongs to the class rather than an instance. |
| `final`      | Indicates that a variable cannot be changed, a method cannot be overridden, or a class cannot be inherited. |
| `try-catch`  | Handles exceptions. |
| `void`       | Specifies that a method does not return a value. |

---

## **Conclusion**
Object-Oriented Programming in Java simplifies software development by providing a modular approach to building applications. Mastering its four pillars—Encapsulation, Inheritance, Polymorphism, and Abstraction—empowers developers to create robust, maintainable, and scalable systems.

Happy Coding! 🚀
