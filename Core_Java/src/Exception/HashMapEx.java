package Exception;

import java.util.HashMap;

public class HashMapEx{

	public static void main(String[] args) {
		
		HashMap<String, Integer> hashMap = new HashMap<>();
       
		hashMap.put("one", 11);
		hashMap.put("Two", 2);
		hashMap.put("Three", 3);
		hashMap.entrySet();
	
		
		System.out.println(hashMap);
		
		hashMap.put("Two", 222);
		System.out.println("update value:"+hashMap);
	}

}
