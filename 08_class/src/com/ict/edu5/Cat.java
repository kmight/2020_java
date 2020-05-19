package com.ict.edu5;

// 중간에 Tiger클래스가 있긴 하지만 그냥 추상클래스로 body를
// 완성하지 않았다.
// Tiger를 상속받은 Cat은 Tiger가 완성하지 않은 body 완성

public class Cat extends Tiger {
	@Override
	public void like() {
		System.out.println("그루밍 하기");
		
	}
}
