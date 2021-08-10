package Common_Methods_List_Set;

import java.util.*;
import java.io.*;

public class Contians_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashSet<String> set = new HashSet<String>();
		  
	        // Using add() method to add elements into the Set
	        set.add("Welcome");
	        set.add("To");
	        set.add("Geeks");
	        set.add("4");
	        set.add("Geeks");
	  
	        // Displaying the HashSet
	        System.out.println("HashSet: " + set);
	  
	        // Check for "Geeks" in the set
	        System.out.println("Does the Set contains 'Geeks'? " + set.contains("Geeks"));
	  
	        // Check for "4" in the set
	        System.out.println("Does the Set contains '4'? " + set.contains("4"));
	  
	        // Check if the Set contains "No"
	        System.out.println("Does the Set contains 'No'? " + set.contains("No"));
	}

}
