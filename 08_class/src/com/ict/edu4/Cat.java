package com.ict.edu4;

public class Cat extends Animal {
	String name = "나비";
	int age = 10;
	
	public void hobby() {
		System.out.println("쥐잡이 놀이");
	}
	
	@Override
	public void sound() {
		System.out.println("야옹~ 야옹~");
	}
	
	/* final 메소드는 오버라이딩할 수 없다.
	 * 부모클래스가 sleep() final 처리
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		super.sleep();
	}
	*/
}
