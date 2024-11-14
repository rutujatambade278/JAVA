package interview_program;

import java.util.Scanner;

public class Squreroot {
 
	
	public int findsqure(int n) {
		
		if(n==0 || n==1) 
			return n; 
			
			int star=1, end=n/2,ans=0;
			
			while(star<=end) {
				int mid=star+(end-star)/2;
				int sqr=mid*mid;
				if(sqr==n) 
					return mid;
				
				if(sqr<=n) {
					star=mid*1;
					end=mid;
					
				}else {
					end=mid-1;
				}
			}
			return ans;
	}
	public static void main(String[] args) {
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number");
//		int number=sc.nextInt();
//		
//		System.out.println("squre root:"+number);
		
	//	System.out.println("")
	}
	
}
