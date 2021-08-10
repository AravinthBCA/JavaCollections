import java.util.*;
import java.io.*;

/*
 * Only comparator it allows treeset
 */

public class TreeSet_Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating an empty TreeSet
				TreeSet<Integer> tree_set = new TreeSet<Integer>();

				// Adding elemetns to the set
				tree_set.add(20);
				tree_set.add(24);
				tree_set.add(10);
				tree_set.add(35);
				tree_set.add(45);
				tree_set.add(50);

			System.out.println("Tree Set values are: "+ tree_set);
			// Creating a comparator
			Comparator_TreeSet comp = (Comparator_TreeSet) tree_set.comparator();	
			// Displaying the comparator values
			System.out.println("Since the Comparator value is: "+ comp);
			System.out.println("it follows natural ordering");
	}

}
