package Common_Methods_List_Set;

import java.util.*;
import java.io.*;

/*
 *  Applicable for List and Set
 */

public class Clear_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> set = new ArrayList<String>();
		  
        // Use add() method to add elements into the Set
        set.add("Welcome");
        set.add("To");
        set.add("Geeks");
        set.add("4");
        set.add("Geeks");
  
        // Displaying the HashSet
        System.out.println("HashSet: " + set);
  
        // Clearing the HashSet using clear() method
        set.clear();
  
        // Displaying the final Set after clearing;
        System.out.println("The final set: " + set);
	}

}
