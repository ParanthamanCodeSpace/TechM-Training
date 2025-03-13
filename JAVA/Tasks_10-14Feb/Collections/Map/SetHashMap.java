import java.util.*;

public class SetHashMap {
    public static void main(String[] args) {
        // Using HashMap 
        HashMap<Integer, String> hmap = new HashMap<>();

        // Adding key-value pairs
        hmap.put(1, "one");
        hmap.put(2, "two");
        hmap.put(3, "three");

        // Printing initial map
        System.out.println("Initial Hashmap: " + hmap);

        // Updating value for key 2
        hmap.put(2, "For");
        System.out.println("Updated Hashmap: " + hmap);

        // Removing key 1
        hmap.remove(1);
        System.out.println("Hashmap after removal: " + hmap);

        // Traversing the map
        System.out.println("Map Traversal:");
        for (Map.Entry<Integer, String> e : hmap.entrySet()) {
            System.out.println("Key: " + e.getKey() + " | Value: " + e.getValue());
        }
    }
}
