package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class SecondHighstSalary {
	
	
public static void main(String[] args) {
        
	 List<Employee> employees = Arrays.asList(
	            new Employee(1, "Aditi", 30, 100000, "F", "HR", "Mumbai", 1995),
	            new Employee(2, "Rahul", 25, 130000, "M", "Engineering", "Bangalore", 2000),
	            new Employee(3, "Vishal", 34, 110000, "M", "Engineering", "Mumbai", 1998),
	            new Employee(4, "Lakshmi", 28, 150000, "F", "HR", "Bangalore", 1992),
	            new Employee(5, "Priya", 24, 90000, "F", "Marketing", "Delhi", 2005),
	            new Employee(6, "Rohit", 29, 150000, "M", "Engineering", "Bangalore", 1999)
	        );

//	        long secondHighestSalary = employees.stream()
//	                                            .mapToLong(Employee::getSalary)
//	                                            .boxed()
//	                                            .distinct()
//	                                            .sorted(Comparator.reverseOrder())
//	                                            .skip(1)
//	                                            .findFirst()
//	                                            .orElse((long) 0);
	 
	 

	        //System.out.println("The second highest salary in the organization is: " + secondHighestSalary);
	 
	 
	 
//	 long secondhighstsalary=employees.stream().mapToLong(Employee::getSalary).boxed()
//			    .distinct().sorted(Comparator.reverseOrder()).skip(2).findFirst().orElse((long) 0);
//	 
//	 
//	 System.out.println(secondhighstsalary);
	 
	 
//	     long thirdsalary= employees.stream().mapToLong(Employee::getSalary).boxed().distinct()
//	    		 .sorted(Comparator.reverseOrder()).skip(2).findFirst().orElse((long)0);
//	      
//	     System.out.println(thirdsalary);

  
	 long forthsalary=employees.stream().mapToLong(Employee::getSalary).boxed().distinct().sorted(Comparator.reverseOrder())
			 .skip(3).findFirst().orElse( (long)0);
 
	 System.out.println(forthsalary);
}
	 
	}