package Collection;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class StartCode {
 
	
	public static void main(String[] args) {
		
		
		ArrayList<String > list=new ArrayList<>();
		list.add("rutu");
		list.add("lata");
		list.add("Shruta");
		list.add("neha");
		list.remove(2);
		list.stream().collect(Collectors.toList());
		
		System.out.println(list);
	}
}
