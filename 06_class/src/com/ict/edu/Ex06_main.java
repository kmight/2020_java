package com.ict.edu;

public class Ex06_main {
	public static void main(String[] args) {
		
		Ex06 e6 = new Ex06();
		
		// getter
		System.out.println(e6.name);
		
		String s1 = e6.s_name();
		System.out.println(s1);
		
		
		System.out.println(e6.age);
		int s2 = e6.s_age();
		System.out.println(s2);
		
		// weight이 private이기 때문에 바로 접근할 수 없다.
		// System.out.println(e6.weight);
		
		// 메소드를 이용해서 접근한다. (getter)
		double s3 = e6.s_weight();
		System.out.println(s3);
		System.out.println();
		
		// setter
		// 이름을 둘리로 변경하자
		e6.re_name("둘리");
		// 확인
		System.out.println(e6.name);
		s1 = e6.s_name();
		System.out.println(s1);
		System.out.println();
		
		// 나이를 5000으로 변경하자
		e6.re_age(5000);
		// 확인
		System.out.println(e6.age);
		s2 = e6.s_age();
		System.out.println(s2);
		System.out.println();
		
		// 몸무게를 10000으로 변경하자
		// int는 double에 저장할 수 있다.
		e6.re_weight(10000);
		// 확인
		// System.out.println(e6.weight);
		s3 = e6.s_weight();
		System.out.println(s3);
		System.out.println();
		
	}
}
