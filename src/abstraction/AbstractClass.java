package abstraction;

// The abstract class cannot be instantiated... We can declare their child classes then implement its methods and then instantiate the child class
public abstract class AbstractClass {
    abstract void printName(String name); // A method that does not have body is called abstract method
    abstract void returnAge(int age);
    // An abstract class has both regular and abstract methods
    void printType(){ // If we do not provide the abstract keyword then we have to provide it's implementation
        System.out.println("This is abstract class!");
    }
}
