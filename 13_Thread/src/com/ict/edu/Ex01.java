package com.ict.edu;

public class Ex01 {
	public static void main(String[] args) {
		// 현재 실행중인 스레드의 이름을 호출
		System.out.println(Thread.currentThread().getName());
		
		Ex02 test = new Ex02();
		test.play();
		System.out.println(1);
		String name = test.sound();
		System.out.println(name);
		System.out.println(2);
		System.out.println("===================");
		
		Ex03 test2 = new Ex03();
		System.out.println(Thread.currentThread().getName() + ": 1");
		test2.go();
		System.out.println(Thread.currentThread().getName() + ": 2");
		//test2.run();
		test2.start();
		System.out.println(Thread.currentThread().getName() + ": 3");
		
		
	}
}
