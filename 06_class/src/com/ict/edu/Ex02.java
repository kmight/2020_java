package com.ict.edu;

public class Ex02 {
	// 멤버필드 : 상태값, 속성, 특징, 데이터
	// instance 필드 : 객체생성할 때 같이 생성되는 필드 
	// static 필드 : 객체 생성과 상관없이 먼저 생성되는 필드, static 표시
	// final이 붙으면 더이상 값이 변하지 않는다.
	// final 있으면 => 상수
	// final 없으면 => 변수

	int kor = 80;              // 인스턴스 변수
	static int ENG = 85;       // static 변수
	final int math = 90;       // 인스턴스 상수
	final static int COM = 95; // static 상수 (보통 상수 표현)
}
