package com.ict.edu;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int pay = sc.nextInt();
		
		System.out.print("메뉴 : 1. 커피음료 (3,500원)");
		System.out.println();
		System.out.print("       2. 이온음료 (2,500원)");
		System.out.println();
		System.out.print("       3. 물 (1,500원)");
		System.out.println();
		System.out.print("       4. 과일쥬스 (4,000원)");
		System.out.println();
		
		System.out.println("메뉴를 선택하세요(단, 부가세 포함) : ");
		
		System.out.println("선택한 음료 : ");
		System.out.println("입금액 : ");
		System.out.println("잔돈 : ");
	} // main
} // class
