package classes_and_objects;

public class ObjectsClasses {
    public static void main(String [] args){
        // Creating two Dog objects (instances of the Dog class)
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        // Setting properties of the dog1 object
        dog1.name = "Tommy";
        dog1.age = 3; // Setting the age property
        dog1.color = "Brown"; // Setting the color property

        // Setting properties of the dog2 object
        dog2.name = "Jimmy";
        dog2.age = 4; // Setting the age property
        dog2.color = "Black"; // Setting the color property

        // Calling the bark() method on dog1
        dog1.bark();

        System.out.println();

        // Calling the walk() method on dog2
        dog2.walk();
    }
}

// Class Dog defines the blueprint for creating Dog objects
class Dog {
    // Properties (attributes) of the Dog class
    String name;  // Name of the dog
    int age;      // Age of the dog
    String color; // Color of the dog

    // Method to simulate the dog walking
    void walk() {
        System.out.println(name + " is walking!");
    }

    // Method to simulate the dog barking
    void bark() {
        System.out.println(name + " is barking!!");
    }
}
