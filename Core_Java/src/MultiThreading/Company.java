package MultiThreading;

public class Company {
 
	
	 int n;

	 synchronized void produce_item( int n) {
		 
		this.n=n;
		System.out.println("producre:"+this.n);
	}
	
	 synchronized public int counsume_item() {
		System.out.println("consume:"+this.n);
		return this.n;
	}
	 
	 
	 public static void main(String[] args) {
		
		 Company comp=new Company();
		 Producer p=new Producer(comp);
		 Consumer c=new Consumer(comp);
		 p.start();
		 c.start();
	}
}
