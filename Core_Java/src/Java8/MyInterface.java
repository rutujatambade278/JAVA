package Java8;

import java.util.Arrays;
import java.util.List;

interface InterfaceDemo{
	  
	 
	 public void hii();
	 public void GoodNigt();
}
 class MyInterface implements InterfaceDemo{
	
		public static void main(String[] args) {
			 
			MyInterface obj=new MyInterface();
			obj.hii();
			obj.GoodNigt();
		}


	@Override
	public void hii() {
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
		
	}

	@Override
	public void GoodNigt() {
		List<String> list1= Arrays.asList("lata","neha","sejal","nikiti","shruta","dipuu");
		System.out.println(list1);
	 
		
	}

}
