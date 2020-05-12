package com.ict.edu;

public class Ex05 {
	public static void main(String[] args) {
		String[] name = {"홍", "김", "이", "박", "고"};
		int[] kor = {80, 90, 80, 70, 100};
		int[] eng = {80, 95, 85, 70, 100};
		int[] math = {100, 100, 100, 100, 100};
		
		int[] sum = new int[5];
		double[] avr = new double[5];
		String[] hak = new String[5];
		int[] rank = {1, 1, 1, 1, 1};
		
		// 총점, 평균, 학점
		for (int i = 0; i < name.length; i++) {
			// 총점
			sum[i] = kor [i] + eng[i] + math[i];
			// 평균
			avr[i] = (int)(sum[i]/3.0*10)/10.0;
			
			if (avr[i] >= 90) {
				hak[i] = "A";		
			} else if (avr[i] >= 80) {
				hak[i] = "B";		
			} else if (avr[i] >= 70) {
				hak[i] = "C";		
			} else {
				hak[i] = "F";		
			}
		} // for
		
		// rank
		for (int i = 0; i < name.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if (sum[i] < sum[j]) {
					rank[i] ++;
				}
			}
		}
		
		// 출력
		System.out.println("이 름\t총 점\t평 균\t학 점\t순 위");		
		for (int i = 0; i < name.length; i++) {
			/*
			System.out.println(name[i] + " " 
		                    + " 총점: " + sum[i] 
		                    + " 평균: " + avr[i] 
		                    + " 학점:" + hak[i] + " " 
		                    + rank[i] + "위");
		                    */
			System.out.print(name[i]+"\t");
			System.out.print(sum[i]+"\t");
			System.out.print(avr[i]+"\t");
			System.out.print(hak[i]+"\t");
			System.out.println(rank[i]+"\t");
		}
		
	}
}
