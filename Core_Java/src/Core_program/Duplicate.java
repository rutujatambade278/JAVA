package Demo;

public class Duplicate {

	public static void main(String[] args) {
		

		int a[]= {12,34,56,75,34,23,1,74};
		int b[]= {34,7,654,35,25,2,74,34};
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b.length; j++) {
				if(a[i]==b[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}

}
