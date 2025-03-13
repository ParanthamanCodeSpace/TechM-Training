public class OddNumberExceptionExample {
    public static void main(String[] args) {
        try {
            // Test with an odd number
            checkEvenNumber(7);
        } catch (IllegalArgumentException e) {
            // Catch and handle the exception
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }

    // Method to check if a number is even; throws an exception if it's odd
    public static void checkEvenNumber(int num) {
        if (num % 2 != 0) {
            throw new IllegalArgumentException("Number " + num + " is odd, which is not allowed.");
        } else {
            System.out.println("Number " + num + " is even.");
        }
    }
}
