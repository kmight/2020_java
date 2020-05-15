package com.ict.edu;

public class Ex11_main {
	public static void main(String[] args) {
		// 객체생성
		Ex11 t1 = new Ex11("둘리");
		
		System.out.println(t1.getName());
		System.out.println(t1.getAge());
		System.out.println(t1.getAddr());
		System.out.println("=======================");
		
		// t1 데이터를 변경하자
		// 둘리, 5000, 남극으로 변경하자
		
		t1.setName("정복교");
		t1.setAge(48);
		t1.setAddr("힐스테이트");		
		System.out.println("이 름\t나 이\t주 소");
		System.out.print(t1.getName() + "\t");
		System.out.print(t1.getAge() + "\t");
		System.out.println(t1.getAddr());
		System.out.println("=======================");
		
		Ex11 t2 = new Ex11();		
		System.out.println(t2.getName());
		System.out.println(t2.getAge());
		System.out.println(t2.getAddr());
		System.out.println("=======================");
		
		Ex11 t3 = new Ex11("장길산", 47, "함경도");
		System.out.println(t3.getName());
		System.out.println(t3.getAge());
		System.out.println(t3.getAddr());
		System.out.println("=======================");		
	}
}
