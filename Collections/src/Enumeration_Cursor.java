import java.util.*;
import java.io.*;

public class Enumeration_Cursor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		for(int i=0;i<=10;i++){
			v.addElement(i);
		}
		System.out.println(v);
		Enumeration e=v.elements();
		while(e.hasMoreElements()){
			Integer i=(Integer)e.nextElement();
			if((i%2==0)){
				System.out.println(i);
			}
		}
	}

}
