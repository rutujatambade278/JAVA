package Java8;

public interface MyThrad {
	
	
	public static void main(String[] args) {
		
	 Runnable thread= ()->{
		 
		 for(int a=0; a<=10; a++) {
			System.out.println("value is a :"+ a*2);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	 };
	 
	 Thread t=new Thread(thread);
	 t.setName("Rutuja");
	 t.start();
	}

}
