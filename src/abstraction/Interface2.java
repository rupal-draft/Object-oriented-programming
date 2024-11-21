package abstraction;

public interface Interface2 {
    void printName(String name);

    default void printType(){ // default implementation,You can override it in implementation classes
        System.out.println("This is an interface");
    }
}
