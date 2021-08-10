package Common_Methods_List_Set;

import java.util.*;
import java.io.*;

public class Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating an empty HashSet
        HashSet<String> set = new HashSet<String>();
  
        // Use add() method to add elements into the Set
        set.add("Welcome");
        set.add("To");
        set.add("Geeks");
        set.add("4");
        set.add("Geeks");
  
        // Displaying the HashSet
        System.out.println("HashSet: " + set);
  
        // Creating an iterator
        Iterator value = (Iterator) set.iterator();
  
        // Displaying the values after iterating through the set
        System.out.println("The iterator values are: ");
        while (((java.util.Iterator<String>) value).hasNext()) {
            System.out.println(((java.util.Iterator<String>) value).next());
        }
	}

}
