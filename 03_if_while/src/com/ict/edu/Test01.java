package com.ict.edu;

public class Test01 {
	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(j + "*" + i + "=" + (i*j)+"\t");
				if(j % 3 == 0) {
					System.out.println();
				}
				break;
			}
		}
	}
}
