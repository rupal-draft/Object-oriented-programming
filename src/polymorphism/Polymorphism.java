package polymorphism;

// Polymorphism allows use to perform a single action in different ways
public class Polymorphism {

    public static void main(String[] args){
        Animal animal = new Human(); // there is a is-a relationship between parent and child

        animal.printType(); // Output: I am a Human
        animal.printType("animal"); // Output: I am an animal
    }

}

class Animal{

    void printType(){
        System.out.println("I am an animal");
    }

    void printType(String type){ // Compile-time polymorphism or Method-overloading
        System.out.println("I am an "+type);
    }
}

class Human extends Animal{

    @Override // Run-time polymorphism or Method-overriding
    void printType(){
        System.out.println("I am a Human");
    }
}