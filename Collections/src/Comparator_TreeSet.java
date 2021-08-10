import java.util.*;
import java.io.*;

class my implements Comparator{
	public int compare(Object obj1,Object obj2){
		Integer l1=(Integer)obj1;
		Integer l2=(Integer)obj2;
		if(l1>l2){
			return +1;
		}
		else if(l1<l2){
			return -1;
		}
		else
			return 0;
	}
}

public class Comparator_TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		TreeSet t=new TreeSet(new my());
	    t.add(10);
		t.add(0);
		t.add(15);
		System.out.println(t);
	}
}
