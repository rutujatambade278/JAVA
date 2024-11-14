package MultiThreading;

import java.util.Arrays;
import java.util.List;

public class DemoThread implements Runnable{
  
	 public void run() {
		
		 List<Integer> list=Arrays.asList(22,4,56,2456,12,5,3,56,66,43,23,11,56);
		System.out.println("print List:"+list);
		
	 }
	 
	 
	public static void main(String[] args) {
		 
		DemoThread t=new DemoThread();
		
		Thread th=new Thread(t);
		th.start();
		
	}
}
