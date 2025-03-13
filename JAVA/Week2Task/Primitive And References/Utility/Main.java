import utility.UtilityMethods; // Import the utility package

public class Main {
    public static void main(String[] args) {
        int num = 12345;
        // Calling the static method without creating an object
        int length = UtilityMethods.findLength(num);
        System.out.println("Length of " + num + " is: " + length);
    }
}
