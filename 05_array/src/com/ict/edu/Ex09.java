package com.ict.edu;

public class Ex09 {
	public static void main(String[] args) {
		// 다차원 배열; 1차원 배열이 여러개 모인 것
		// 가변길이 : 1차원 배열 안에 존재하는 배열의 수가 일정하지 않음
		
		// 선언 : 자료형[][] 이름;
		// 생성 : 이름 = new 자료형[1차원배열의 수][]
		
		// 선언과 생성을 한번에 :
		// 자료형[][] 이름 = new 자료형[1차원배열의 수]
		
		char[][] ch = new char[3][];
		
		// 데이터 저장(고정길이에서만 가능)
		/* 가변길이에서는 오류 발생
		ch[0][0] = 'a';
		ch[0][1] = 'A';
		
		ch[1][0] = 'b';
		ch[1][1] = 'B';
		
		ch[2][0] = 'c';
		ch[2][1] = 'C';
		*/
		
	    char[] k1 = {'j','a','v','a'};
	    char[] k2 = {'j','s','p'};
	    char[] k3 = {'a','n','d','r','o','i','d'};
		
	    ch[0] = k1;
	    ch[1] = k2;
	    ch[2] = k3;	    
	    
        // 출력하기
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch[i].length; j++) {
				System.out.print(ch[i][j]);
			}
			System.out.println();
		}
		System.out.println("=========================");
		
	}
}
