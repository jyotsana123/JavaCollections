import java.util.*;
public class IterateArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> arr = new ArrayList<String>();
		arr.add("nishu");
		arr.add("neelu");
		arr.add(0,"amit");
		try
		{
		arr.add(5,"amita");
		System.out.println(arr);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		//iterate using iterator
		Iterator<String> it = arr.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("************************");
		
		//iterate using enhanced for loop
		for(String names : arr)
		{
			System.out.println(names);
		}
	}

}
