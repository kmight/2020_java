package com.ict.edu01;

public class Ex07 {
	public static void main(String[] args) {
		AbsTest absTest = new AbsTest();
		absTest.printData();
		System.out.println("===================");
		
		AbsTest2 absTest2 = new AbsTest2();
		absTest2.abs.printData();
		System.out.println("===================");
		
		AbsTest3 absTest3 = new AbsTest3();
		absTest3.play();
		System.out.println("===================");
	}

}

