package com.oops.Abstraction;

public class MainTable extends Table {

	@Override
	public void printNumber() {
		for(int i=1; i<10; i++) {
			System.out.print(i);
		}
	}

}
