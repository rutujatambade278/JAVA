package Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenNumber {
 
	
	public static void main(String[] args) {
		
		
		List<Integer> list=Arrays.asList(11,23,23,11,12,34,12,17,41,50);
		
		//find the even number
		list.stream().filter(n ->n%2==1).forEach(System.out::println);
		
		 System.out.println("------------------start 1 --------------");
	   //starts with 1
		List<String> newlist=list.stream().map(s -> s + "").filter( s -> s.startsWith( "1")).collect(Collectors.toList());
		 System.out.println(newlist);
		
		 //duplicate data remove
		 System.out.println("-----------------dublicate data remove---------------");
		 list.stream().distinct().forEach(dublicatedata -> System.out.println(dublicatedata));
		 
		 System.out.println("--------------------doublicate------------");
		  
		 Set<Integer> set=new HashSet<>();
		 list.stream().filter( n-> !set.add(n)).forEach(System.out::println);
		 
		 System.out.print("------------------------count element------------------------------");
		 long count= list.stream().count();
		 System.out.println(count);
		 
		 
		 
		 
		 System.out.print("------------------------reverse element------------------------------");
		 
		 list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);;
		
	}
	
	
}
