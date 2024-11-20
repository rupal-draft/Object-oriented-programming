package classes_and_objects;

public class MethodOverloading {
    public static void main(String [] args){
        Greet greet = new Greet();

        greet.greetings();//no parameter
        greet.greetings("Rupal");//one parameter
        greet.greetings("Rupal",5);//two parameters
    }
}

class Greet{
    //Method-overloading means a class having more than one method
    // with same name but different number parameters or different datatypes of parameters

    void greetings(){
        System.out.println("Hello Rupal");
    }

    void greetings(String name){
        System.out.println("Hello "+name);
    }

    void greetings(String name, int count){
        for (int i = 0; i < count; i++) {
            System.out.println("Hello "+name);
        }
    }
}