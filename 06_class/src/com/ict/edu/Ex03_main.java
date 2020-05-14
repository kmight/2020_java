package com.ict.edu;

public class Ex03_main {
	public static void main(String[] args) {
		System.out.println(1);
		// Ex03 클래스를 객체로 만들자
		// Ex03에 생성자가 없으면 기본 생성자 사용
		Ex03 ex03 = new Ex03();
		
		System.out.println(2);
		// 반환형이 없으므로 받아서 저장할 것도 없다.
		ex03.add();
		System.out.println(3);
		int res = ex03.mul();
		System.out.println(4);
		System.out.println(res);
	}
}
