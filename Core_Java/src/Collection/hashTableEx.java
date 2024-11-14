package Collection;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;


public class hashTableEx {
 
	
	public static void main(String[] args) {
		
		
		
		Hashtable< Integer, String> hash=new Hashtable<>();
		
		hash.put(1, "Ram");
		hash.put(2, "sham");
		hash.put(3, "sitaaa");
		hash.put(4, "gitaa");
		
		System.out.println("get the value by id="+hash.get(1));
		
		//System.out.println("hashlist"+hash);
		
		Enumeration<String> hashs=hash.elements();
		while(hashs.hasMoreElements()) {
			System.out.println(hashs.nextElement());
		}
		
	
		
	}
}
