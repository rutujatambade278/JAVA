package Micro;

public interface Bank_loan1 {
	public void amount( float loan,String roi,double amount);

	}

    class Bank1 implements Bank_loan1{

    	
	@Override
	public void amount(float loan_roi, String name, double amount) {
		// TODO Auto-generated method stub
		double pi=loan_roi*amount/100;
		System.out.println(pi);
	}

public class Bank_loan2 {
	
	
}
    public static void main(String[]args) {
    	Bank_loan1 b=new Bank1();
      b.amount(7.5f, "Abc", 12000);
	 
}
}
