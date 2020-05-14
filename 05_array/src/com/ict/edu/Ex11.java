package com.ict.edu;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[5][5];
		
		for (int i = 0; i < arr.length; i++) {
				System.out.println("번호: ");
				int no = sc.nextInt();
			    
				System.out.println("국어점수: ");
			    int kor = sc.nextInt();
			    System.out.println("영어점수: ");
			    int eng = sc.nextInt();
			    System.out.println("수학점수: ");
			    int math = sc.nextInt();
			    
			    int sum = kor + eng + math;
			    
			    int avr = (int)(sum/3.0 * 10)/10;
			    
			    int hak = 0;
			    if(avr >= 90) {
			    	hak = 'A';
			    } else if(avr >= 80) {
			    	hak = 'B';
			    } else if(avr >= 70) {
			    	hak = 'C';
			    } else {
			    	hak = 'F';
			    }
			    
			    int rank = 1;
			    
			    arr[i][0] = no;
			    arr[i][1] = sum;
			    arr[i][2] = avr;
			    arr[i][3] = hak;
			    arr[i][4] = rank;
		} // for
		
		// 순위구하기
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i][1] < arr[j][1]) {
					arr[i][4]++;
				}
			}
		}
		
		// 정렬하기
		int[] temp = new int[5];
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i][4] > arr[j][4]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		/*
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i][4] > arr[j][4]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		*/
		
		// 출력
		System.out.println("번 호\t총 점\t평 균\t학 점\t순위");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(j == 3) {
					System.out.print((char)arr[i][j]+"\t");
				} else {
					System.out.print(arr[i][j]+"\t");	
				}
			
			}
			System.out.println();
		}
	}
}
