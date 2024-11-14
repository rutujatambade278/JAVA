package Exception;

public class CustomException extends Exception {

	
	  public CustomException() {
		   
		   System.out.println("CustomException...");
		   
	}
	
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    try {
    	throw new CustomException();
    	
    }catch(CustomException e) {
    	System.out.println(e);
    }
	}

}
