import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class IterateFromPosition {
    public static void main(String[] args) {
        // Create a LinkedList and add elements
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Specify the starting position
        int startIndex = 2; // Start from the 3rd element (index starts from 0)

        // Check if index is valid
        if (startIndex >= 0 && startIndex < colors.size()) {
            // Create a ListIterator at the specified position
            ListIterator<String> iterator = colors.listIterator(startIndex);

            // Iterate through the list from the given position
            System.out.println("Iterating from index " + startIndex + ":");
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        } else {
            System.out.println("Invalid index! Please enter a value between 0 and " + (colors.size() - 1));
        }
    }
}
