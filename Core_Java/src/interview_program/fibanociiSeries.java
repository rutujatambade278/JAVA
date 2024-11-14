package interview_program;

public class fibanociiSeries {
	
	
	public static void main(String[] args) {
		
		
		int n=10;
		int firstNum=0;
		int secNum=1;
		
		System.out.println("fabinocii series :" +n+ "terms");
		
		for(int i=1; i<=n; ++i) {
			System.out.println(firstNum +"");
		
		int number=firstNum+secNum;
		firstNum=secNum;
		secNum=number;
	}
		
	}
}

 