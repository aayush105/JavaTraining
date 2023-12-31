package JavaCollection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionTest {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(5,64,864,816,54,65,1,3,21);
		Collections.sort(list);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
	
		System.out.println(Collections.frequency(list, 5)); // no of 5 in the list i.e 1
	}
}
