package StringManipulation;

public class StringProcessor {

    // Method to reverse a string
    public String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Method to count occurrences of a substring in a text
    public int countOccurrences(String text, String sub) {
        int count = 0;
        int index = 0;

        while ((index = text.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }

    // Method to split a string by spaces and capitalize each word
    public String splitAndCapitalize(String str) {
        String [] words = str.split(" ");
        StringBuilder capitalizedstring = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()){
                capitalizedstring.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase()).append(" ");
            }
        }
        return capitalizedstring.toString().trim();
    }
}
