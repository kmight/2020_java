package com.ict.edu;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// 숫자를 받아서 홀수, 짝수를 구분하자
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int su = sc.nextInt();
		String result ="";
		
		if(su%2 == 0) {
			result = "짝수";
		} else {
			result = "홀수";
		}
		System.out.println("결과 : " + result);
		
		// 나라를 입력하면 수도가 출력되게 하자
		// 1.한국=서울 2.중국=베이징 3.일본=도쿄 나머지는 데이터 없음
		System.out.println("나라입력 : 1.한국=서울 2.중국=베이징 3.일본=도쿄 >> ");
		int num = sc.nextInt();
		result = "";
		if(num == 1) {
			result = "서울";
		} else if(num == 2) {
			result = "베이징";
		} else if(num == 3) {
			result = "도쿄";
		} else {
			result = "데이터 없음";
		}
		System.out.println("결과 : " + result);
		
		System.out.println("나라입력 : 한국, 중국, 일본 >> ");
		String nara = sc.next();
		result = "";
		switch (nara) {
		case "한국": result = "서울"; break;
		case "중국": result = "베이징"; break;
		case "일본": result = "도쿄"; break;

		default: result = "데이터 없음"; break;
		}
		/*
		if(nara == "한국") {
			result = "서울";
		} else if(nara == "중국") {
			result = "베이징";
		} else if(nara == "일본") {
			result = "도쿄";
		} else {
			result = "데이터 없음";
		}
		*/
		
		System.out.println("결과 : " + result);
		
		// 근무시간이 8시간까지는 시간당 8590원이고
		// 8시간 초과한 시간 만큼은 1.5배 지급한다.
		// 근무시간을 입력해서 알바금액을 산정하자
		
		System.out.print("알바시간 : ");
		Scanner sc1 = new Scanner(System.in);
		
		int time = sc1.nextInt();
		int dan = 8590;
		int pay = 0;
		
		if(time <= 8) {
			pay = time * dan;
		} else {
			pay = (time * dan) + (int)((time - 8)*dan*1.5);
		}
		System.out.println("알바금액은 " + pay + "입니다.");
		
		// menu가 1이면 카페모카 3500원, 2이면 카페라떼 4000,
		// 3이면 아메리카노 3000, 4이면 과일쥬스 3500이다.
		// 친구와 2잔을 10000내고 먹었다
		// 메뉴를 고른 결과와 잔돈을 출력 (단, 부가세 10% 포함)
		
		System.out.println("menu선택:1.카페모카(3500), 2.카페라떼(4000)"
				+ "3.아메리카노(3000), 4.과일쥬스(3500) >> ");
		Scanner sc2 = new Scanner(System.in);
		
		int jandon = 0;
		int danga = 0;
		String menuName = "";
		int menu = sc.nextInt();
		
		if(menu == 1) {
			menuName = "카페모카";
			danga = 3500;
			jandon = 10000 - (danga * 2) - (int)((danga * 2)*0.1); 
		} else if(menu == 2) {
			menuName = "카페라떼";
			danga = 4000;
			jandon = 10000 - (danga * 2) - (int)((danga * 2)*0.1); 
		} else if(menu == 3) {
			menuName = "아메리카노";
			danga = 3000;
			jandon = 10000 - (danga * 2) - (int)((danga * 2)*0.1); 
		} else if(menu == 4) {
			menuName = "과일쥬스";
			danga = 3500;
			jandon = 10000 - (danga * 2) - (int)((danga * 2)*0.1); 
		}
		System.out.println("선택메뉴는 " + menuName + "입니다. ");
		System.out.println("잔돈은 " + jandon + "원 입니다.");
		
	} // main
} // class










