import java.util.*;

public class SetHashTable {
    public static void main(String[] args) {
        // Using Hashtable (Can also use HashMap)
        Hashtable<Integer, String> htab = new Hashtable<>();

        // Adding key-value pairs
        htab.put(1, "one");
        htab.put(2, "two");
        htab.put(3, "three");

        // Printing initial map
        System.out.println("Initial Hashtable: " + htab);

        // Updating value for key 2
        htab.put(2, "For");
        System.out.println("Updated Hashtable: " + htab);

        // Removing key 1
        htab.remove(1);
        System.out.println("Hashtable after removal: " + htab);

        // Traversing the map
        System.out.println("Map Traversal:");
        for (Map.Entry<Integer, String> e : htab.entrySet()) {
            System.out.println("Key: " + e.getKey() + " | Value: " + e.getValue());
        }
    }
}
