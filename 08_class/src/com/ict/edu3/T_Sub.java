package com.ict.edu3;

public class T_Sub extends T_Super{
	String addr;
	int car;
	
	public T_Sub() {
		// this(); // 오류, 자기가 자기를 호출.
		//super(); // 보통 생략되어 있다.
		//this("서울 홍대입구");
		System.out.println("자식생성자1");
	}
	public T_Sub(String addr) {
		//super(); // 보통 생략
		//this(2);
		this.addr = addr;
		System.out.println("자식생성자2");
	}
	public T_Sub(int car) {
		//super(); // 생략
		this.car = car;
	}
	public T_Sub(String addr, int car) {
		this.addr = addr;
		this.car = car;
	}
	public T_Sub(int car, String addr) {
		this.addr = addr;
		this.car = car;		
	}
	
	
}
