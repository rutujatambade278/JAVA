package learn;

import java.util.Scanner;

public class Nest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   int marks=sc.nextInt();
   System.out.println("enter the marks");
   if (marks ==35)
   {System.out.println(" passed");
   if(marks>35 && marks<50)
   {System.out.println("student get d grade");
	
   if(marks>50 && marks>60)
  {System.out.println("students get c grade");
  
  
 if (marks<60 && marks>70)
 {
	 System.out.println("student get b grade");
 
 
 if (marks<=70 && marks>80)
 {
	 System.out.println("student get A grade");
 

 if(marks<=90 && marks >100)
 {System.out.println("student pass with distinction");
 
 }else {
	 System.out.println("not distinction");
}
  }else {
	  System.out.println("not A grade");
 }
 }else {
	 System.out.println("not B grade");
 }
  }else {
	  System.out.println("not C grade ");
  }
   }else {
	   System.out.println("not D grade");
   }
}else {
	System.out.println("failed");
}
  }
}