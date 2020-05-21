package com.ict.edu01;

public class AbsTest3 {
	
	public void play() {
		new Abs() {

			@Override
			public void printData() {
				System.out.println("data3 : " + data);
			}
			
		}.printData();
	} // method
	
} // class
