package com.ict.edu;

public class Ex03 {
	public static void main(String[] args) {
		// 중첩 if문 : if문을 여러개 사용한 문
		// 형식) if(조건식1){
		//			조건식1이 참일때 실행문장;
		//		 } else if(조건식2){
		//		    조건식1은 거짓이고, 조건식2가 참인 경우 실행문장;
		//		 } else if(조건식3){
		//		    조건식1,2는 거짓이고, 조건식3이 참인 경우 실행문장;
		//		 } else {
		//		    조건식1,2,3 모두 거짓일때, 즉 나머지
		//       }
		
		// int k1의 정수가 90이상이면 A, 80이상이면 B, 70이상이면 C, 나머지 F
		int k1 = 88;
		String res = "";
		if (k1 >= 90) {
			res = "A";
		} else if (k1 >= 80) {
			res = "B";
		} else if (k1 >= 70) {
			res = "C";
		} else {
			res = "F";
		}
		System.out.println("결과 : " + res);
		
		// char k2가 대문자인지, 소문자인지, 기타문자인지 판별
		
		// char k3가 A,a이면 아프리카 B,b이면 브라질 C,c이면 캐나다 나머지 한국
		
		// menu가 1이면 카페모카 3500, 2이면 카페라테 4000, 3이면 아메리카노 3000
		// 4이면 과일쥬스 3500이다. 친구와 2잔을 10000 내고 먹었다
		// 잔돈은 얼마인가? (단, 부가세 10% 포함)
		int menu = 1;
		String drink2 = "";
		System.out.println("=====리펙토링 : 1. 중복코딩을 줄이자");
		
		int dan2 = 0;
		
		if(menu == 1) {
			dan2 = 3500;
			drink2 = "카페모카";
		} else if(menu == 2) {
			dan2 = 4000;
			drink2 = "카페라떼";
		} else if(menu == 3) {
			dan2 = 3000;
			drink2 = "아메리카노";
		} else if(menu == 4) {
			dan2 = 3500;
			drink2 = "과일쥬스";
		} // if
		int su2 = 2 ;
		int total2 = dan2 * su2 ;
		int vat2 = (int)(total2 * 0.1);
		int input2 = 10000;
		int output2 = input2 - (total2 + vat2);
		System.out.println("잔돈 : " + output2);

	}
}
