
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//List interface - Can accept duplicate values
		//ArrayList, LinkedList, Vactor - Implementing List Interface
		//Array have fixed size where as arraylist grow dynamically
		//you can access and insert any value on any index
		ArrayList<String> a = new ArrayList<String>();  //you need to tell which kind of data you are going to pass in this array List
		a.add("rahul");
		a.add("java");
		a.add("java");
		System.out.println(a);
		a.add(0, "student");
		System.out.println(a);
		/*a.remove(0);
		a.remove("rahul");
		System.out.println(a);*/
		System.out.println(a.get(2));
		//Check testing keyword is present in arraylist or not
		System.out.println(a.contains("testing"));
		System.out.println(a.indexOf("java"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		
		Iterator<String> it = a.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
		//Array list is dynamic size array, No need to define size of array in advance
		//Array list have dynamic type where you can increase by adding and remove by deleting.
	}

}
