package encapsulation.datahiding_statickeyword;

public class StaticKeyword {

    // If we want to access a class member without creating the instance of the class we can set that member to be static
    // only a single copy of the static member is created and shared across all the classes
    // if an object modifies the value of the static member, it will be reflected across all the classes

    public static int count = 0;

    public static void print(){
        System.out.println(count);
    }

    // static variables do not depend on object creating, it creates with class
}
