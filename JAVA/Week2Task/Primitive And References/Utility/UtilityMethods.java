package utility;

public class UtilityMethods {
    // Static method to find the length of an integer
    public static int findLength(int number) {
        return String.valueOf(Math.abs(number)).length(); // Convert to string and find length
    }
}
