package ArrayProgram;

import java.util.Arrays;

public class ArraySecondlastNumber {
 
//	
//	public static int getsecondhighestno(int a[],int total) {
//		
//		Arrays.sort(a);
//		return a[total-2];
//		
//	}
//	public static void main(String[] args) {
//		
//		int []a=new int[] {22,54,24,76,85,32,15,14,675,67,90};
//		
//		System.out.println("second highst number:"+getsecondhighestno(a, 11));
//		
//		
//		
//		
//		
//		
//}
	
	
	public static int secondNumberInArray(int[] a,int total) {
		
		Arrays.sort(a);
		return a[total-2];
		
	}
	public static void main (String []args) {
		
		int a[]=new int[] {34,6,5,33,24,667,88,99,223,334,56,876};
		
		System.out.println("Second Highest Number Array:"+secondNumberInArray(a, 12));
	}
}
