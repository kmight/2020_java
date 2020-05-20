package com.ict.edu;

public class Ex02 {
	public static void main(String[] args) {

		try {
			String year = "1994";
			int age = 2020 - Integer.parseInt(year);
			System.out.println("나이 : 만 " + age + "세");
			System.out.println("--------------------");
			
			String year2 = "1994년";			
			int age2 = 2020 - Integer.parseInt(year2);			
			System.out.println("나이 : 만 " + age2 + "세");
		} catch (Exception e) {
			System.out.println("예외상황발생 : " + e);
		}
		System.out.println("수고하셨습니다.");
		
	}
}
