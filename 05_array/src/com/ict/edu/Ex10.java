package com.ict.edu;

public class Ex10 {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		
		//         {번호, 총점, 평균, 학점, 순위}
		int[] p1 = {1, 270, 90, 'A', 1};
		int[] p2 = {2, 210, 70, 'C', 1};
		int[] p3 = {3, 180, 60, 'F', 1};
		int[] p4 = {4, 300, 100, 'A', 1};
		int[] p5 = {5, 285, 95, 'A', 1};
		
		arr[0] = p1;
		arr[1] = p2;
		arr[2] = p3;
		arr[3] = p4;
		arr[4] = p5;
		
		// 순위 구하기
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i][1] < arr[j][1]) {
					arr[i][4]++;
				}
			}
		}

		// 출력
		System.out.println("번 호\t총 점\t평 균\t학 점\t순 위");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(j == 3) {
					System.out.print((char)arr[i][j] + "\t");
				} else {
					System.out.print(arr[i][j] + "\t");
				}
			}
			System.out.println();
			//System.out.println(arr[i][4]);
		}		
		System.out.println("=========================================");
		
		// 정렬하기
		int[] temp = new int[5];
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i][1] > arr[j][1]) {
					/*
					temp = arr[i][1];
					arr[i][1] = arr[j][1];
					arr[j][1] = temp;
				    */					
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;					
					//System.out.println(arr[i]);
				}
			}
		}
		
		// 출력
		System.out.println("번 호\t총 점\t평 균\t학 점\t순 위");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(j == 3) {
					System.out.print((char)arr[i][j] + "\t");
				} else {
					System.out.print(arr[i][j] + "\t");
				}
			}
			System.out.println();
			//System.out.println(arr[i][4]);
		}
		System.out.println("=========================================");
		
	}
}
