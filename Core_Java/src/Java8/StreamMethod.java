package Java8;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMethod {
 
	
	public static void main(String[] args) {
		
		
		List<String> list= List.of("rutu","neha","niki","shruta","sejuu","Anu");
		List<String> newlist= list.stream().filter(e -> e.startsWith("s")).collect(Collectors.toList());
		   System.out.println(newlist);
		   
	List<Integer> number=List.of(22,4,2,33,23,11,23,21,31);
	List<Integer> newlist1=number.stream().map(i -> i * 2).collect(Collectors.toList());
	    System.out.println(newlist1);
    number.stream().sorted().forEach(System.out:: println);
	    Integer minimum=number.stream().min(( x,y)-> x.compareTo(y)).get();
	    System.out.println("minimum number :" + minimum);
	    
	}
}
