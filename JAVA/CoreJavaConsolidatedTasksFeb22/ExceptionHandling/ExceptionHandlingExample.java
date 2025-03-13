public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = divideNumbers(10, 0); // Attempting to divide by zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catch the exception and display a message
            System.out.println("Exception caught: Division by zero is not allowed.");
        }

        System.out.println("Program continues after handling the exception.");
    }

    // Method to perform division
    public static int divideNumbers(int a, int b) {
        return a / b; // This will throw ArithmeticException if b is 0
    }
}
