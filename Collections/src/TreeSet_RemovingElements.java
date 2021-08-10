import java.util.*;
import java.io.*;

public class TreeSet_RemovingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigableSet<String> ts = new TreeSet<>();
		 
        // Elements are added using add() method
        ts.add("Geek");
        ts.add("For");
        ts.add("Geeks");
        ts.add("A");
        ts.add("B");
        ts.add("Z");
 
        System.out.println("Initial TreeSet " + ts);
 
        // Removing the element b
        ts.remove("B");
 
        System.out.println("After removing element B" + ts);
 
        // Removing the first element
        ts.pollFirst();
 
        System.out.println("After removing first " + ts);
 
        // Removing the last element
        ts.pollLast();
 
        System.out.println("After removing last " + ts);
	}

}
