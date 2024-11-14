package Core_program;

public class TryCatchFinally {
	
	
	public static int m1() {
		
		try {
			return 1;
		}
		catch(Exception e){
			return 2;
			
		}finally {
			System.exit(0);
			return 3;
		}
			
		}
	public static void main(String[]args) {
		System.out.println(TryCatchFinally.m1());
	}

}//finally Always Execute 

