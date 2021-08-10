import java.util.*;
import java.io.*;

public class Iterator_Cursor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		for(int i=1;i<=10;i++){
			al.add(i);
		}
		System.out.println(al);
		Iterator i=al.iterator();
		while(i.hasNext()){
			Integer in=(Integer)i.next();
			if(in%2==0){
				System.out.println(in);
			}
			else{
				i.remove();
			}
		}
		System.out.println(al);
	}

}
