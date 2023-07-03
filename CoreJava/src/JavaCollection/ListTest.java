package JavaCollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
//		List<String> list = new ArrayList<>();
		List<String> list = new LinkedList<>();
		
		list.add("hari");
		list.add("sita");
		list.add("ram");
		
		//list.remove(2);
		list.remove("sita");
		System.out.println(list.contains("ram")); // to check the data present of not
		
		list.clear();
		for(String s : list) {
			System.out.println(s);
		}
	}
}
