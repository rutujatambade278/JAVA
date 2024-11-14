package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {

    public static void main(String[] args) {
        
        // Create an immutable list
        List<Integer> list1 = List.of(11, 22, 33, 44, 55, 66, 77);
        System.out.println("Original List: " + list1);

        // Use Stream API to filter even numbers
//        List<Integer> evenNumbers = list1.stream()
//                                         .filter(i -> i % 2 == 0)
//                                         .collect(Collectors.toList());
//
//        // Print the original and the filtered lists
//        System.out.println("Even Numbers: " + evenNumbers);
//        
        
          List<Integer> str= list1.stream().filter(i -> i%2==0).collect(Collectors.toList());
          System.out.println(str);
          
         
          String name[]= {"Rutu","lata","dipuu","neha","sejuu","niki"};
          Stream str1=Stream.of(name);
          str1.forEach(e ->{
        	  System.out.println(e);
          });
                   
          Stream newstream=   Stream.builder().build();
          
           
           
    }
}
