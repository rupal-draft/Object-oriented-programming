package LambdaExpression_Classes;

public class ClassTypes {

    // Non-static inner class
    class Inner_Class {
        int property;

        // Constructor to initialize property
        Inner_Class(int property) {
            this.property = property;
        }

        // Method to display property
        void display() {
            System.out.println("Inner Class Property: " + property);
        }
    }

    // Static inner class
    static class Static_Inner_Class {
        int property;

        // Constructor to initialize property
        Static_Inner_Class(int property) {
            this.property = property;
        }

        // Method to display property
        void display() {
            System.out.println("Static Inner Class Property: " + property);
        }
    }

    public static void main(String[] args) {
        // Using non-static inner class (requires an instance of the outer class)
        ClassTypes outer = new ClassTypes(); // Outer class object
        Inner_Class innerClass = outer.new Inner_Class(10); // Inner class object
        innerClass.display(); // Display the property of the inner class

        System.out.println();

        // Using static inner class (does not require an instance of the outer class)
        Static_Inner_Class staticInnerClass = new Static_Inner_Class(20);
        staticInnerClass.display(); // Display the property of the static inner class

        System.out.println();

        // Using anonymous class extending Annonymous_Outer_Class
        Annonymous_Outer_Class anonymousOuterClass = new Annonymous_Outer_Class() {
            @Override
            public void method() {
                System.out.println("Hello from anonymous outer class (overridden method)");
            }

            // Adding a new method
            public void method2() {
                System.out.println("Again Hello from anonymous outer class (additional method)");
            }
        };
        anonymousOuterClass.method();
        // We can't directly call method2 because it's not part of the base class definition.

        System.out.println();

        // Using anonymous class implementing Annonymous_Outer_Interface
        Annonymous_Outer_Interface anonymousOuterInterface = new Annonymous_Outer_Interface() {
            @Override
            public void interface_method() {
                System.out.println("Hello from anonymous outer interface (overridden method)");
            }
        };
        anonymousOuterInterface.interface_method();
    }

    // Regular class to demonstrate an anonymous class
    static class Annonymous_Outer_Class {
        public void method() {
            System.out.println("Hello from Annonymous_Outer_Class");
        }
    }

    // Interface to demonstrate an anonymous class
    interface Annonymous_Outer_Interface {
        void interface_method();
    }
}
