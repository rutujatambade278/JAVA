package Java8;

public class MyInternimpl implements MyIntern{

	@Override
	public void run() {
		System.out.println("say hii");
		}
	
	public static void main(String[] args) {
		
//		MyIntern i=new MyIntern() {
//			
//			@Override
//			public void run() {
//			 System.out.println("Anonymous class ");
//				
//			}
//		};
//		
//		i.run();
//		MyIntern i2= new MyIntern() {
//			
//			@Override
//			public void run() {
//				System.out.println("another object creation...");
//			}
//		};
//		i2.run();
		
		MyIntern i=()->System.out.println("lambda...");
		
		i.run();
	}
}
