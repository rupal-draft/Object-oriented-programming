package classes_and_objects;

public class ObjectsClasses {
    public static void main(String [] args){
        Dog dog1 = new Dog();//Creating a dog object
        Dog dog2 = new Dog();
        //the dog1 object and dog2 objects is an instance of the dog class which has all the properties and behaviours of dog class attached to it
        dog1.name = "Tommy";
        dog2.name = "Jimmy";
        dog1.bark();
        System.out.println();
        dog2.walk();
    }
}

//Blueprint which defines some properties and behaviours
class Dog{

    //Properties
    String name;
    int age;
    String color;

    //Behaviours
    void walk(){
        System.out.println(name+" is walking!");
    }
    void bark(){
        System.out.println(name+" is barking!!");
    }
}