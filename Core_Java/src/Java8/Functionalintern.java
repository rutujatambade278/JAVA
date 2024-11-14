package Java8;

public interface Functionalintern {
	
	 public int sum(int a,int b);
	 
	 public static void main(String[] args) {
		
		 Functionalintern i1= (int a,int b)->
		 {
			 return a+b;
		 };
	
		 System.out.println(i1.sum(10, 20));
	}

}
