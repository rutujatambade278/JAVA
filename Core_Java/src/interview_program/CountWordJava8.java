package interview_program;

import java.util.Arrays;

public class CountWordJava8 {
 
	
	public static void main(String[] args) {
		
		
		String str="old is gold";
		
		long count=Arrays.stream(str.split("\\s+")).count();
		
		System.out.println(count);
	}
}
