package LambdaExpression_Classes;

public class LambdaExpression {

    public static void main(String[] args) {
        // Lambda expression for Runnable interface
        Runnable runnable = () -> {
            System.out.println("Running from lambda expression");
        };

        // Lambda expression for Runnable2 interface with parameter and body
        Runnable2 runnable2 = (steps) -> {
            System.out.println("Walking " + steps + " steps");
            return steps;
        };

        // Simplified lambda expression for Runnable2 interface (single line)
        Runnable2 runnable3 = steps -> 2 * steps;

        // Calling the lambda for Runnable
        runnable.run();

        System.out.println();

        // Calling the lambda for Runnable2
        int stepsWalked = runnable2.walks(10);
        System.out.println("Steps walked (from runnable2): " + stepsWalked);

        System.out.println();

        // Calling the simplified lambda for Runnable2
        int doubleSteps = runnable3.walks(10);
        System.out.println("Double the steps walked (from runnable3): " + doubleSteps);

        System.out.println();

        // Additional example: Lambda expression for Runnable interface with custom logic
        Runnable runnableCustom = () -> {
            System.out.println("Performing a custom task using a lambda expression");
        };
        runnableCustom.run();

        // Additional example: Using Runnable2 for another custom behavior
        Runnable2 runnableCustom2 = steps -> {
            System.out.println("Walking " + steps + " steps briskly!");
            return steps + 5; // Adding extra steps for brisk walking
        };
        int briskSteps = runnableCustom2.walks(15);
        System.out.println("Brisk steps walked: " + briskSteps);
    }
}

// A functional interface with a single abstract method 'run'
@FunctionalInterface
interface Runnable {
    void run(); // Abstract method to be implemented by a lambda expression
}

// Another functional interface with a single abstract method 'walks'
@FunctionalInterface
interface Runnable2 {
    int walks(int steps); // Abstract method that accepts an argument and returns a value
}
