import java.util.*;
import java.io.*;

public class Stack_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s=new Stack();
		s.push("A");
		s.push("B");
		System.out.println(s); //[A,B]
		System.out.println(s.search("A")); //[2]
		System.out.println(s.search("Z")); //[-1]
	}

}
