package com.ict.edu3;

public class T_Super {
	String name;
	int age;
	
	// 부모가 만들 수 있는 생성자. 아무말 없으면 기본 생성자
	
	public T_Super() {
		System.out.println("부모생성자1");
	}
	
	
	public T_Super(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	
	
}
