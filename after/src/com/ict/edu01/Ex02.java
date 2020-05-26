package com.ict.edu01;

public class Ex02 {
	public static void main(String[] args) {
		// 선언 -> 생성 - > 저장  -> 출력
		
		// char[] su2 ;
		// su2 = new char[4] ;
		
		// 선언과 생성을 한번에
		char[] su2 = new char[4];
		
		// 데이터 저장
		su2[0] = 'b';
		su2[1] = 'o';
		su2[2] = 'y';
		su2[3] = 's';
		
		// 출력
		for (int i = 0; i < su2.length; i++) {
			System.out.println(su2[i]);
		}
		System.out.println("==================");
		
		for (char k : su2) {
			System.out.println(k);
		}
		System.out.println("==================");
		
		// 선언과 생성을 한번에 
		// String배열만들고 저장내용: "java", "jsp", "html", "css", "jQuery"
		String[] su3 = new String[5];
		
		su3[0] = "java";
		su3[1] = "jsp";
		su3[2] = "html";
		su3[3] = "css";
		su3[4] = "jQuery";
		
		for (int i = 0; i < su3.length; i++) {
			System.out.println(su3[i]);
		}
		System.out.println("===========");
		for (String k : su3) {
			System.out.println(k);
		}
		
		// 선언과 생성과 데이터저장 한번에 
		int[] su4 = {10,200,3000,40000};
		for (int i = 0; i < su4.length; i++) {
			System.out.println(su4[i]);
		}
		System.out.println("===========");
		
		for (int k : su4) {
			System.out.println(k);
		}
		
		// String배열만들고 저장내용("java", "jsp", "html", "css", "jQuery")
		
		
		
		
		
		
		
		
		
		
		
	}
}
