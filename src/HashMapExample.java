import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//this interface takes the value in key value pairs
		//https://beginnersbook.com/2013/12/hashmap-in-java-with-example/
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "hi");
		hm.put(1, "bye");
		hm.put(42, "good");
		hm.put(4, "morning");
		System.out.println(hm.get(42));
		hm.remove(42);
		System.out.println(hm.get(42));
		//To iterate the HashMap, we are using entrySet() method. This method returns an equivalent Set. This is to pass the key-value pairs to the Map.
//		Set sm = hm.entrySet(); //now it's converted into set
//		Iterator<String>it = sm.iterator();
//		it
		for(Entry<Integer, String> s : hm.entrySet()) //by this we can iterate key and values of HashMap
		{
			System.out.print("Key is:" +s.getKey()+" ");
			System.out.println("Value is:" +s.getValue()+"");
		}
		
	}

}
