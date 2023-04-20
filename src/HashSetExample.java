
import java.util.HashSet;
import java.util.Iterator;
public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Set interfce does not accept duplicate value
		//HashSet, TreeSet, LinkedHashSet - implements Set interface
		//there is no guarantee elements stored in sequential order, they may store in random order.
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("India");
		System.out.println(hs);
		hs.add("India");
		hs.add("China");
		hs.add("Japan");
		System.out.println(hs);
	    hs.remove("China");
	    System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		//How to traverse element of set through iterator
		//Ans - create object of set-hs, and the hs.iterator, It gives iterator object it, And by it.next you can traverse the all element of set
		Iterator<String> it = hs.iterator();
//		System.out.println(it.next());
//		System.out.println(it.next());
		
		//If you want to traverse 97th element out of 100 element in the set, what to do - you can not use it.next fro 97 times
		//You can use while loop with hashnext method, it check next index present or not and then print the value
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
	}

}
