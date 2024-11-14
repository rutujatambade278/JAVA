package interview_program;

import java.util.Arrays;

public class PrintArray {

	public static void main(String[] args) {
		
		
		String [] arr= {"10","20","30"};
		Arrays.asList(arr).forEach(element->System.out.println(element));
 
		
		Arrays.asList(arr).forEach(System.out::println);
		
		
		System.out.println(Arrays.toString(arr));
	}
 
}
