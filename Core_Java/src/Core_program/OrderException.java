package Core_program;

public class OrderException {
	public static void main(String[] args) {
		
		try {
			System.out.println(10/0);
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
//		catch (ArithmaticException ae) {
//			System.out.println(ae.getMessage());
//		}
		finally {
			System.out.println("Always Executed Method");
		}

	}

}
