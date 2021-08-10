import java.util.*;
import java.io.*;

public class Linked_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList();
		ll.add("durga");
		ll.add(30);
		ll.add(null);
		ll.add("durga");
		ll.set(0,"Software");
		ll.add(0,"Venkey");
		ll.addFirst("ccc");
		System.out.println(ll);
	}

}
