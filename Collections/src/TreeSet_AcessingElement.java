import java.util.*;
import java.io.*;

public class TreeSet_AcessingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigableSet<String> ts = new TreeSet<>();
		 
        // Elements are added using add() method
        ts.add("Geek");
        ts.add("For");
        ts.add("Geeks");
 
        System.out.println("Tree Set is " + ts);
 
        String check = "Geeks";
 
        // Check if the above string exists in
        // the treeset or not
        System.out.println("Contains " + check + " "
                           + ts.contains(check));
 
        // Print the first element in
        // the TreeSet
        System.out.println("First Value " + ts.first());
 
        // Print the last element in
        // the TreeSet
        System.out.println("Last Value " + ts.last());
 
        String val = "Geek";
 
        // Find the values just greater
        // and smaller than the above string
        System.out.println("Higher " + ts.higher(val));
        System.out.println("Lower " + ts.lower(val));
	}

}
