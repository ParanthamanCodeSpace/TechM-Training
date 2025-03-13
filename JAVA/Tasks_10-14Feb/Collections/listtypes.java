package LISTS.Feb13;

import java.util.List;
import java.util.ArrayList;  // ArrayList implementation
import java.util.Stack;      // Stack (which extends Vector)
import java.util.LinkedList;
import java.util.Vector;

public class listtypes {
    public static void main(String[] args){
        Arraylistthread alt = new Arraylistthread();
        Stacklistthread slt = new Stacklistthread();
        Linkedlistthread llt = new Linkedlistthread();
        Vectorlistthread vlt = new Vectorlistthread();

        alt.start();
        slt.start();
        llt.start();
        vlt.start();

    }
}

class Arraylistthread extends Thread {
    public void run() {
        try {
            List<Integer> list1 = new ArrayList<>();
            //System.out.println("Is list1 empty? "+list1.isEmpty());
            list1.add(35);
            list1.add(23);
            list1.add(67);
            list1.add(82);
            list1.add(56);
            list1.add(49);
            list1.add(49);
            list1.add(49);
            //System.out.println("Is list1 empty? "+list1.isEmpty());
            //  System.out.println("The given list is:"+list1);
            System.out.println("Number of elements in the list: " + list1.size());
            //Adding one element
            list1.add(12);
            System.out.println("After adding one element:");
            System.out.println("The given list is :" + list1);
            System.out.println("The number of elements in the list: " + list1.size());
//Checking for an element
            System.out.println("Is 566 available in the list:" + list1.contains(566));
            System.out.println("The given list before removing elements is :" + list1);
            list1.remove(2);//Removing element by its index
            list1.remove(3);//Removing element by its index
            System.out.println("After removing elements:");
            System.out.println("The given list is :" + list1);
            System.out.println("The number of elements in the alist: " + list1.size());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class Stacklistthread extends Thread {
    public void run() {
        try {
            List<Integer> list1 = new Stack<>();
            //System.out.println("Is list1 empty? "+list1.isEmpty());
            list1.add(35);
            list1.add(23);
            list1.add(67);
            //list1.add(82);
            list1.add(56);
            list1.add(49);
            //list1.add(49);
            list1.add(49);
            //System.out.println("Is list1 empty? "+list1.isEmpty());
            //  System.out.println("The given list is:"+list1);
            System.out.println("Number of elements in the list: " + list1.size());
            //Adding one element
            list1.add(12);
            System.out.println("After adding one element:");
            System.out.println("The given list is :" + list1);
            System.out.println("The number of elements in the list: " + list1.size());
//Checking for an element
            System.out.println("Is 566 available in the list:" + list1.contains(566));
            System.out.println("The given list before removing elements is :" + list1);
            list1.remove(2);//Removing element by its index
            list1.remove(3);//Removing element by its index
            list1.remove(4);
            System.out.println("After removing elements:");
            System.out.println("The given list is :" + list1);
            System.out.println("The number of elements in the slist: " + list1.size());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class Linkedlistthread extends Thread {
    public void run() {
        try {
            List<Integer> list1 = new LinkedList<>();
            //System.out.println("Is list1 empty? "+list1.isEmpty());
            list1.add(35);
            list1.add(23);
            list1.add(67);
            list1.add(82);
            list1.add(56);
            list1.add(49);
            list1.add(49);
            list1.add(49);
            //System.out.println("Is list1 empty? "+list1.isEmpty());
            //  System.out.println("The given list is:"+list1);
            System.out.println("Number of elements in the list: " + list1.size());
            //Adding one element
            list1.add(12);
            System.out.println("After adding one element:");
            System.out.println("The given list is :" + list1);
            System.out.println("The number of elements in the list: " + list1.size());
//Checking for an element
            System.out.println("Is 566 available in the list:" + list1.contains(566));
            System.out.println("The given list before removing elements is :" + list1);
            list1.remove(2);//Removing element by its index
            list1.remove(3);//Removing element by its index
            System.out.println("After removing elements:");
            System.out.println("The given list is :" + list1);
            System.out.println("The number of elements in the list: " + list1.size());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class Vectorlistthread extends Thread {
    public void run() {
        try {
            List<Integer> list1 = new Vector<>();
            //System.out.println("Is list1 empty? "+list1.isEmpty());
            list1.add(35);
            list1.add(23);
            list1.add(67);
            list1.add(82);
            list1.add(56);
            list1.add(49);
            list1.add(49);
            list1.add(49);
            //System.out.println("Is list1 empty? "+list1.isEmpty());
            //  System.out.println("The given list is:"+list1);
            System.out.println("Number of elements in the list: " + list1.size());
            //Adding one element
            list1.add(12);
            System.out.println("After adding one element:");
            System.out.println("The given list is :" + list1);
            System.out.println("The number of elements in the list: " + list1.size());
//Checking for an element
            System.out.println("Is 566 available in the list:" + list1.contains(566));
            System.out.println("The given list before removing elements is :" + list1);
            list1.remove(2);//Removing element by its index
            list1.remove(3);//Removing element by its index
            System.out.println("After removing elements:");
            System.out.println("The given list is :" + list1);
            System.out.println("The number of elements in the list: " + list1.size());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
