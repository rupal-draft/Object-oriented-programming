package abstraction;

public class MainInAbstraction {

    public static void main(String[] args){
        // creating instance of the child class of super abstract class
        ApplyAbstract applyAbstract = new ApplyAbstract();
        applyAbstract.printType();
        applyAbstract.printName("Rupal Paul");
        applyAbstract.returnAge(22);

        // creating instance of implementation class of the interfaces
        ApplyInterface applyInterface = new ApplyInterface();
        applyInterface.printType();
        applyInterface.printName("Tulshi Paul");
        applyInterface.printAge(45);
    }

}

class ApplyAbstract extends AbstractClass{ // all the child classes must have to provide the implementations of all the abstract methods of the super abstract class

    @Override
    void printName(String name) {
        System.out.println(name);
    }

    @Override
    void returnAge(int age) {
        System.out.println(age);
    }
}

class ApplyInterface implements Interface1,Interface2 { // Interface supports multiple inheritance in java as we are explicitly giving it's implementations

    @Override
    public void printName(String name) {
        System.out.println();
    }

    @Override
    public void printAge(int age) {
        System.out.println(45);
    }
}