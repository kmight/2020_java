package com.ict.edu;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		int[] sum = new int[5];
		int[] avr = new int[5];
		char[] hak = new char[5];
		int[] rank = {1, 1, 1, 1, 1};
		
		for (int i = 0; i < name.length; i++) {
			System.out.println("이름: ");
			name[i] = sc.next();
			System.out.println("국어점수: ");
			kor[i] = sc.nextInt();
			System.out.println("영어점수: ");
			eng[i] = sc.nextInt();
			System.out.println("수학점수: ");
			math[i] = sc.nextInt();
			
			sum[i] = kor[i] + eng[i] + math[i];
			avr[i] = (int)(sum[i]/3.0 * 10)/10;
			if(avr[i] >= 90) {
				hak[i] = 'A';
			} else if(avr[i] >= 80) {
				hak[i] = 'B';
			} else if(avr[i] >= 70) {
				hak[i] = 'C';
			} else {
				hak[i] = 'F';
			} // if
		}
		
		for (int i = 0; i < name.length; i++) {
			for (int j = 0; j < name.length; j++) {
				if(avr[i] < avr[j]) {
					rank[i]++;
				}
			}
		}
		
		System.out.println("이 름\t총 점\t평 균\t학 점\t순 위");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + "\t");
			System.out.print(sum[i] + "\t");
			System.out.print(avr[i] + "\t");
			System.out.print(hak[i] + "\t");
			System.out.println(rank[i] + "\t");
		}
	}
}
