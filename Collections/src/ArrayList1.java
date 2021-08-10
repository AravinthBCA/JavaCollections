import java.util.*;
import java.io.*;
class students{
	
}

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al= new ArrayList();
		students s=new students();
		ArrayList<students> als=new ArrayList<students>();
		als.add(s);
		al.add("A");
		al.add(10);
		al.add("A");
		al.add(null);
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		al.add(2,"m");
		al.add(2,"x");
		al.add("N");
		System.out.println(al);
		LinkedList ll=new LinkedList();
		System.out.println(al instanceof Serializable);
		System.out.println(ll instanceof Cloneable);
		System.out.println(al instanceof RandomAccess);
		System.out.println(ll instanceof RandomAccess);
	}

}

/* ArrayList Methods
 *   add(int index,object element) => used to insert a specific element.
 *   add(object o)   =>used to append a specific element at the end of a list.
 *   addAll(Collection c) =>used to append all the elements from a specific collection.
 *   addAll(int index,Collection c) =>used to insert all of the elements starting at the specified 
 *                                    position from a specific collection into the mentioned list.
 *   clear() =>used to remove all the elements from any list.
 *   clone() =>used to return a shallow copy of an Arraylist.
 *   contains?(Object o) =>Returns true if this list contains the specified element.
 *   ensureCapacity?.(int minCapacity) =>Increases the capacity of this Arraylist instance.
 *   forEach?(Consumer<?super E>action) =>performs the given action for each element of the iterable until
 *                                        all elements have been processed or the action throws an exception. 
 *   indexOf(Object o) =>The index the first occurrence of a specific element if either returned, or -1
 *                       in case the element is not in the list.
 *   isEmpty() =>Returns true if this list contains no elements.
 *   lastIndexOf(Object 0) => The index of the last occurrence of a specific element is either returned
 *                            or -1 in case the element is not in the list.
 *   listiterator() => Returns a list iterator over the elements in this list.
 *   remove(int index) =>Remove the element at the specified position in this list.
 *   remove(object o) =>Remove the first occurrence fo the specified element from this list if it is present.
 *   removeAll(Collection c) =>Removes from this list all of its elements that are contained in the 
 *                             specified collection.
 *   removeIf(Predicate filter) =>Removes all of the elements of this collection that satisfy the given predicate.
 *   size() =>Returns the number of elements in this list.
 *   toArray() =>This method is used to return an array containing all of the elements in the list in the
 *               correct order.
 *   toArray(object[] o) =>It is also used to return an array containing all of the elements in this list
 *                         in the correct order same as the previous method.
 *   trimToSize() =>This method is used to trim the capacity of the instance of the ArrayList to the list's current size.
 */