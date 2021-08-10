import java.util.*;
import java.io.*;

public class TreeSet_Iterator {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TreeSet<String> ts = new TreeSet<>();
		 
	        // Elements are added using add() method
	        ts.add("Geek");
	        ts.add("For");
	        ts.add("Geeks");
	        ts.add("A");
	        ts.add("B");
	        ts.add("Z");
	 
	        // Iterating though the TreeSet
	        for (String value : ts)
	            System.out.print(value + ", ");
	        System.out.println();
	}

}
