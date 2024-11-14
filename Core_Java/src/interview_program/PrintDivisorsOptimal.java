package interview_program;

import java.util.Scanner;

public class PrintDivisorsOptimal {
  
	
	public static void squreoptimal(int n) {
		System.out.println("print number:"+n);
	
	for(int i=1; i<=Math.sqrt(n); i++) {
		if(n%i==0) {
			System.out.println("i:"+i);
				if(i!=n/i){
					System.out.println((n/i)+"");
				}
			}
		}
	System.out.println("  ");
	}
	
	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		 int number=  sc.nextInt();
	
		
		PrintDivisorsOptimal.squreoptimal(number);
	}
}
