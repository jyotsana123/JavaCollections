import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Check nishu is present in array or not - you can check by applying for loop and if condition OR by converting this to arrayList
		//Convert array to arraylist
		String name[] = {"Ram", "Shyam", "Nishu", "Neelu", "Prem"};
		//To convert array to arrayList there is one class Arrays.asList()
		List<String> nameList = Arrays.asList(name);
		System.out.println(nameList.contains("Nishu"));
	}

}
