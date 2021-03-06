package com.ict.edu;

public class Ex04 {
	public static void main(String[] args) {

		// char k1이 A이면 아프리카, B이면 브라질, C이면 캐나다 나머지 한국
		char k1 = 'B';
		String res = "";

		switch (k1) {
		case 'A':
			System.out.println("아프리카");
			break;
		case 'B':
			System.out.println("브라질");
			break;
		case 'C':
			System.out.println("캐나다");
			break;
		default:
			System.out.println("한국");
			break;
		}
		
		char k2 = 'B';
		switch (k2) {
		case 'A':
			res = "아프리카";
			break;
		case 'B':
			res = "브라질";
			break;
		case 'C':
			res = "캐나다";
			break;
		default:
			res = "한국";
			break;
		}
		System.out.println(res);

		// char k3이 A,a이면 아프리카, B,b이면 브라질, C,c이면 캐나다 나머지 한국
		char k3 = 'C';
		switch (k3) {
		case 'A':
		case 'a':
			res = "아프리카";
			break;
		case 'B':
		case 'b':
			res = "브라질";
			break;
		case 'C':
		case 'c':
			res = "캐나다";
			break;

		default:
			res = "한국";
			break;
		}
		System.out.println("결과 : " + res);

		// int k4가 1 또는 3이면 남자, 2 또는 4 이면 여자
		int k4 = 1;
		switch (k4) {
		case 1:
		case 3:
			res = "남자";
			break;
		case 2:
		case 4:
			res = "여자";
			break;

		default:
			break;
		}
		System.out.println("결과 : " + res);

		// String k5이 한국이면 서울, 중국이면 북경, 일본이면 동경, 미국이면 워싱턴
		String k5 = "중국";
		switch (k5) {
		case "한국":
			res = "서울";
			break;
		case "중국":
			res = "북경";
			break;
		case "일본":
			res = "동경";
			break;
		case "미국":
			res = "워싱턴";
			break;
		default:
			break;
		}
		System.out.println("결과 : " + res);
		
		// int k6의 점수가 90이상이면 A, 80이상이면 B, 70이상이면 C, 나머지 F
		int k6 = 84;
		switch ((int)(k6/10)) {
		case 10:
		case 9:
			res = "A";
			break;
		case 8:
			res = "B";
			break;
		case 7:
			res = "C";
			break;

		default:
			res = "F";
			break;
		}
		System.out.println("결과 : " + res);

	}
}
