package com.ict.edu01;

public class Ex01 {
	public static void main(String[] args) {
		// 배열 : 같은 자료형의 데이터(값)를 한 곳에 모아둔 묶음
		//        반드시 같은 자료형일때만 저장 가능
		//        배열을 생성할 때 반드시 크기를 지정해야 한다.
		//        한번 크기를 지정하면 변경할 수 없다.
		//        배열의 출력은 일반적으로 for문을 사용한다.
		
		// 배열 생성 순서 : 선언 => 생성 => 데이터저장 => 출력
		// 1. 선언 : 자료형[]  이름 ;
		// su를 선언한다.
		int[] su ;
		
		// 2. 생성 :  이름 = new 자료형[크기=갯수=1부터시작]
		// new => 객체 생성하자는 예약어,
		// 5개의 방이 만들진다. => 만들어진 주소를 su에게 저장한다.
		su = new int[5] ;
		
		// 3. 데이터 저장 : su[index=방번호=0부터시작] = 데이터
		su[0] = 14 ;
		su[1] = 250 ;
		su[2] = 362 ;
		su[3] = 21 ;
		su[4] = 8 ;
		
		// 출력
		System.out.println(su);     // 배열의 주소
		System.out.println("============");
		
		System.out.println(su[0]);  // 방 안에 데이터가 나온다.
		System.out.println(su[1]);  // 방 안에 데이터가 나온다.
		System.out.println(su[2]);  // 방 안에 데이터가 나온다.
		System.out.println(su[3]);  // 방 안에 데이터가 나온다.
		System.out.println(su[4]);  // 방 안에 데이터가 나온다.		
		System.out.println("============");
		
		for (int i = 0; i < 5; i++) {
			System.out.println(su[i]);
		}
		System.out.println("============");
		
		System.out.println("개선된 for"); // => 배열, 켈렉션
		for (int k : su) {
			System.out.println(k);
		}
		
		System.out.println("===============================");
		// char 배열의 방 4개 짜리 
		// j, a, v, a 을 방에 넣어 주세요 
		// 출력도 해주세요 
		char[] su2 ;
		su2 = new char[4];
		su2[0] = 'j';
		su2[1] = 'a';
		su2[2] = 'v';
		su2[3] = 'a';
		
		System.out.println(su2[0]);
		System.out.println(su2[1]);
		System.out.println(su2[2]);
		System.out.println(su2[3]);
		System.out.println("====================");
		
		for (int i = 0; i < su2.length; i++) {
			System.out.println(su2[i]);
		}
		System.out.println("====================");
		
		for (char k : su2) {
			System.out.println(k);
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}





