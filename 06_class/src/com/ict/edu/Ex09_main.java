package com.ict.edu;

import java.util.Scanner;

public class Ex09_main {
	public static void main(String[] args) {
		// 5명의 이름, 국어, 영어, 수학을 입력받아서
		// 이름, 총점, 평균, 학점, 순위를 구하고 정렬하자
		// 순위와 정렬은 main에서 구함
		
		Scanner sc = new Scanner(System.in);
		
		// 한 사람의 정보를 가지고 있는 클래스가 Ex09이다
		// 5명의 정보를 가질 수 있는 배열을 만들자
		Ex09[] arr = new Ex09[5];
		
		for (int i = 0; i < arr.length; i++) {
			// ** 지역이므로 person은 for문이 돌때마다 생겼다가 사라진다
			Ex09 person = new Ex09();
			System.out.println("이름 : ");
			// String name = sc.next();
			// person.setName(name)
			person.setName(sc.next());
			
			System.out.println("국어점수 : ");
			int kor = sc.nextInt();
			System.out.println("영어점수 : ");
			int eng = sc.nextInt();
			System.out.println("수학점수 : ");
			int math = sc.nextInt();
			// 합계
			person.s_sum(kor, eng, math);
			// 평균
			person.s_avg();
			// 학점
			person.s_hak();
			
			arr[i] = person;
		} // for
		
		// 순위와 정렬, 출력
		// 순위
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i].getSum() < arr[j].getSum()) {
					// int k = arr[i].getRank();
					// arr[i].setRank(++k);
					arr[i].setRank(arr[i].getRank() + 1);
				}
			}
		}
		// 정렬
		int temp = 0;
		for (int i = 0; i < arr.length -1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i].getRank() > arr[j].getRank()) {
					temp = arr[i].getRank();
					arr[i].setRank(arr[j].getRank());
					arr[j].setRank(temp);
				}
			}
		}
		
		// 출력
		System.out.println("이 름\t총 점\t평 균\t학 점\t순위");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].getName()+"\t");
			System.out.print(arr[i].getSum()+"\t");
			System.out.print((int)(arr[i].getAvg())+"\t");
			System.out.print(arr[i].getHak()+"\t");
			System.out.println(arr[i].getRank()+"\t");
		}

		
		
/*
		int kor = 0;
		int eng = 0;
		int math = 0;
		Scanner sc = new Scanner(System.in);
		
		Ex09 t1 = new Ex09();
			System.out.println("이름:");
			t1.setName(sc.next());
			System.out.println("국어점수:");
			kor = sc.nextInt();
			System.out.println("영어점수:");
			eng = sc.nextInt();
			System.out.println("수학점수:");
			math = sc.nextInt();
			
			t1.s_sum(kor,eng,math);
		    t1.s_avg();
		    t1.s_hak();
		    
		Ex09 t2 = new Ex09();
			System.out.println("이름:");
			t2.setName(sc.next());
			System.out.println("국어점수:");
			kor = sc.nextInt();
			System.out.println("영어점수:");
			eng = sc.nextInt();
			System.out.println("수학점수:");
			math = sc.nextInt();
			
			t2.s_sum(kor,eng,math);
		    t2.s_avg();
		    t2.s_hak();	
		    
		Ex09 t3 = new Ex09();
			System.out.println("이름:");
			t3.setName(sc.next());
			System.out.println("국어점수:");
			kor = sc.nextInt();
			System.out.println("영어점수:");
			eng = sc.nextInt();
			System.out.println("수학점수:");
			math = sc.nextInt();
			
			t3.s_sum(kor,eng,math);
		    t3.s_avg();
		    t3.s_hak();
		    
		Ex09 t4 = new Ex09();
			System.out.println("이름:");
			t4.setName(sc.next());
			System.out.println("국어점수:");
			kor = sc.nextInt();
			System.out.println("영어점수:");
			eng = sc.nextInt();
			System.out.println("수학점수:");
			math = sc.nextInt();
			
			t4.s_sum(kor,eng,math);
		    t4.s_avg();
		    t4.s_hak();
		    
		Ex09 t5 = new Ex09();
			System.out.println("이름:");
			t5.setName(sc.next());
			System.out.println("국어점수:");
			kor = sc.nextInt();
			System.out.println("영어점수:");
			eng = sc.nextInt();
			System.out.println("수학점수:");
			math = sc.nextInt();
			
			t5.s_sum(kor,eng,math);
		    t5.s_avg();
		    t5.s_hak();

		Ex09[] arr = {t1, t2, t3, t4, t5};
		
		System.out.println("이 름\t총 점\t평 균\t학 점\t순 위");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].getName()+"\t");
			System.out.print(arr[i].getSum()+"\t");
			System.out.print(arr[i].getAvg()+"\t");
			System.out.print(arr[i].getHak()+"\t");
			System.out.print(arr[i].getRank()+"\t");
		}
		System.out.println();
*/		
	} // main
} // class