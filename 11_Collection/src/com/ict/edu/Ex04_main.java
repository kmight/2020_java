package com.ict.edu;

import java.util.HashSet;
import java.util.Scanner;

public class Ex04_main {
	public static void main(String[] args) {

		int kor = 0;
		int eng = 0;
		int math = 0;
		
		Scanner sc = new Scanner(System.in);
		Ex04[] arr = new Ex04[3];
		
		for (int i = 0; i < 3; i++) {
			
			Ex04 e4 = new Ex04();
			
			System.out.println("이름 : ");
			e4.setName(sc.next());
			System.out.println("국어점수 : ");
			kor = sc.nextInt();
			System.out.println("영어점수 : ");
			eng = sc.nextInt();
			System.out.println("수학점수 : ");
			math = sc.nextInt();
			
			e4.s_sum(kor, eng, math);
			e4.s_avg();
			e4.s_hak();
			
            arr[i] = e4;
		} // for
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i].getSum() < arr[j].getSum()) {
					arr[i].setRank(arr[i].getRank() + 1);
				}
			}
		}
		
		HashSet<Ex04> set4 = new HashSet<Ex04>();
		
		for (int i = 0; i < arr.length; i++) {
			set4.add(arr[i]);	
		}
		
		System.out.println("이 름\t총 점\t평 균\t학 점\t순 위");
		for (Ex04 k : set4) {
			System.out.print(k.getName() + "\t");
			System.out.print(k.getSum() + "\t");
			System.out.print(k.getAvg() + "\t");
			System.out.print(k.getHak() + "\t");
			System.out.println(k.getRank());
		}
		
	}
}

















