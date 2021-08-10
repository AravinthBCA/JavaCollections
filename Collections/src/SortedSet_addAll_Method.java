import java.util.*;
import java.io.*;

/* 
 * addAll is used to add all elements into another list and set
 */

public class SortedSet_addAll_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Creating an empty Set
        SortedSet<String> st1
            = new TreeSet<String>();
  
        // Use add() method to add
        // elements into the Set
        st1.add("Welcome");
        st1.add("To");
        st1.add("Geeks");
        st1.add("4");
        st1.add("Geeks");
        st1.add("TreeSet");
  
        // Displaying the Set
        System.out.println("Set: " + st1);
  
        // Creating another Set
        HashSet<String> st2
            = new HashSet<String>();
  
        // Use add() method to add
        // elements into the Set
        st2.add("Hello");
        st2.add("World");
  
        // Using addAll() method to Append
        st1.addAll(st2);
  
        // Displaying the final Set
        System.out.println("Set: " + st1);
	}

}
