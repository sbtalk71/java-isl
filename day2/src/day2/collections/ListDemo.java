package day2.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<String> namesList = new ArrayList<String>();
		namesList.add("pavan");
		namesList.add("amit");
		namesList.add("chetan");
		namesList.add("kirti");
		namesList.add("govind");
		namesList.add("zakir");
		namesList.add("tarun");
		namesList.add("chetan");
		
		System.out.println(namesList);
		System.out.println(namesList.get(3));
		namesList.add(3, "ramu");
		
		Iterator<String> itr=namesList.iterator();
		
		/*while(itr.hasNext()) {
			String name=itr.next();
			System.out.println(name);
		}
		*/
		for(String s:namesList) {
			System.out.println(s);
		}
		
		
		//namesList.stream().forEach(System.out::println);
		

	}

}
