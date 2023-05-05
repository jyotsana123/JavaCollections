import java.util.*;
import java.util.Collections;
public class ArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create arrayList
		ArrayList<String> fruits = new ArrayList<>();  
		//Add items in arraylist
		fruits.add("Banana");
		fruits.add("Apple");
		//Add at particular index	
		fruits.add(0,"Orange");
		fruits.add(1,"Papaya");
		System.out.println("Fruits are: " +fruits);
		//get fruits of particular index
		System.out.println(fruits.get(0));
		//Get index of any fruits from list
		System.out.println(fruits.indexOf("Apple"));
		//Check particular fruit availabe in the list or not
		System.out.println(fruits.contains("Papaya"));   //if contains it return true else false
		System.out.println(fruits.contains("Onion"));
		//Updating element
		System.out.println(fruits.set(2, "Grapes"));
		//Sort arraylist
		Collections.sort(fruits);
		for(String fruitsSorting : fruits)
		{
			System.out.println("Sorted elements are: "+fruitsSorting);
		}
		
		//Remove element from arraylist
		//System.out.println(fruits.remove(0));
		//System.out.println(fruits.remove("Apple));
	}

}
