package com.ict.edu;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		esc : while(true) {
			System.out.println("이름 : ");
			String name = sc.next();
			System.out.println("국어점수 : ");
			int korean = sc.nextInt();
			System.out.println("수학점수 : ");
			int math = sc.nextInt();
			System.out.println("영어점수 : ");
			int english = sc.nextInt();
			
			// 정보가공
			int total = korean + math + english;
			//double avr = total/3;
			double avr = (int)(total/3.0*10)/10.0; // 주의: 실수화
			char score = 'F';
			if(avr >= 90) {
				score = 'A';
			} else if(avr >= 80) {
				score = 'B';
			} else if(avr >= 70) {
				score = 'C';
			} else {
				score = 'F';
			}
			
			// 정보출력
			System.out.println("이름 : " + name);
			System.out.println("총점 : " + total);
			System.out.println("평균 : " + avr);
			System.out.println("학점 : " + score);
			
			while(true) {
				System.out.println("계속하시겠습니까?(1.계속 2.그만)");
				int ys = sc.nextInt();
				if(ys == 1) {
					continue esc;
				} else if(ys == 2) {
					break esc;
				} else {
					System.out.println("제대로 입력하세요!");
				    continue;
				}
			} // while
			
		} // while esc
		System.out.println("수고하셨습니다.");
	}
}
