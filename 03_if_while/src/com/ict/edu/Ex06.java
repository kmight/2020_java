package com.ict.edu;

public class Ex06 {
	public static void main(String[] args) {
		// 다중 for문 : for문안에 다른 for문이 존재하는 것
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				//System.out.println("i=" + i + ", j=" + j);
			}
		} // for
		
		// 구구단1
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
		} // for
		System.out.println("===========================");
		// 구구단2
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i + " * " + j + " = " + i*j + " ");
				if(j == 9) System.out.println();
			}
		} // for
		System.out.println("===========================");
		// 구구단3
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j + " * " + i + " = " + i*j + " ");
				if(j == 9) System.out.println();
			}
		} // for
		
	} // main
} // class
