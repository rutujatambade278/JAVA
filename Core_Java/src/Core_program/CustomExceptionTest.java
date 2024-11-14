package Core_program;

public class CustomExceptionTest {
 
	
	
	public void getOrder(int Orderid) throws OrderNotFoundException {
		if(Orderid==101) {
		throw new OrderNotFoundException("Order Not found in id:"+ Orderid);
	}
	else {
		
		//logic
	}
	}
		 public static void main(String[] args) throws OrderNotFoundException {
			 CustomExceptionTest test=new CustomExceptionTest();
			 test.getOrder(101);
			
		}
	
}
