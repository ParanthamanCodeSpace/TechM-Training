import java.util.Scanner;

public class AlternateCapitalization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input string from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Convert using the function
        String result = capitalizeAlternate(input);
        
        // Display the result
        System.out.println("Output: " + result);
        
        scanner.close();
    }

    // Function to capitalize alternate characters
    public static String capitalizeAlternate(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                sb.append(Character.toUpperCase(str.charAt(i))); // Uppercase for even index
            } else {
                sb.append(Character.toLowerCase(str.charAt(i))); // Lowercase for odd index
            }
        }
        
        return sb.toString();
    }
}
