import java.util.*;
import java.io.*;

public class LinkedHashSet_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> linkedset = 
                new LinkedHashSet<String>();  

			// Adding element to LinkedHashSet  
			linkedset.add("A");  
			linkedset.add("B");  
			linkedset.add("C");  
			linkedset.add("D"); 
			
			// This will not add new element as A already exists 
			linkedset.add("A"); 
			linkedset.add("E");  
			
			System.out.println("Size of LinkedHashSet = " +
			                         linkedset.size());  
			System.out.println("Original LinkedHashSet:" + linkedset);  
			System.out.println("Removing D from LinkedHashSet: " +
			                 linkedset.remove("D"));  
			System.out.println("Trying to Remove Z which is not "+
			                 "present: " + linkedset.remove("Z"));  
			System.out.println("Checking if A is present=" + 
			                 linkedset.contains("A"));
			System.out.println("Updated LinkedHashSet: " + linkedset);  
	}

}
