package Common_Methods_List_Set;

import java.util.HashSet;

/* You want to clone the list or set using clone method.
 */

public class Clone_Method {

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
  
        // Creating a new cloned set
        HashSet cloned_set = new HashSet();
  
        // Cloning the set using clone() method
        cloned_set = (HashSet)set.clone();
  
        // Displaying the new Set after Cloning;
        System.out.println("The new set: " + cloned_set);
	}

}
