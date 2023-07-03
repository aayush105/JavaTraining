package JavaCollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	
	public static void main(String[] args) {
//		Set<String> set = new HashSet<>(); // unique data only
//		Set<String> set = new TreeSet<>(); // unique + sorted 
		Set<String> set = new LinkedHashSet<>(); // unique +insertion order
		
		set.add("java");
		set.add("php");
		set.add("sql");
		set.add("php");
		set.add("html");
		set.add("css");
		set.add("java");
		
		for(String s : set) {
			System.out.println(s);
		}
	}
}
