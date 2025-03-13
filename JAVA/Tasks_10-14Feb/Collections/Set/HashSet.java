import java.util.Set;        
import java.util.HashSet;    
import java.util.LinkedHashSet;
import java.util.TreeSet; 

public class HashSet {

    public static void processset(Set<Integer> hashset) {
        hashset.remove(100);
        System.out.println("Updated Integer HashSet: " + hashset);
        System.out.print("Numbers divisible by 7: ");
        for (int num : hashset) {
            if (num % 7 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void processset(Set<String> lhashset, boolean isStringSet) {
        lhashset.remove("Saami");
        System.out.println("Updated String LinkedHashSet: " + lhashset);
        System.out.print("Strings with length > 5: ");
        for (String str : lhashset) {
            if (str.length() > 5) {
                System.out.print(str + " ");
            }
        }
        System.out.println();
    }

    public static void processset(Set<Float> thashset, double dummy) {
        thashset.remove(2.5f);
        System.out.println("Updated Float TreeSet: " + thashset);
        System.out.print("Numbers greater than 5: ");
        for (float num : thashset) {
            if (num > 5) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Integer HashSet
        Set<Integer> hashset = new HashSet<>();
        hashset.add(100); hashset.add(200); hashset.add(122); hashset.add(222);
        hashset.add(344); hashset.add(0); hashset.add(182); hashset.add(621);

        // String LinkedHashSet
        Set<String> lhashset = new LinkedHashSet<>();
        lhashset.add("Interstellar"); lhashset.add("Thuppakki"); lhashset.add("7amArivu");
        lhashset.add("Saami"); lhashset.add("Virumandi"); lhashset.add("Vidamuyarchi");
        lhashset.add("Kaththi"); lhashset.add("Petta");

        // Float TreeSet
        Set<Float> thashset = new TreeSet<>();
        thashset.add(2.5f); thashset.add(1.2f); thashset.add(3.8f);
        thashset.add(4.4f); thashset.add(7.7f); thashset.add(0.5f);
        thashset.add(5.9f); thashset.add(6.3f);

        // Call the overloaded methods
        processset(hashset);
        processset(lhashset, true);
        processset(thashset, 0.0);
    }
}
