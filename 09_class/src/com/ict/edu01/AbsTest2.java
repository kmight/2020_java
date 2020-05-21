package com.ict.edu01;

public class AbsTest2 {
	// 추상클래스를 상속받지 않고 바로 객체 생성
	Abs abs = new Abs() {
		
		@Override
		public void printData() {
			System.out.println("data2 : " + data);
		}
	};

}
