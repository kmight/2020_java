package com.ict.edu3;

public class Student extends Person{
	private int id;

	/*
	// 부모가 기본생성자가 없으면 자식도 기본 생성자를 쓸 수 없다
	// super()가 생략되어 있기 때문에!
	public Student() {
		// super(); // super()가 생략. 부모생성자에 기본생성자가 없어서 오류
		// super("태권브이", 24); // 1. 오류아님
		// 2. Person에 기본생성자를 만들면 오류 아님
	}
	*/
	
	public Student(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void print(){ // 지역변수 없는전역변수는 super생략
		System.out.println("이름 : " + super.getName() + " 나이 : " + getAge() + " 학번 : " + id);
	}
}
