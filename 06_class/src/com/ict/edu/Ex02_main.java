package com.ict.edu;

import java.util.Random;

public class Ex02_main {
	public static void main(String[] args) {
		
		// static 멤버필드 호출
		System.out.println(Ex02.ENG);
		System.out.println(Ex02.COM);
		// static이 아니기 때문에 호출 못함. 오류, 인스턴스 <- 객체 생성후 호출해야 한다.
		// System.out.println(Ex02.kor); 
		// System.out.println(Ex02.math);
		
		// Ex02 클래스 객체 만들기
		// 클래스이름 참조변수 = new 생성자;
		// Ex02에 생성자가 없으면 기본생성자로 생성
		Ex02 test = new Ex02();
		
		// 멤버필드 호출
		/*
		System.out.println(test.kor);
		System.out.println(test.ENG);
		System.out.println(test.math);
		System.out.println(test.COM);
		
		System.out.println(test);
		System.out.println("--------------------");
		*/
		// API를 이용해서 static 메소드와 인스턴스
		// API에서 제공하는 Random클래스의 
		// nextInt(), nextInt(int bound), nextDouble()은 static이 아니므로
		// 클래스를 객체로 만들어서 사용해야 한다.
		
		// 1. 클래스를 객체로 만드는 방법
		//	클래스 참조변수 = new 생성자
		Random ran = new Random();
		// nextInt() : int 범위 안에서 무작위로 정수를 추출한다
		int res = ran.nextInt();
		System.out.println(res);
		System.out.println("--------------------");
		
		// nextInt(숫자) : 반환값 (0 - 숫자 전까지)
		//res = ran.nextInt(-5); // 0 - 5 까지
		res = ran.nextInt(5); // 0 - 5 까지
		System.out.println(res);
		System.out.println("--------------------");
		
		// 정해지지 않은(랜덤) 0.0 ~ 1.0미만의 실수
		double res2 = ran.nextDouble();
		System.out.println(res2);
		System.out.println("--------------------");
		// 0.32198875394595017
		// 0.9328889967587599
		// 0.06689153358428213
		
		// res2를 0-5까지의 정수로 표현하자
		res2 = (int)(res2 * 6);
		System.out.println(res2);
		//System.out.println((int)(res2 * 6));
		System.out.println("--------------------");
		
		// API에서 제공하는 static 메소드 사용하기
		// Math 클래스의 메소드들은 static이므로 객체 생성없이 사용가능
		// 클래스이름.멤버필드, 클래스이름.멤버메소드로 사용
		System.out.println(Math.random()); // 0.0 ~ 1.0 미만
		System.out.println("--------------------");
		
		// 원하는 정수까지로 랜덤 수 지정
		System.out.println((int)(Math.random()*6)); // 0 ~ 5 까지
		System.out.println("--------------------");
		
		// 변수와 상수의 차이
		// 메소드 : 기능, 동작,
		// 메소드 구성 : 접근제한자 메소드종류 반환형 메소드이름([인자]){ 실행내용 }
		// void는 되돌아갈때 결과가 없다.

	}
}








