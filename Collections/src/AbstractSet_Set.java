import java.util.*;
import java.io.*;

/* Advantages of AbstractSet
 *    1) Not Insertion order preserved
 *    2) Ascending order Automatically 
 *    3) Heterogeneous Acceptance
 *    
 */

public class AbstractSet_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating an empty AbstractSet
				AbstractSet<String>
				abstract_set11 = new HashSet<String>();
				AbstractSet<String>
					abstract_set2 = new HashSet<String>();

				// Adding elements to set
				abstract_set11.add("Geeks");
				abstract_set11.add("you");
				abstract_set11.add("Geeks");
				abstract_set11.add("Welcomes");
				abstract_set11.add("4");

				// Adding elements to set
				abstract_set2.add("Geeks");
				abstract_set2.add("4");
				abstract_set2.add("Geeks");
				abstract_set2.add("Welcomes");
				abstract_set2.add("You");

				// Displaying the first HashSet
				System.out.println("First Set: "
								+ abstract_set11);

				// Displaying the second HashSet
				System.out.println("Second Set: "
								+ abstract_set2);

				// Displaying the equality
				System.out.println("Equality: "
								+ abstract_set11
										.equals(abstract_set2));
	}

}
