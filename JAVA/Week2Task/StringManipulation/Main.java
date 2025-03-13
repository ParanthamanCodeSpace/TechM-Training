package StringManipulation;

public class Main {
    public static void main(String[] args) {
        StringProcessor sp = new StringProcessor();

        // Testing reverseString
        System.out.println("Reversed: " + sp.reverseString(" Hello Paranthaman")); // Output: olleh

        // Testing countOccurrences
        System.out.println("Occurrences: " + sp.countOccurrences("hello world, hello everyone", "hello")); // Output: 2

        // Testing splitAndCapitalize
        System.out.println("Capitalized: " + sp.splitAndCapitalize("JAVA proGRAMming languAGE")); // Output: Java Programming Language
    }
}
