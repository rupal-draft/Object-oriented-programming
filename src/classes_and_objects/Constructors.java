package classes_and_objects;

public class Constructors {
    public static void main(String [] args){
        // Constructors are invoked at the time of instantiation of an object
        Complex complex = new Complex(); // *default constructor
        Complex complex1 = new Complex(2,3);// **parameterized constructor
        complex.print();// 0+0i
        complex1.print();// 2+3i
    }
}

class Complex{
    int a,b;
    public Complex(){} // *default constructor which is automatically invoked at the instantiation of the object by default and set the parameters to default values
    public Complex(int a , int b)// **parameterized constructor
    {
        this.a = a;// this refers to the current object inside a method or constructor
        this.b = b;
    }

    void print(){
        System.out.println(a+"+"+b+"i");
    }
}