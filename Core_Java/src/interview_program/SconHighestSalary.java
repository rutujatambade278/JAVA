package interview_program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.LongStream;

import Java8.Employee;

public class SconHighestSalary {
 
	

	public static void main(String[] args) {

        List<Employees> emp = Arrays.asList(
            new Employees(1, "rutuja", 24, 25000, "MCS"),
            new Employees(2, "lata", 23, 30000, "MCS"),
            new Employees(3, "Neha", 23, 36000, "MCA"),
            new Employees(4, "sejal", 22, 15000, "Eng.Civil")
        );

        // secondHighestSalary = emp.stream()
//                                      .mapToLong(Employees::getSalary)
//                                      .distinct()
//                                      .sorted()
//                                      .skip(emp.size() > 1 ? emp.size() - 2 : 0)
//                                      .findFirst()
//                                      .orElse(0);
//   
//        long forthsalary=emp.stream().mapToLong(Employees::getSalary).boxed().distinct().sorted(Comparator.reverseOrder())
//   			 .skip(3).findFirst().orElse( (long)0);
//        		                              
//        System.out.println("Second highest salary: " + forthsalary);
        
       long secHighSalary = emp.stream().mapToLong(Employees::getSalary).boxed().distinct().sorted
    		   (Comparator.reverseOrder()).skip(1).findFirst().orElse((long)0);

}
}
