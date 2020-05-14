package com.ict.edu;

import java.util.Scanner;

public class Ex09_main {
	public static void main(String[] args) {
		// 5명의 이름, 국어, 영어, 수학을 입력받아서
		// 이름, 총점, 평균, 학점, 순위를 구하고 정렬하자

		String name = "";
		int kor = 0;
		int eng = 0;
		int math = 0;
		int sum = 0;
		int avg = 0;
		String hak = "";
		int rank = 1;
		
		Ex09 t1 = new Ex09();
		Ex09 t2 = new Ex09();
		Ex09 t3 = new Ex09();
		Ex09 t4 = new Ex09();
		Ex09 t5 = new Ex09();
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("이름:");
			name = sc.next();
			System.out.println("국어점수:");
			kor = sc.nextInt();
			System.out.println("영어점수:");
			eng = sc.nextInt();
			System.out.println("수학점수:");
			math = sc.nextInt();
			
			sum = kor + eng + math;
			avg = (int)((sum/3.0 * 10)/10.0);
		}
		
	} // main
} // class
