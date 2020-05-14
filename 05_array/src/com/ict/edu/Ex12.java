package com.ict.edu;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[5][5];
		
		for (int i = 0; i < arr.length; i++) {
				
				int[] ar = new int[5];
			
				System.out.println("번호: ");
				int no = sc.nextInt();			    
				System.out.println("국어점수: ");
			    int kor = sc.nextInt();
			    System.out.println("영어점수: ");
			    int eng = sc.nextInt();
			    System.out.println("수학점수: ");
			    int math = sc.nextInt();
			    
			    ar[0] = no;
			    ar[1] = kor + eng + math;
			    ar[2] = (int)(ar[1]/3.0 * 10)/10;
			    
			    if(ar[2] >= 90) {
			    	ar[3] = 'A';
			    } else if(ar[2] >= 80) {
			    	ar[3] = 'B';
			    } else if(ar[2] >= 70) {
			    	ar[3] = 'C';
			    } else {
			    	ar[3] = 'F';
			    }
			    
			    ar[4] = 1;
			    
			    arr[i] = ar;
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
