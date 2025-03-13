import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CopyArrayList {
    public static void main(String[] args) {
        // Create the first ArrayList and add elements
        List<String> sourceList = new ArrayList<>();
        sourceList.add("Red");
        sourceList.add("Green");
        sourceList.add("Blue");
        sourceList.add("Yellow");
        sourceList.add("Purple");

        // Create another ArrayList with the same size
        List<String> destinationList = new ArrayList<>(sourceList.size());
        
        // Initialize the destination list with null values (required for copy)
        for (int i = 0; i < sourceList.size(); i++) {
            destinationList.add(null);
        }

        // Copy elements from sourceList to destinationList
        Collections.copy(destinationList, sourceList);

        // Print both lists
        System.out.println("Source List: " + sourceList);
        System.out.println("Destination List (After Copy): " + destinationList);
    }
}
