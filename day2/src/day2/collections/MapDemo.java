package day2.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, String> statesCapitals=new HashMap<>();
		statesCapitals.put("hyderabad", "TS");
		statesCapitals.put("mumbai", "MH");
		statesCapitals.put("amaravati", "AP");
		statesCapitals.put("bhopal", "MP");
		statesCapitals.put("lucknow", "UP");
		
		System.out.println(statesCapitals);
		
		System.out.println(statesCapitals.get("hyderabad"));
		
		Set<String> keys=statesCapitals.keySet();
		for(String key:keys) {
			System.out.println(key+" ---> "+statesCapitals.get(key));
		}

		Map<Integer, Emp> empMap=new HashMap<>();
		empMap.put(100, new Emp(100, "Pavan", "Hyderabad", 56000));
		empMap.put(101, new Emp(101, "Chetan", "Bangalore", 56000));
		empMap.put(102, new Emp(102, "Chandra", "Hyderabad", 56000));
		empMap.put(103, new Emp(103, "Kiran", "Hyderabad", 56000));
		empMap.put(104, new Emp(104, "Amit", "Hyderabad", 56000));
		empMap.put(105, new Emp(105, "Shantanu", "Hyderabad", 56000));
		
		Set<Integer> empKeys=empMap.keySet();
		for(Integer i:empKeys) {
			Emp e=empMap.get(i);
			System.out.println(e.getEmpId()+" "+e.getName());
		}
		
	}

}
