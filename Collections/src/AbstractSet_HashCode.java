import java.util.*;
import java.io.*;

public class AbstractSet_HashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Creating an empty AbstractSet
        AbstractSet<String>
            abs_set = new HashSet<String>();
  
        // Adding elements into the set
        abs_set.add("Geeks");
        abs_set.add("4");
        abs_set.add("Geeks");
        abs_set.add("Welcomes");
        abs_set.add("You");
  
        // Displaying the AbstractSet
        System.out.println("Initial Set is: "
                           + abs_set);
  
        // Getting the hashcode value for the set
        System.out.println("The hashcode value of the set: "
                           + abs_set.hashCode());
	}

}
