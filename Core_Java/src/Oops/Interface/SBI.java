package com.oops.Interface;

public class SBI implements Bank {

	@Override
	public void homeLoan(double amount, float r, int t) {
		
	
			double TotalIntrest=(amount*r*t)/100;
					
					System.out.println("principle amount:"+amount);
					System.out.println("rate of intrest:"+r);
					System.out.println("total time(in month):"+t);
					
				   System.out.println("Total Intrest:"+TotalIntrest);
				
				}
	}


