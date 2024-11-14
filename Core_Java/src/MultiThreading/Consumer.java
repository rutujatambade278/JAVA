package MultiThreading;

public class Consumer extends Thread {

	 Company c;
	  
	 Consumer(Company c){
		 this.c=c;
	 }
	 public void run() {
			
			int i=1;
			while(true) {
				this.c.counsume_item();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				i++;
			}
		}
	}

