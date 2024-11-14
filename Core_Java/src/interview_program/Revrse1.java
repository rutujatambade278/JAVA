package interview_program;
import java.util.Scanner;

public class Revrse1 {

         public static String reverseWords(String input) {
	      String[] words = input.split(" ");
	       StringBuilder reversedString = new StringBuilder();
            for (String word : words) {
	        reversedString.append(new StringBuilder(word).reverse().toString()).append(" ");
	        }
              return reversedString.toString().trim();
	    }
         public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a string: ");
	        String input = scanner.nextLine();
	        String result = reverseWords(input);
	        System.out.println("Reversed words string: " + result);
	        scanner.close();
	    }
	}

//package interview_program;
//
//public class Revrse1 {
//
//    public static String reverseWords(String input) {
//        String[] words = input.split(" ");
//        StringBuilder reversedString = new StringBuilder();
//        for (String word : words) {
//            reversedString.append(new StringBuilder(word).reverse().toString()).append(" ");
//        }
//        return reversedString.toString().trim();
//    }
//
//    public static void main(String[] args) {
//        // Input string directly
//        String input = "hello how are you?";  // You can modify this string as needed
//        String result = reverseWords(input);
//        System.out.println("Reversed words string: " + result);
//    }
//}
