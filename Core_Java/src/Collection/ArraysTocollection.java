package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysTocollection {
 
	
	public static void main(String[] args) {
		
		
		String[] student= { "rutuja","lata","neha","nikita","sejal","shruti"};
		
		
		
		 System.out.println("Arrays Student:"+Arrays.toString(student));
		 
		 List<String> newlist=Arrays.asList(student);
		 System.out.println("convert element:"+newlist);
		 
		 
		 newlist.forEach(element-> System.out.println(element));
		 
		 
		 
	}
}
