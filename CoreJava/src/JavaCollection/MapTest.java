package JavaCollection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		
		// student name and age 
		
//		Map<String, Integer> map = new HashMap<>();
//		Map<String, Integer> map = new TreeMap<>();
		Map<String, Integer> map = new LinkedHashMap<>();
		
		map.put("Ram", 20);
		map.put("Hari", 25);
		map.put("Anu", 22);
		map.put("Hari", 25);
		
		for(String key : map.keySet()) {
			System.out.println(key + " = "+ map.get(key));
		}
	}
}
