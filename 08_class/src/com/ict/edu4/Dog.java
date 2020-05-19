package com.ict.edu4;

public class Dog extends Animal {
	String name = "댕댕이";
	int age = 10;
	
	public void hobby() {
		System.out.println("산책하기");
	}
	
	@Override
	public void sound() {
		super.sound();
		System.out.println("멍~ 멍~");
	}
	
}
