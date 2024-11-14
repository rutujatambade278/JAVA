package com.oops.Interface;

interface In1 {
	   
    // public, static and final
    final int a = 10 ;
               
      
     void Table();
    // public and abstract method
    void display();
}
 
// A class that implements the interface.
class TestClass implements In1 {
   
	
	@Override
	public void Table() {
	  for(int i=0; i<10; i++) {
		  System.out.print(i);
	  }
	}
    // Implementing the capabilities of
    // interface
	//
    public void display(){ 
      System.out.println("Interface...."); 
    }
 

}
