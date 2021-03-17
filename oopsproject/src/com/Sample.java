package com;
import oopsproject.*;

public class Sample extends SavingsAccount{
	
	public void process() {
		System.out.println("****process()*****");
		process2();
	}
	private void process2() {
		System.out.println("****process()*****");
	}
	protected void process3() {
		System.out.println("****process()*****");
	}
	 void process4() {
		System.out.println("****process()*****");
	}
//	 this.
}
