import java.util.*;
import java.io.*;

public class ListIterator_Cursor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList();
		ll.add("Bala");
		ll.add("venky");
		ll.add("chiru");
		ll.add("nag");
		System.out.println(ll);  //[bala,venky,chiru,nag]
		ListIterator li=ll.listIterator();
		while(li.hasNext()){
			String str=(String)li.next();
			if(str.equals("venky")){
				li.remove();//[bala,chiru,nag]
			}
			else if(str.equals("nag")){
				li.add("chaitu");//[bala,chiru,nag,chaitu]
			}
			else if(str.equals("chiru")){
				li.set("Charan");//[bala,charan,nag,chaitu]
			}
		}
		System.out.println(ll);
	}

}
