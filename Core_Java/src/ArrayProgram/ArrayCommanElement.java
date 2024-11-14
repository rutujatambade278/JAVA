package ArrayProgram;

import java.util.Arrays;

public class ArrayCommanElement {
 
	
	public static void main(String[] args) {
		
//		int[]m=new int[] {22,34,12,46,58,9,23,66,12};
//		int[]n=new int[] {23,4,56,35,24,89,12,22,12,66};
//	
//		
//		for(int a=0; a<m.length; a++) {
//			for(int b=a+1; b<n.length; b++) {
//				if(m[a]==n[b]) {
//					System.out.println("comman element is find:"+n[b]);
//					
//			
//				}
//			}
//			}
//		for(int a:m) {
//			System.out.println(a);
//		}
		
		
		int a[]= {12,34,56,36,88,99,88,99};
		int b[]= {23,44,67,89,00,55,88,99};
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<b.length; j++) {
				
				if(a[i]==b[j] ){
					System.out.println("comman element is:"+ a[i]);
				}
			}
		}
		
		
		}
}
